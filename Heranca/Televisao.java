import java.lang.IllegalArgumentException;
import java.text.*;
import java.util.Calendar;


/**
 * Implements a Televisao class, representing a TV, as ProdutoDuravel subclass.
 * A Televisao have a id, name, price, brand, manufacture date, predominant material, screen size, resolution.
 * 
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Televisao extends ProdutoDuravel
{
	// A tv's screen size, in inches.
	private int tamanho;
	// A tv's resolution.
	private String resolucao;
	// A tv's is smart or not.
	private boolean eh_smart;

	// A constant for minimum screen size.
	private static final int MIN_TAMANHO = 10;

	/**
	 * Default constructor.
	 *
	 * @param id Id of the product.
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param material_pred Predominant material of the durable product.
	 * @param durabilidade Durability, in years, of the durable product.
	 * @param avaria If the Product is damaged or not.
	 * @param tamanho Screen size, in inches.
	 * @param resolucao Resolution of the TV.
	 * @param eh_smart If the TV is a SmarTV.
	 * 
	 * @throws IllegalArgumentException if any parameter, except avaria and eh_smart, is invalid.
	 * @throws Exception if data_de_fabr isn't in date format(dd/MM/yyyy).
	 */ 
	public Televisao( String id
						, String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String material_pred
						, int    durabilidade 
						, boolean avaria
						, int tamanho     
						, String resolucao
						, boolean eh_smart 			) throws IllegalArgumentException, Exception
	{
		super( id, nome, preco, marca, descricao, data_de_fabr, material_pred, durabilidade, avaria );

		setTamanho( tamanho );
		setResolucao( resolucao );
		setEhSmart( eh_smart );
	}


	/**
	 * Sets the tv's screen size.
	 *
	 * @param tamanho The tv's screen size.
	 * 
	 * @throws IllegalArgumentException if tamanho is smaller than MIN_TAMANHO.
	 */
	public void setTamanho( int tamanho ) throws IllegalArgumentException
	{
		if ( tamanho >= MIN_TAMANHO )
		{
			this.tamanho = tamanho;
		} else 
		{
			throw new IllegalArgumentException( "Screen size can't be smaller than "+ MIN_TAMANHO );
		}
	}


	/**
	 * Gets the tv's screen size.
	 *
	 * @return  The tv's screen size.
	 */
	public int getTamanho()
	{
		return tamanho;
	}


	/**
	 * Sets the tv's resolution.
	 *	
	 * @paeam resolucao The tv's resolution.
	 *
	 * @throws  IllegalArgumentException if resolucao is null.
	 */
	public void setResolucao( String resolucao ) throws IllegalArgumentException
	{
		if ( resolucao != null )
		{
			this.resolucao = resolucao;
		} else 
		{
			throw new IllegalArgumentException( "Resolution can't be null" );
		}
	}


	/**
	 * Gets the tv's resolution.
	 *
	 * @return The tv's resolution.
	 */
	public String getResolucao()
	{
		return resolucao;
	}


	/**
	 * Sets if the tv is smart.
	 *
	 * @param  eh_smart If the tv is smart.
	 */
	public void setEhSmart( boolean eh_smart )
	{
		this.eh_smart = eh_smart;
	}


	/**
	 * Gets if the tv is smart.
	 *
	 * @return true if the tv is smart, false in otherwise.
	 */
	public boolean getEhSmart()
	{
		return eh_smart;
	}


	/**
	 * Return if the TV is electronic.
	 *
	 * @return true if the tv are made after 1980, false in otherwise.
	 */
	public boolean ehEletronico()
	{
		// Test for manufacture date format and test up the year.
			try 
			{
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				Calendar cal = Calendar.getInstance();
				cal.setTime( df.parse( getDataDeFabr() ) );

				if( cal.YEAR >= 1980 )
				{
					return true;
				}
				
			} catch ( Exception e )
			{
				System.out.println( e );
			}

		return false;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	@Override
	public String toString()
	{	
		// String repesentation for true or false.
		String smart = "Não";
		if ( getEhSmart() )
		{
			smart = "Sim";
		}

		return "\n>> Televisao <<\n" + super.toString()
									 + "\nTamanho da tela : " + getTamanho()
									 + "\nResolucao : " + getResolucao()
									 + "\nSmarTV : " + smart;
	}	
}