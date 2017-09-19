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
	 * @param nome Name of the product.
	 * @param preco Price of the product.
	 * @param marca Brand of the product.
	 * @param data_de_fabr Manufacture date of the product.
	 * @param material_pred Predominant material of the durable product.
	 * @param durabilidade Durability, in years, of the durable product.
	 * @param tamanho_tela Screen size, in inches, of the cellphone product.
	 * @param armazenamento Storage size, in MB, of cellphone product.
	 */ 
	public Celular(  String nome
				,  double preco
				,  String marca
				,  String descricao
				,  String data_de_fabr
				,  String material_pred
				,  int    durabilidade
				,  double tamanho_tela
				,  int    armazenamento ) throws IllegalArgumentException
	{
		super( nome, preco, marca, descricao, data_de_fabr, material_pred, durabilidade );
		if ( tamanho_tela >= min_tamanho_tela && armazenamento > min_armazenamento )
		{
			this.tamanho_tela = tamanho_tela;
			this.armazenamento = armazenamento;
		} else 
		{
			throw new IllegalArgumentException( "Screen size can't be smaller than the default (" + min_tamanho_tela + "\") or Storage size can't be smaller than the default (" + min_armazenamento + "MB)!!!" );
		}

	}

	// Gets and Sets methods.
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

	public double getTamanhoTela()
	{
		return tamanho_tela;
	}

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

	public int getArmazenamento()
	{
		return armazenamento;
	}

}
