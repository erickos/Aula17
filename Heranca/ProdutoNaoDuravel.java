import java.lang.IllegalArgumentException;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.lang.Exception;
/**
 * Implements a ProdutoNaoDuravel as a Produto subclass.
 * ProdutoNaoDuravel has id, name, price, brand, manufacture date, 
 * expire date and a genre.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
abstract public class ProdutoNaoDuravel extends Produto
{
	// Expire date of the product.
	private String data_de_valid;
	// Genre of the product.
	private String genero;

	/**
	 * Default constructor.
	 *
	 * @param id Id of the product.
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param data_de_valid Expire date of the non-durable product.
	 * @param genero Genre of the non-durable product.
	 */ 
	public ProdutoNaoDuravel( String id
						, String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero ) throws IllegalArgumentException, Exception
	{
		super( id, nome, preco, marca, descricao, data_de_fabr );


		setDataDeValid( data_de_valid );
		setGenero( genero );

	}

	// Gets and Sets methods.
	 
	
	/**
	 * Sets the product's expire date.
	 *
	 * @param data_de_valid The ProdutoNaoDuravel expire date.
	 *
	 * @throws IllegalArgumentException if data_de_valid is null.
	 * @throws Exception if data_de_valid isn't in the format (dd/mm/yyyy).
	 */
	public void setDataDeValid( String data_de_valid ) throws IllegalArgumentException, Exception
	{

		if ( data_de_valid != null )
		{
			// Test for expire date format.
			try 
			{
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				Calendar cal = Calendar.getInstance();
				cal.setTime( df.parse( data_de_valid ) );

				this.data_de_valid = data_de_valid;
			} catch ( Exception e )
			{
				System.out.println( e );
				throw new Exception( "Expire Date must be in the format (dd/MM/yyyy)" );
				
			}

		} else 
		{
			throw new IllegalArgumentException( "Expire Date can't be null!!" );
		}
	}


	/**
	 * Gets the product's expire date.
	 *
	 * @return The product's expire date.
	 */
	public String getDataDeValid()
	{
		return data_de_valid;
	}

	/**
	 * Sets the product's genre.
	 *
	 * @param data_de_valid The ProdutoNaoDuravel expire date.
	 *
	 * @throws IllegalArgumentException if data_de_valid is null.
	 */
	public void setGenero( String genero ) throws IllegalArgumentException
	{
		if ( genero != null )
		{
			this.genero = genero;
		} else 
		{
			throw new IllegalArgumentException( "Gender can't be null!!" );
		}
	}


	/**
	 * Gets the product's genre.
	 *
	 * @return The product's genre.
	 */
	public String getGenero()
	{
		return genero;
	}
	

	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\nData de Validade : " + getDataDeValid()
					+ "\nGenero : " + getGenero();
	}

	/**
	 * Verify if the product can be sold.
	 * The product can be sold if the actual date is before the expire date.
	 * 
	 * @return true if can be sold, false in otherwise.
	 */
	public boolean podeSerVendido()
	{
		Calendar data_atual = Calendar.getInstance();

		return estaNaValidade( data_atual );
	}

	
	/**
	 * Verify if the product is expired.
	 *
	 * @param data_atual The Calendar object of this moment date.
	 *
	 * @return true if the data_atual is after the expire date, false in otherwise
	 */
	public boolean estaNaValidade( Calendar data_atual )
	{
		// Creating a Calendar object to bring the expire date.
		Calendar data_valid = Calendar.getInstance();

		try 
		{
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
			// Expire date in Calendar format.
			data_valid.setTime( df.parse( getDataDeValid() ) );

		} catch ( Exception e )
		{
			e.getMessage();
		}
		
		return data_valid.after( data_atual );
	}

}

