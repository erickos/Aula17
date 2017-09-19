import java.lang.IllegalArgumentException;

abstract public class Produto
{
	private String id;
	private String nome;
	private double preco;
	private String marca;
	private String descricao;
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
	{
		setId( id );
		setNome( nome );
		setPreco( preco );
		setMarca( marca );
		setDescricao( descricao );
		setDataDeFabr( data_de_fabr );
	}

	// Gets and Sets methods.
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

	public String getId()
	{
		return id;
	}

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

	public String getNome()
	{
		return nome;
	}

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

	public double getPreco()
	{
		return preco;
	}

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

	public String getMarca()
	{
		return marca;
	}

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

	public String getDescricao()
	{
		return descricao;
	}

	public void setDataDeFabr( String data_de_fabr ) throws IllegalArgumentException
	{
		if ( data_de_fabr != null )
		{
			this.data_de_fabr = data_de_fabr;
		} else 
		{
			throw new IllegalArgumentException( "Fabrication date can't be null!!" );
		}
	}

	public String getDataDeFabr()
	{
		return data_de_fabr;
	}

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

	// Implements in subclasses.
	abstract public boolean vendido();

}
