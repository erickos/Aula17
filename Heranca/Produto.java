import java.lang.IllegalArgumentException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * A Produto.
 * Produto has a id, name, price, brand, description and a manufacture date.
 */
abstract public class Produto
{
	// A Produto's ID.
	private String id;
	// A Produto's name.
	private String nome;
	// A Produto's price.
	private double preco;
	// A Produto's brand.
	private String marca;
	// A Produto's description.
	private String descricao;
	// A Produto's manufacture date.
	private String data_de_fabr;

	/**
	 * Default constructor.
	 *
	 * @param id ID of the product.
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 */ 
	public Produto ( String id, String nome, double preco, String marca, String descricao, String data_de_fabr )
		throws IllegalArgumentException, Exception
	{
		setId( id );
		setNome( nome );
		setPreco( preco );
		setMarca( marca );
		setDescricao( descricao );
		setDataDeFabr( data_de_fabr );
	}

	// Gets and Sets methods.
	 
	/**
	 * Sets the Produto's id.
	 *
	 * @param id The Produto's id.
	 *
	 * @throws IllegalArgumentException if id is null;  
	 */
	public void setId( String id ) throws IllegalArgumentException
	{
		if( id != null )
		{
			this.id = id;
		} else 
		{
			throw new IllegalArgumentException( "ID can't be null" );
		}
	}


	/**
	 * Gets the Produto's id.
	 *
	 * @return Produto's id.
	 */
	public String getId()
	{
		return id;
	}


	/**
	 * Sets the Produto's name.
	 *
	 * @param  nome Produto's name.
	 *
	 * @throws IllegalArgumentException if nome is null.
	 */
	public void setNome( String nome ) throws IllegalArgumentException
	{
		if ( nome != null )
		{
			this.nome = nome;
		} else
		{
			throw new IllegalArgumentException( "Name can't be null!!" );
		}
	}

	/**
	 * Gets the Produto's name.
	 *
	 * @return Produto's name.
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * Sets the Produto's price.
	 *
	 * @param  preco Produto's price.
	 *
	 * @throws IllegalArgumentException if preco is negative.
	 */
	public void setPreco( double preco ) throws IllegalArgumentException
	{
		if ( preco >= 0.0 )
		{
			this.preco = preco;
		} else 
		{
			throw new IllegalArgumentException( "Price can't be negative!!" );
		}
	}


	/**
	 * Gets the Produto's price.
	 *
	 * @return Produto's price.
	 */
	public double getPreco()
	{
		return preco;
	}

	/**
	 * Sets the Produto's brand.
	 *
	 * @param  marca Produto's brand.
	 *
	 * @throws IllegalArgumentException if marca is null.
	 */
	public void setMarca( String marca ) throws IllegalArgumentException
	{
		if ( marca != null )
		{
			this.marca = marca;
		} else 
		{
			throw new IllegalArgumentException( "Brand can't be null!!" );
		}
	}


	/**
	 * Gets the Produto's brand.
	 *
	 * @return  Produto's brand.
	 */
	public String getMarca()
	{
		return marca;
	}


	/**
	 * Sets the Produto's description.
	 *
	 * @param descricao Produto's description.
	 *
	 * @throws IllegalArgumentException if descricao is null.
	 */
	public void setDescricao( String descricao ) throws IllegalArgumentException
	{
		if ( descricao != null )
		{
			this.descricao = descricao;
		} else 
		{
			throw new IllegalArgumentException( "Description can't be null!!" );
		}
	}


	/**
	 * Gets the Produto's description.
	 *
	 * @return  Produto's description.
	 */
	public String getDescricao()
	{
		return descricao;
	}

	/**
	 * Sets the Produto's manufacture date.
	 *
	 * @param  nome Produto's manufacture date.
	 *
	 * @throws IllegalArgumentException if data_de_fabr is null.
	 * @throws Exception if data_de_fabr isn't in date format.
	 */
	public void setDataDeFabr( String data_de_fabr ) throws IllegalArgumentException, Exception
	{
		if ( data_de_fabr != null )
		{
			// Test for manufacture date format.
			try 
			{
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				Calendar cal = Calendar.getInstance();
				cal.setTime( df.parse( data_de_fabr ) );
			} catch ( Exception e )
			{
				System.out.println( e );
			}
			this.data_de_fabr = data_de_fabr;
		} else 
		{
			throw new IllegalArgumentException( "Fabrication date can't be null!!" );
		}
	}


	/**
	 * Gets the Produto's manufacture date.
	 *
	 * @return  Produtos' manufacture date.
	 */
	public String getDataDeFabr()
	{
		return data_de_fabr;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	@Override
	public String toString()
	{
		return		  "\nID	 : " + getId()
		 		  + "\nName   	  : " + getNome()
				  + "\nPrice  	  : R$ " + getPreco()
				  + "\nBrand        : " + getMarca()
				  + "\nDescription  : " + getDescricao() 
				  + "\nManufacture Day : "+ getDataDeFabr();
	}

	// Implements in each subclasses.
	abstract public boolean podeSerVendido();

}
