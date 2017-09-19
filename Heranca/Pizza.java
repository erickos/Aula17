import java.lang.IllegalArgumentException;

/**
 * Implements a Pizza class as ProdutoNaoDuravel subclass.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Pizza extends ProdutoNaoDuravel
{

	private String tamanho;
	private String recheio;

	/**
	 * Default constructor.
	 *
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param data_de_valid Expire date of the non-durable product.
	 * @param genero Genre of the non-durable product.
	 * @param tamanho Size of the pizza product. (P, M, G, GG)
	 * @param recheio Stuffing on pizza product. (Mossarella, Calabresa, Portuguesa, 4 Queijos, Chocolate).
	 */ 
	public Pizza( String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String data_de_valid
						, String genero
						, String tamanho
						, String recheio ) throws IllegalArgumentException
	{

		super( nome, preco, marca, descricao, data_de_fabr, data_de_valid, genero );

		if ( tamanho != null && recheio != null )
		{
			this.tamanho = tamanho;
			this.recheio = recheio;
		} else 
		{
			throw new IllegalArgumentException( "Pizza's size and stuffing can't be null!!" );
		}

	}

	// Gets and Sets methods.
	public void setTamanho( String tamanho ) throws IllegalArgumentException
	{
		if ( tamanho != null )
		{
			this.tamanho = tamanho;
		} else 
		{
			throw new IllegalArgumentException( "Pizza's size can't be null!!");
		}
	}

	public String getTamanho()
	{
		return tamanho;
	}

	public void setRecheio( String recheio ) throws IllegalArgumentException
	{
		if ( recheio != null )
		{
			this.recheio = recheio;
		} else 
		{
			throw new IllegalArgumentException( "Pizza's stuffing can't be null!!");
		}
	}

	public String getRecheio()
	{
		return recheio;
	}

}