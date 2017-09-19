
/**
 * Class to execute and test the classes and methods of Produto subclasses.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Main
{
	public static void main( String[] args )
	{
		// Nova database.
		Deposito database = new Deposito();
		
		// Produtos Duraveis		
		Celular celular 	= new Celular( "iPhone 4", 2000.00, "Apple", "A smartphone", "2010.12.20", "Aço", 2, 4.0, 16000 );
		Livro 	livro 		= new Livro( "Jogo do Exterminador", 39.90, "Editora Devir", "Science Fiction's book.", "2016.07.19", "Papel", 20, "Orson Scott Card", 325, "4ª edição (2013)" );
		Carro   carro   	= new Carro( "Civic", 80000.00, "Honda", "Car", "2015.10.20", "Aço", 6, 2016, "Sedan");

		// Produtos não Duraveis
		Pizza pizza 	    = new Pizza( "Pizza", 30.00, "Pizzaria X", "Comida", "2017.08.23", "2017.08.24", "Alimento", "G", "Calabresa" );
		Refrigerante refri  = new Refrigerante( "Guaraná", 6.50, "Antartica", "Bebida", "2017.07.23", "2017.12.31", "Alimento", 2000, "Diet" );
		Chocolate chocolate = new Chocolate( "Sonho de Valsa", 1.50, "Garoto", "Bombom", "2017.06.25", "2017.10.30", "Alimento", "Bombom", "Ao leite" );

		// Teste is_Empty() com a database vazia.
		database.is_Empty();
		
		// Teste addProduto()
		database.addProduto( celular );
		database.addProduto( carro   );
		database.addProduto( livro );

		
		// Teste is_Empty() com a tabela não vazia.
		database.is_Empty();
		
		// Teste mostValuable(). Esperado : carro
		database.mostValuable();

		// Teste getQtdProdutos(). Esperado : 3.
		database.getQtdProdutos();

		// Teste printDatabase().
		database.printDatabase();

		database.removerProduto( "Civic" );

		// Teste getQtdProdutos(). Esperado : 2.
		database.getQtdProdutos();

		// Teste printDatabase().
		database.printDatabase();

		database.removerProduto( "iPhone 4" );

		// Teste getQtdProdutos(). Esperado : 1.
		database.getQtdProdutos();	
		
		// Teste printDatabase().
		database.printDatabase();

		database.removerProduto( "Jogo do Exterminador" );

		// Teste getQtdProdutos(). Esperado : 0.
		database.getQtdProdutos();

		// Teste printDatabase().
		database.printDatabase();

		// Testes com diferentes tipos de classes em addProduto().
		database.addProduto( celular );
		database.addProduto( carro   );
		database.addProduto( livro );
		database.addProduto( pizza );
		database.addProduto( refri );
		database.addProduto( chocolate );

		// Teste getQtdProdutos(). Esperado : 6.
		database.getQtdProdutos();

		// Teste printDatabase().
		database.printDatabase();


	}

}
