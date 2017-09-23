import java.lang.IllegalArgumentException;

/**
 * Implements a Pizza class as ProdutoNaoDuravel subclass.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Pizza extends ProdutoNaoDuravel
{
	// A pizza size.
	private String tamanho;
	// A pizza stuffing.
	private String recheio;

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
	 * @param tamanho Size of the pizza product. (P, M, G, GG)
	 * @param recheio Stuffing on pizza product. (Mossarella, Calabresa, Portuguesa, 4 Queijos, Chocolate).
	 */ 
	public Pizza(  String id
						, String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero
						, String tamanho
						, String recheio ) throws IllegalArgumentException, Exception
	{

		super( id, nome, preco, marca, descricao, data_de_fabr, data_de_valid, genero );
			
		setTamanho( tamanho );
		setRecheio( recheio );
	
	}

	// Gets and Sets methods.
	

	/**
	 * Sets the pizza's size.
	 *
	 * @param tamanho The pizza's size.
	 *
	 * @throws IllegalArgumentException if tamanho is null.
	 */
	public void setTamanho( String tamanho ) throws IllegalArgumentException
	{
		if ( tamanho != null )
		{
			this.tamanho = tamanho;
		} else 
		{
			throw new IllegalArgumentException( "Pizza's size can't be null!!");
		}
	}


	/**
	 * Gets the pizza's size.
	 *
	 * @return The pizza's size.
	 */
	public String getTamanho()
	{
		return tamanho;
	}


	/**
	 * Sets the pizza's stuffing.
	 *
	 * @param recheio The pizza's stuffing.
	 *
	 * @throws IllegalArgumentException if recheio is null.
	 */
	public void setRecheio( String recheio ) throws IllegalArgumentException
	{
		if ( recheio != null )
		{
			this.recheio = recheio;
		} else 
		{
			throw new IllegalArgumentException( "Pizza's stuffing can't be null!!");
		}
	}


	/**
	 * Gets the pizza's stuffing.
	 *
	 * @return The pizza's stuffing.
	 */
	public String getRecheio()
	{
		return recheio;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>> Pizza <<\n" + super.toString()
								   + "\nTamanho : " + getTamanho()
								   + "\nRecheio : " + getRecheio();
	}

}