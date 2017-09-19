import java.lang.IllegalArgumentException;


/**
 * Implements a Refrigerante class as ProdutoNaoDuravel subclass.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Refrigerante extends ProdutoNaoDuravel
{

	private int qtd_litros; // Em ml.
	private String tipo;    // Diet, light, normal.

	private static int min_qtd_litros = 150;

	/**
	 * Default constructor.
	 *
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param data_de_valid Expire date of the non-durable product.
	 * @param genero Genre of the non-durable product.
	 * @param qtd_litros Quantity of mililiters on soda product.
	 * @param tipo Type of soda product (Light, Diet, Normal).
	 */ 
	public Refrigerante( String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero
						, int    qtd_litros
						, String tipo         ) throws IllegalArgumentException
	{
		super( nome, preco, marca, descricao, data_de_fabr, data_de_valid, genero );

		if ( qtd_litros >= min_qtd_litros && tipo != null )
		{
			this.qtd_litros = qtd_litros;
			this.tipo = tipo;
		} else 
		{
			throw new IllegalArgumentException( "Quantity of liters can't be smaller than the minimum default value ("+ min_qtd_litros +" ml) or Type can't be null" );
		}
	}


	// Gets and Sets methods.
	public void setQtdLitros( int qtd_litros ) throws IllegalArgumentException
	{
		if ( qtd_litros >= min_qtd_litros )
		{
			this.qtd_litros = qtd_litros;
		} else 
		{
			throw new IllegalArgumentException( "Quantity of liters can't be smaller than the minimum default value ("+ min_qtd_litros +" ml)!!");
		}
	}

	public int getQtdLitros()
	{
		return qtd_litros;
	}

	public void setTipo( String tipo ) throws IllegalArgumentException
	{
		if ( tipo != null )
		{
			this.tipo = tipo;
		} else 
		{
			throw new IllegalArgumentException( "Soda Type can't be null!!");
		}
	}

	public String getTipo()
	{
		return tipo;
	}
}