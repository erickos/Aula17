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
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param data_de_valid Expire date of the non-durable product.
	 * @param genero Genre of the non-durable product.
	 * @param forma Mold of the choco product (Barra, Ovo, Bombom)
	 * @param tipo Type of choco product (Branco, Ao leite, Amargo, Com castanha).
	 */ 
	public Chocolate( String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero 
						, String forma
						, String tipo         ) throws IllegalArgumentException
	{

		super( nome, preco, marca, descricao, data_de_fabr, data_de_valid, genero );

		if( forma != null && tipo != null )
		{
			this.forma = forma;
			this.tipo  = tipo;
		} else 
		{
			throw new IllegalArgumentException( "Chocolate Mold or Type can't be null!!" );
		}

	}

	// Gets and Sets methods.
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

	public String getForma()
	{
		return forma;
	}

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

	public String getTipo()
	{
		return tipo;
	}
}
