import java.lang.IllegalArgumentException;

/**
 * Implements a Livro class as ProdutoDuravel subclass.
 *
 * @author Erick de Olvieira Silva
 * @version 2017.08.23
 */
public class Livro extends ProdutoDuravel
{
	// Livro's exclusive atributes.
	private String autor;
	private int numero_de_pag;
	private String edicao;

	// Definition of minimum of pages in a book.
	private static int min_num_pages = 10; // Default

	/**
	 * Default constructor.
	 *
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param material_pred Predominant material of the durable product.
	 * @param durabilidade Durability, in years, of the durable product.
	 * @param autor Name of the author of book product.
	 * @param numero_de_pag Number of pages in the book product.
	 * @param edicao Edition of the book product.
	 */ 
	public Livro(  String nome
				,  double preco
				,  String marca
				,  String descricao
				,  String data_de_fabr
				,  String material_pred
				,  int    durabilidade
				,  String autor
				,  int    numero_de_pag
				,  String edicao        ) throws IllegalArgumentException
	{
		super( nome, preco, marca, descricao, data_de_fabr, material_pred, durabilidade );
		
		if (   autor != null 
			&& numero_de_pag > min_num_pages 
			&& edicao != null )
		{
			this.autor = autor;
			this.numero_de_pag = numero_de_pag;
			this.edicao = edicao;
		} else 
		{
			throw new IllegalArgumentException( "Author can't be null, Number of pages can't be smaller than the default value or edition can't be null!!" );
		}
	}

	// Gets and Sets methods.
	public void setAutor( String autor ) throws IllegalArgumentException
	{
		if ( autor != null )
		{
			this.autor = autor;
		} else 
		{
			throw new IllegalArgumentException( "Author can't be null!!" );
		}
	}

	public String getAutor()
	{
		return autor;
	}

	public void setNumeroDePag( int numero_de_pag ) throws IllegalArgumentException
	{
		if ( numero_de_pag > min_num_pages )
		{
			this.numero_de_pag = numero_de_pag;
		} else 
		{
			throw new IllegalArgumentException( "Number of pages can't be smaller than the default value!!" );
		}
	}

	public int getNumeroDePag()
	{
		return numero_de_pag;
	}

	public void setEdicao( String edicao ) throws IllegalArgumentException
	{
		if ( edicao != null )
		{
			this.edicao = edicao;
		} else 
		{
			throw new IllegalArgumentException( "Edition can't be null!!" );
		}
	}

	public String getEdicao()
	{
		return edicao;
	}

}
