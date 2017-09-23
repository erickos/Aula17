import java.lang.IllegalArgumentException;

/**
 * Implements a Chocolate class as ProdutoNaoDuravel subclass.
 * 
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Chocolate extends ProdutoNaoDuravel
{
	// Choco's exclusives atributes.
	private String forma; // Barra, Ovo, Bombom.
	private String tipo;  // Branco, Ao leite, Amargo, Com castanha.

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
	 * @param forma Mold of the choco product (Barra, Ovo, Bombom)
	 * @param tipo Type of choco product (Branco, Ao leite, Amargo, Com castanha).
	 */ 
	public Chocolate( String id
						, String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero 
						, String forma
						, String tipo         ) throws IllegalArgumentException, Exception
	{

		super( id, nome, preco, marca, descricao, data_de_fabr, data_de_valid, genero );
		setForma( forma );
		setTipo( tipo );
		
	}

	// Gets and Sets methods.
	 
	
	/**
	 * Sets the mold of the choco.
	 *
	 * @param forma The choco's form.
	 *
	 * @throws IllegalArgumentException if forma is null.
	 */
	public void setForma( String forma ) throws IllegalArgumentException
	{
		if ( forma != null )
		{
			this.forma = forma;
		} else 
		{
			throw new IllegalArgumentException( "Chocolate Mold can't be null!!" );
		}
	}


	/**
	 * Gets the choco's mold.
	 *
	 * @return  The choco's mold.
	 */
	public String getForma()
	{
		return forma;
	}


	/**
	 * Sets the choco's type.
	 *
	 * @param tipo The choco's type.
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
			throw new IllegalArgumentException( "Chocolate Type can't be null!!" );
		}
	}


	/**
	 * Gets the choco's type.
	 *
	 * @return The choco's type.
	 */
	public String getTipo()
	{
		return tipo;
	}


	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>> Chocolate <<\n" + super.toString()
								   + "\nForma : " + getForma()
								   + "\nTipo de Chocolate : " + getTipo();
	}
}
