import java.lang.IllegalArgumentException;

/**
 * Implements a ProdutoNaoDuravel as a Produto subclass.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
abstract public class ProdutoNaoDuravel extends Produto
{

	private String data_de_valid;
	private String genero;

	/**
	 * Default constructor.
	 *
	 * @param ID Id of the product.
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param data_de_valid Expire date of the non-durable product.
	 * @param genero Genre of the non-durable product.
	 */ 
	public ProdutoNaoDuravel( String id
						, String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero ) throws IllegalArgumentException
	{
		super( id, nome, preco, marca, descricao, data_de_fabr );


		setDataDeValid( data_de_valid );
		setGenero( genero );

	}

	// Gets and Sets methods.
	public void setDataDeValid( String data_de_valid ) throws IllegalArgumentException
	{
		if ( data_de_valid != null )
		{
			this.data_de_valid = data_de_valid;
		} else 
		{
			throw new IllegalArgumentException( "Date can't be null!!" );
		}
	}

	public String getDataDeValid()
	{
		return data_de_valid;
	}

	public void setGenero( String genero ) throws IllegalArgumentException
	{
		if ( genero != null )
		{
			this.genero = genero;
		} else 
		{
			throw new IllegalArgumentException( "Gender can't be null!!" );
		}
	}

	public String getGenero()
	{
		return genero;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nData de Validade : " + getDataDeValid()
					+ "\nGenero : " + getGenero();
	}

	/**
	 * Verifica se um produto está vendido.
	 * 
	 * @return true Se for vendido, false caso contrario.
	 */
	public boolean vendido()
	{
		// FIXME Não tem atributo que informe se o produto foi vendido ou não. Logo por isso é apenas um valor dafault.
		
		// default
		return false;
	}

	// Implements in subclass.
	abstract public boolean estaValido( String data_de_valid );

}

