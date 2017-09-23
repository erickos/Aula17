import java.lang.IllegalArgumentException;

/**
 * Implements a Celular class as ProdutoDuravel subclass.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Celular extends ProdutoDuravel
{
	// Cellphone's exclusives atributes.
	private double tamanho_tela; 	 // Em polegadas
	private int armazenamento; 	 // Em MB.

	// Minimum values to atributes.
	private static double min_tamanho_tela = 2.0;
	private static int min_armazenamento = 8;

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
	 * @param tamanho_tela Screen size, in inches, of the cellphone product.
	 * @param armazenamento Storage size, in MB, of cellphone product.
	 */ 
	public Celular( String id  
				,  String nome
				,  double preco
				,  String marca
				,  String descricao
				,  String data_de_fabr
				,  String material_pred
				,  int    durabilidade
				,  double tamanho_tela
				,  int    armazenamento
				,  boolean avaria ) throws IllegalArgumentException, Exception
	{
		super( id, nome, preco, marca, descricao, data_de_fabr, material_pred, durabilidade, avaria );
		setTamanhoTela( tamanho_tela );
		setArmazenamento( armazenamento );
	}

	// Gets and Sets methods.
	
	/**
	 * Sets the cellphone's screen size.
	 *
	 * @param tamanho_tela The cellphone screen size.
	 *
	 * @throws IllegalArgumentException if tamanho_tela smaller than the minimum sceen size value for cellphones.
	 */
	public void setTamanhoTela( double tamanho_tela ) throws IllegalArgumentException
	{
		if ( tamanho_tela >= min_tamanho_tela )
		{
			this.tamanho_tela = tamanho_tela;
		} else 
		{
			throw new IllegalArgumentException( "Screen size can't be smaller than the default ("+ min_tamanho_tela +"\")!!" );
		}
	}


	/**
	 * Gets the cellphone's screen size.
	 *
	 * @return The tv cellphone screen size.
	 */
	public double getTamanhoTela()
	{
		return tamanho_tela;
	}


	/**
	 * Sets the cellphone storage size.
	 *
	 * @param armazenamento The cellphone storage size.
	 *
	 * @throws  IllegalArgumentException if armazenamento is smaller than the minimum storage size value for cellphones. 
	 */
	public void setArmazenamento( int armazenamento ) throws IllegalArgumentException
	{
		if ( armazenamento >= min_armazenamento )
		{
			this.armazenamento = armazenamento;
		} else 
		{
			throw new IllegalArgumentException( "Storage size can't be ("+ min_armazenamento +" MB)!!" );
		}
	}

	
	/**
	 * Gets the cellphone storage size.
	 *
	 * @return The cellphone storage size.
	 */
	public int getArmazenamento()
	{
		return armazenamento;
	}

	/**
	 * Verify if the product is electronic.
	 *
	 * @return  true if the product is electronic, false in otherwise.
	 */
	public boolean ehEletronico()
	{
		// All cellphone are electronic.
		// That is why return true always.
		
		return true; 
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>> Celular <<\n" + super.toString() 
								   + "\nTamanho da tela : " + getTamanhoTela()
								   + "\nArmazenamento : " + getArmazenamento();
	}
}