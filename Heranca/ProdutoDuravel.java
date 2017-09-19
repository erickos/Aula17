import java.lang.IllegalArgumentException;

/**
 * Implements ProdutoDuravel as a Produto subclass.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
abstract public class ProdutoDuravel extends Produto
{
	private String material_pred;
	private int durabilidade;

	/**
	 * Default constructor.
	 *
	 * @param ID Id of the product.
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param material_pred Predominant material of the durable product.
	 * @param durabilidade Durability, in years, of the durable product.
	 */ 
	public ProdutoDuravel( String id
						, String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String material_pred
						, int    durabilidade      ) 
	{
		super( id, nome, preco, marca, descricao, data_de_fabr );

		setMaterialPred( material_pred );
		setDurabilidade( durabilidade );
		
	}

	// Gets and Sets methods.
	public void setMaterialPred( String material_pred ) throws IllegalArgumentException
	{
		if ( material_pred != null )
		{
			this.material_pred = material_pred;
		} else 
		{
			throw new IllegalArgumentException( "Predominant material isn't null!!'" );
		}
	}

	public String getMaterialPred()
	{
		return material_pred;
	}

	public void setDurabilidade( int durabilidade ) throws IllegalArgumentException
	{
		if ( durabilidade > 0 )
		{
			this.durabilidade = durabilidade;
		} else 
		{
			throw new IllegalArgumentException( "Durability can't negative!!!" );
		}
	}

	public int getDurabilidade()
	{
		return durabilidade;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nMaterial Predominante : " + getMaterialPred()
					+ "\nDurabilidade : " + getDurabilidade();
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

	// Implement in subclasses.
	abstract public boolean ehEletronico();

}
