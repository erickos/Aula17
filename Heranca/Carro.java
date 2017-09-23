import java.lang.IllegalArgumentException;
import java.lang.Exception;

/**
 * Implements a Carro class as ProdutoDuravel subclass.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Carro extends ProdutoDuravel
{
	// Car's exclusive atributes.
	private int ano;
	private String tipo; // Sedan, Esportivo, Conversivel, Hatch.

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
	 * @param ano Year of the car product.
	 * @param tipo Type of car product (Sedan, Esportivo, Conversivel, Hatch).
	 */ 
	public Carro(  String id
				,  String nome
				,  double preco
				,  String marca
				,  String descricao
				,  String data_de_fabr
				,  String material_pred
				,  int    durabilidade
				,  int    ano
				,  String tipo
				,  boolean avaria ) throws IllegalArgumentException, Exception
	{

		super( id, nome, preco, marca, descricao, data_de_fabr, material_pred, durabilidade, avaria );
	
		setAno( ano );
		setTipo( tipo );


	}

	// Gets and Sets methods.
	

	/**
	 * Sets the car's model year.
	 *
	 * @param ano The model year of the car.
	 *
	 * @throws IllegalArgumentException if ano smaller then 1900.
	 */
	public void setAno( int ano ) throws IllegalArgumentException
	{
		if ( ano > 1900 )
		{
			this.ano = ano;
		} else 
		{
			throw new IllegalArgumentException( "Year can't be smaller than 1900!!" );
		}
	}


	/**
	 * Gets the car's model year.
	 *
	 * @return The model year of the car.
	 */
	public int getAno()
	{
		return ano;
	}


	/**
	 * Sets the car's type.
	 *
	 * @param tipo The car's type.
	 *
	 * @throws IllegalArgumentException if tipo is null.
	 */
	public void setTipo( String tipo ) throws IllegalArgumentException
	{
		if ( tipo != null )
		{
			this.tipo = tipo;
		} else 
		{
			throw new IllegalArgumentException( "Type can't be null!!" );
		}
	}


	/**
	 * Gets the car's type.
	 *
	 * @return The car's type.
	 */
	public String getTipo()
	{
		return tipo;
	}


	/**
	 * Verify if the product is electronic.
	 *
	 * @return  true if the product is electronic, false in otherwise.
	 */
	public boolean ehEletronico()
	{
		// Car can be electronic or not.
		// That is why as default the cars with year model bigger or equal than 2014 are eletronic.
		
		return ( getAno() >= 2014 ); 
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	public String toString()
	{
		return "\n>> Carro <<\n" + super.toString()
								 + "\nAno : " +  getAno()
								 + "\nTipo : " + getTipo();
	}

}
