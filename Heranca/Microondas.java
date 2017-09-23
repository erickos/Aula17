import java.lang.IllegalArgumentException;
import java.text.*;
import java.util.Calendar;

/**
 * Implements a Microondas class, representing a TV, as ProdutoDuravel subclass.
 * A Microondas have a id, name, price, brand, manufacture date, predominant material, screen size, resolution.
 * 
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Microondas extends ProdutoDuravel
{
	// A Microondas's capacity, in liters.
	private int capacidade;
	// A Microondas's potency.
	private int potencia;
	// A Microondas's color.
	private String cor;

	// Microondas's minimum acceptable capacity.
	private static final int MIN_CAPACIDADE = 20;

	// Microondas's minimum acceptable potency.
	private static final int MIN_POTENCIA = 500;

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
	 * @param capacidade Microwaves's capacity in liters.
	 * @param potencia Microwaves's potency, in Watts.
	 * @param cor Microwaves's color.
	 * 
	 * @throws IllegalArgumentException if any parameter, except avaria, is invalid.
	 * @throws Exception if data_de_fabr isn't in date format(dd/MM/yyyy).
	 */ 
	public Microondas( String id
						, String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String material_pred
						, int    durabilidade 
						, boolean avaria
						, int capacidade    
						, int potencia
						, String cor 			) throws IllegalArgumentException, Exception
	{
		super( id, nome, preco, marca, descricao, data_de_fabr, material_pred, durabilidade, avaria );

		setCapacidade( capacidade );
		setPotencia( potencia );
		setCor( cor );
	}


	/**
	 * Sets the microwave's capacity.
	 *
	 * @param capacidade The microwave's capacity.
	 *
	 * @throws IllegalArgumentException if capacidade is smaller than MIN_CAPACIDADE.
	 */
	public void setCapacidade( int capacidade ) throws IllegalArgumentException
	{
		if( capacidade >= MIN_CAPACIDADE )
		{
			this.capacidade = capacidade;
		} else 
		{
			throw new IllegalArgumentException( "Capacity can't be smaller than " + MIN_CAPACIDADE + " liters" );
		}
	}


	/**
	 * Gets the microwave's capacity.
	 *
	 * @return  The microwave's capacity.
	 */
	public int getCapacidade()
	{
		return capacidade;
	}


	/**
	 * Sets the microwave's potency.
	 *
	 * @param  potencia  The microwave's potency.
	 *
	 * @throws  IllegalArgumentException if potencia is smaller than MIN_POTENCIA.
	 */
	public void setPotencia( int potencia ) throws IllegalArgumentException
	{
		if ( potencia >= MIN_POTENCIA )
		{
			this.potencia = potencia;
		} else 
		{
			throw new IllegalArgumentException( "Potency can't be smaller than " + MIN_POTENCIA + "W" );
		}
	}


	/**
	 * Gets the microwave's potency.
	 *
	 * @return The microwave's potency.
	 */
	public int getPotencia()
	{
		return potencia;
	}


	/**
	 * Sets the microwave's color.
	 *
	 * @param cor The microwave's color.
	 *
	 * @throws IllegalArgumentException if cor is null.
	 */
	public void setCor( String cor ) throws IllegalArgumentException
	{
		if( cor != null )
		{
			this.cor = cor;
		} else 
		{
			throw new IllegalArgumentException( "Color can't be null" );
		}
	}


	/**
	 * Gets the microwave's color.
	 *
	 * @return  The microwave's color.
	 */
	public String getCor()
	{
		return cor;
	}


	/**
	 * Returns if the Microondas is electronic.
	 *
	 * @return true if the year of manufacture is 1980 or bigger, false in otherwise.
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
	 * @return     String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>> Microondas <<\n" + super.toString()
									  + "\nCapacidade : " + getCapacidade()
									  + "\nPotencia : " + getPotencia()
									  + "\nCor : " + getCor();
	}
}