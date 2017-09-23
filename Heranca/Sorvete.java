import java.lang.IllegalArgumentException;

	
/**
 * Implements a Sorvete class, representation of a ice cream, as a ProdutoNaoDuravel subclass.
 * Sorvete have a id, name, price, brand, description, manufacture date, expire date, genre, flavor and quantity.
 * 
 * @author Erick de Oliveira Silva
 * @version 2017.09.22
 */
public class Sorvete extends ProdutoNaoDuravel
{
	// A ice cream flavor
	private String sabor;
	// A ice cream package quantity, in mililiters.
	private int quantidade;

	// Constant 
	private static final int MIN_QUANTIDADE = 100;

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
	 * @param sabor Ice cream flavor.
	 * @param quantidade Ice cream quantity.
	 */ 
	public Sorvete( String id
						, String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero
						, String sabor
						, int quantidade 		) throws IllegalArgumentException, Exception
	{
		super( id, nome, preco, marca, descricao, data_de_fabr, data_de_valid, genero );

		setSabor( sabor );
		setQuantidade( quantidade );

	}


	/**
	 * Sets the ice cream flavor.
	 *
	 * @param sabor The ice cream flavor.
	 *
	 * @throws IllegalArgumentException if sabor is null.
	 */
	public void setSabor( String sabor ) throws IllegalArgumentException
	{
		if( sabor != null )
		{
			this.sabor = sabor;
		} else 
		{
			throw new IllegalArgumentException( "Flavor can't be null!!" );
		}
	}


	/**
	 * Gets the ice cream.
	 *
	 * @return The ice cream flavor.
	 */
	public String getSabor()
	{
		return sabor;
	}


	/**
	 * Sets the ice cream quantity.
	 *
	 * @param  quantidade The ice cream quantity.
	 *
	 * @throws  IllegalArgumentException if quantidade 
	 */
	public void setQuantidade( int quantidade ) throws IllegalArgumentException
	{
		if( quantidade >= MIN_QUANTIDADE )
		{
			this.quantidade = quantidade;
		} else 
		{
			throw new IllegalArgumentException( "Quantity can't be smaller than " + MIN_QUANTIDADE );
		}
	}


	/**
	 * Gets the ice cream quantity.
	 *
	 * @return  The ice cream quantity.
	 */
	public int getQuantidade()
	{
		return quantidade;
	}

	
	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>> Sorvete <<\n" + super.toString()
								   + "\nSabor : " + getSabor()
								   + "\nQuantidade : " + getQuantidade();
	}
}