import java.lang.IllegalArgumentException;

/**
 * Implements ProdutoDuravel as a Produto subclass.
 * ProdutoDuravel has id, name, price, brand, manufacture date, predominant material,
 * 	durability and damaged state.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
abstract public class ProdutoDuravel extends Produto
{
	// Predominant material of the product.
	private String material_pred;
	// Durability, in years, of this product.
	private int durabilidade;
	// Damaged state of this product.
	private boolean avaria;

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
	 * @param avaria If the Product is damaged or not.
	 */ 
	public ProdutoDuravel( String id
						, String nome
						, double preco
						, String marca
						, String descricao
						, String data_de_fabr
						, String material_pred
						, int    durabilidade 
						, boolean avaria     ) throws IllegalArgumentException, Exception
	{
		super( id, nome, preco, marca, descricao, data_de_fabr );

		setMaterialPred( material_pred );
		setDurabilidade( durabilidade );
		setAvaria( avaria );
		
	}

	// Gets and Sets methods.
	 
	 
	/**
	 * Sets the ProdutoDuravel's predominant material.
	 *
	 * @param material_pred The ProdutoDuravel's predominant material.
	 *
	 * @throws IllegalArgumentException if material_pred is null.
	 */
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


	/**
	 * Gets the product's predominant material.
	 *
	 * @return  product's predominant material.
	 */
	public String getMaterialPred()
	{
		return material_pred;
	}

	/**
	 * Sets the product's durability.
	 *
	 * @param material_pred The product's durability.
	 *
	 * @throws IllegalArgumentException if durability is 0 or smaller.
	 */
	public void setDurabilidade( int durabilidade ) throws IllegalArgumentException
	{
		if ( durabilidade > 0 )
		{
			this.durabilidade = durabilidade;
		} else 
		{
			throw new IllegalArgumentException( "Durability can't be negative!!!" );
		}
	}


	/**
	 * Gets the product's durability.
	 *
	 * @return  product's durability.
	 */
	public int getDurabilidade()
	{
		return durabilidade;
	}

	/**
	 * Sets the product's damaged state.
	 *
	 * @param material_pred The product's damaged state.
	 *
	 */
	public void setAvaria( boolean avaria )
	{
		this.avaria = avaria;
	}

	
	/**
	 * Gets the product's damaged state.
	 *
	 * @return  product's damaged state, true if the product is damaged, false in otherwise.
	 */
	public boolean getAvaria()
	{
		return avaria;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	@Override
	public String toString()
	{
		// Representation for true-false of avaria atribute.
		String avaria_state;

		// If avaria is true then "Bom Estado" is returned in toString, "Danificado" in otherwise.
		if ( !getAvaria() )
		{
			avaria_state = "Bom estado";
		} else 
		{
			avaria_state = "Danificado";
		}

		return super.toString() + "\nMaterial Predominante : " + getMaterialPred()
					+ "\nDurabilidade : " + getDurabilidade()
					+ "\nAvaria : " + avaria_state;
	}

	/**
	 * Verify if the product can be sold.
	 * The product can be sold if don't have damaged.
	 * 
	 * @return true if can be sold, false in otherwise.
	 */
	public boolean podeSerVendido()
	{
		return !getAvaria();
	}

	// Implement in subclasses.
	abstract public boolean ehEletronico();

}
