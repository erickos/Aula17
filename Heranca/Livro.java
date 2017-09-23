import java.lang.IllegalArgumentException;
import java.util.*;
/**
 * Implements a Livro class as ProdutoDuravel subclass.
 *
 * @author Erick de Olvieira Silva
 * @version 2017.08.23
 */
public class Livro extends ProdutoDuravel
{
	// Livro's exclusive atributes.
	private String autor; // Book author.
	private int numero_de_pag; // Book number of pages.
	private String edicao; // Book edition.

	// Definition of minimum of pages in a book.
	private static int min_num_pages = 10; // Default

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
	 * @param autor Name of the author of book product.
	 * @param numero_de_pag Number of pages in the book product.
	 * @param edicao Edition of the book product.
	 */ 
	public Livro( String id  
				,  String nome
				,  double preco
				,  String marca
				,  String descricao
				,  String data_de_fabr
				,  String material_pred
				,  int    durabilidade
				,  String autor
				,  int    numero_de_pag
				,  String edicao        
				,  boolean avaria 	) throws IllegalArgumentException, Exception
	{
		super( id, nome, preco, marca, descricao, data_de_fabr, material_pred, durabilidade, avaria );
		
		setAutor( autor );
		setNumeroDePag( numero_de_pag );
		setEdicao( edicao );
	}

	// Gets and Sets methods.
	

	/**
	 * Sets the book's author.
	 *
	 * @param autor The book's author.
	 *
	 * @throws IllegalArgumentException if autor is null.
	 */
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


	/**
	 * Gets the book's author.
	 *
	 * @return The book's author.
	 */
	public String getAutor()
	{
		return autor;
	}

	/**
	 * Sets the book's number of pages.
	 *
	 * @param numero_de_pag The book's number of pages.
	 *
	 * @throws IllegalArgumentException if numero_de_pag is smaller than a book's minimum number of pages.
	 */
	public void setNumeroDePag( int numero_de_pag ) throws IllegalArgumentException
	{
		if ( numero_de_pag >= min_num_pages )
		{
			this.numero_de_pag = numero_de_pag;
		} else 
		{
			throw new IllegalArgumentException( "Number of pages can't be smaller than the default value!!" );
		}
	}


	/**
	 * Gets the book's number of pages.
	 *
	 * @return The book's number of pages.
	 */	
	public int getNumeroDePag()
	{
		return numero_de_pag;
	}

	/**
	 * Sets the book's edition.
	 *
	 * @param edicao The book's edition.
	 *
	 * @throws IllegalArgumentException if edicao is null.
	 */
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


	/**
	 * Gets the book's edition.
	 *
	 * @return The book's edition.
	 */
	public String getEdicao()
	{
		return edicao;
	}

	/**
	 * Verify if the product is electronic.
	 *
	 * @return  true if the product is electronic, false in otherwise.
	 */
	public boolean ehEletronico()
	{
		// Books can be made of paper or can be eBooks.
		// That is why as default books predominant material is paper then they are not electronic.
		//  If the predominant material isn't paper than they are eBooks.
		
		"papel".toLowerCase( Locale.ENGLISH );

		return getMaterialPred().toLowerCase().equals( "papel" ); 
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>> Livro <<\n" + super.toString()
								   + "\nAutor : " + getAutor()
								   + "\nNumero de paginas : " + getNumeroDePag()
								   + "\nEdicao : " + getEdicao();
	}

}
