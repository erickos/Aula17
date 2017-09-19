import java.lang.IllegalArgumentException;

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
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param material_pred Predominant material of the durable product.
	 * @param durabilidade Durability, in years, of the durable product.
	 * @param ano Year of the car product.
	 * @param tipo Type of car product (Sedan, Esportivo, Conversivel, Hatch).
	 */ 
	public Carro(  String nome
				,  double preco
				,  String marca
				,  String descricao
				,  String data_de_fabr
				,  String material_pred
				,  int    durabilidade
				,  int    ano
				,  String tipo ) throws IllegalArgumentException
	{

		super( nome, preco, marca, descricao, data_de_fabr, material_pred, durabilidade );
		if ( ano > 1900 && tipo != null )
		{
			this.ano = ano;
			this.tipo = tipo;
		} else 
		{
			throw new IllegalArgumentException( "Year can't be smaller than 1900 or Type can't be null!!" );
		}

	}

	// Gets and Sets methods.
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

	public int getAno()
	{
		return ano;
	}

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

	public String getTipo()
	{
		return tipo;
	}

}
