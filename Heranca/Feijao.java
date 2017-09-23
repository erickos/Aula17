import java.lang.IllegalArgumentException;
import java.lang.Exception;

/**
 * Implements a ProdutoNaoDuravel as a Produto subclass.
 * ProdutoNaoDuravel has id, name, price, brand, manufacture date, 
 * expire date and a genre.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Feijao extends ProdutoNaoDuravel
{

	// The bean type .
	private String tipo; // (Preto, Carioca, verde, Branco)
	// The bean weight.
	private int peso; // In grams.
	                   
	// constant.
	private static final int MIN_PESO = 200;                  

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
	 * @param tipo Type of the bean.
	 * @param peso Weight of the bean package.
	 */ 
	public Feijao( 	String id
						, String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero	
						, String tipo
						, int peso		 ) throws IllegalArgumentException, Exception
	{
		super( id, nome, preco, marca, descricao, data_de_fabr, data_de_valid, genero );

		setTipo( tipo );
		setPeso( peso );
	}


	/**
	 * Sets the bean type.
	 *
	 * @param tipo The bean type.
	 *
	 * @throws IllegalArgumentException if tipo is null.
	 */
	public void setTipo( String tipo ) throws IllegalArgumentException
	{
		if( tipo != null )
		{
			this.tipo = tipo;
		} else 
		{
			throw new IllegalArgumentException( "Type can't be null!!" );
		}
	}

	/**
	 * Gets the bean type.
	 *
	 * @return The bean type.
	 */
	public String getTipo()
	{
		return tipo;
	}


	/**
	 * Sets the bean package weight.
	 *
	 * @param  peso The bean package weight.
	 *
	 * @throws  IllegalArgumentException if peso is smaller than MIN_PESO.
	 */
	public void setPeso( int peso ) throws IllegalArgumentException
	{
		if( peso >= MIN_PESO )
		{
			this.peso = peso;
		} else
		{
			throw new IllegalArgumentException( "Weight of package can't be smaller than " + MIN_PESO );
		}
	}


	/**
	 * Gets the bean package weight.
	 *
	 * @return The bean package weight.
	 */
	public int getPeso()
	{
		return peso;
	}

	
	/**
	 * Returns a string representation of the object.
	 *
	 * @return  String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>> Feijao <<\n" + super.toString()
								  + "\nTipo : " + getTipo()
								  + "\nPeso : " + getPeso();
	}

}