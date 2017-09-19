import java.util.ArrayList;

/**
 * Implement a Deposito class. 
 * As a database to store Products and manipulate them.
 * 
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Deposito
{
	// Array to guard the database of Deposito.
	private ArrayList< Produto > produtos;

	/** 
	 * Default Construtor. Initialize the ArrayList of Products.
	 */
	public Deposito()
	{
		produtos = new ArrayList< Produto >();
	}

	/**
	 * Add a 'Produto' item on database.
	 *
	 * @param theProduto Item to be added on database.
	 */
	public void addProduto( Produto theProduto )
	{
		System.out.println( ">>> Inserting a new Product <<<" );
		produtos.add( theProduto );
	}

	/**
	 * Remove a 'Produto' item with name equal the parameter.
	 *
	 * @param nome The name of the product to be removed.
	 */
	public void removerProduto( String nome )
	{
		for ( Produto current : produtos )
		{
			if ( current.getNome().equals( nome ) )
			{
				produtos.remove( current );

				// Leaves the for.
				break;
			}
		}
	}
	
	/**
	 * Informs the quantity of registered products on Database.
	 *
	 * @return The size of Products ArrayList.
	 */
	public int getQtdProdutos()
	{
		System.out.println( "Has " + produtos.size() + " item(ns) on Database.\n" );
		return produtos.size();
	}

	/**
	 * Informs if the Database are empty.
	 *
	 * @return true if the database is empty, false in otherwise.
	 */
	public boolean is_Empty()
	{
		if ( produtos.isEmpty() )
		{
			System.out.println( "The Database is empty!!\n" );
		} else 
		{
			System.out.println( "The Database are not empty!!\n" );
			getQtdProdutos();
		}
		return produtos.isEmpty();
	}

	/**
	 * Informs the Product with more price value on Database.
	 *
	 * @return Product object to a item with the larger price.
	 */
	public Produto mostValuable()
	{
		Produto most = new Produto( "default", 0.0, "default", "default", "default" );
	
		for ( Produto current : produtos )
		{
			if ( current.getPreco() > most.getPreco() )
			{
					
				most = current;
			}
		}

		System.out.println(">>> Most Valuable Product <<<");
		most.print();

		return most;
	}

	/**
	 * Print the actual Database. Using the print method defined on Produto class.
	 */
	public void printDatabase()
	{
		System.out.println( "\n>>> DATABASE <<<" );
		for ( Produto current : produtos )
		{
			current.print();
		}
		System.out.println( ">>> END OF DATABASE <<<\n" );
	}
		

}
