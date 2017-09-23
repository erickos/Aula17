import java.lang.*;
/**
 * Class to execute and test the classes and methods of Produto subclasses.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.08.23
 */
public class Main
{
	public static void main( String[] args ) throws Exception, IllegalArgumentException
	{
		// Nova database.
		Deposito database = new Deposito();
		
		// Produtos Duraveis		
		Celular celular 		= new Celular( "1", "iPhone 4", 2000.00, "Apple", "A smartphone", "20/12/2010", "Aço", 2, 4.0, 16000, false );
		Livro 	livro 			= new Livro( "2", "Jogo do Exterminador", 39.90, "Editora Devir", "Science Fiction's book.", "19/07/2016", "Papel", 20, "Orson Scott Card", 325, "4ª edição (2013)", false );
		Carro   carro   		= new Carro( "3" ,"Civic", 80000.00, "Honda", "Car", "20/10/2015", "Aço", 6, 2016, "Sedan", true );
		Televisao tv   			= new Televisao( "4" ,"LG45", 800.00, "LG", "Modern TV", "20/12/2015", "LED", 4, false, 27, "1920x1080", true );
		Microondas microondas   = new Microondas( "5" ,"Brastemp l200", 1000.00, "Brastemp", "A microwaves", "10/07/2016", "Aço", 6, true, 30, 1000, "Branco" );

		// Produtos não Duraveis
		Pizza pizza 	    	= new Pizza( "6", "Pizza", 30.00, "Pizzaria X", "Comida", "2017/08/23", "22/10/2017", "Alimento", "G", "Calabresa" );
		Refrigerante refri  	= new Refrigerante( "7", "Guaraná", 6.50, "Antartica", "Bebida", "2017/07/23", "31/10/2017", "Alimento", 2000, "Diet" );
		Chocolate chocolate 	= new Chocolate( "8", "Sonho de Valsa", 1.50, "Garoto", "Bombom", "2017/06/25", "30/12/2017", "Alimento", "Bombom", "Ao leite" );
		Feijao feijao 	    	= new Feijao( "9", "Feijao ABC", 7.00, "Distribuidora X", "Comida", "2017/08/23", "31/12/2017", "Alimento", "Preto", 1000 );
		Sorvete sorvete 	    = new Sorvete( "10", "Sonho de Valsa", 10.00, "Kibom", "Comida", "2017/08/23", "22/12/2017", "Alimento", "Baunilha", 1000 );

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
		database.addProduto( tv );
		database.addProduto( microondas );
		database.addProduto( pizza );
		database.addProduto( refri );
		database.addProduto( chocolate );
		database.addProduto( feijao );
		database.addProduto( sorvete );


		// Teste getQtdProdutos(). Esperado : 6.
		database.getQtdProdutos();

		database.printAvailableToSold();

		// Teste printDatabase().
		database.printDatabase();


	}

}
