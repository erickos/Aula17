import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
	

/**
 * Repository to geometric forms.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.23
 */
public class repositorioFormas
{
	// Forms database.
	private ArrayList< Forma > repositorio;

	// max of initial forms
	private static final int MAX_FORMS = 100;

	/**
	 * Constructs the database. Initialize the ArrayList.
	 */
	public repositorioFormas( )
	{
		repositorio = new ArrayList< Forma >();
		randomInsercao();
	}


	/**
	 * Insert a random number of random Forms on database.
	 */
	public void randomInsercao()
	{	
		Random gerador = new Random();

		int n = gerador.nextInt( MAX_FORMS );

		for( int i = 0; i < n; ++i )
		{
			// 3 classes, 0 for Retangulo, 1 for Quadrado, 2 for Circulo.
			int form = gerador.nextInt( 3 );

			// Necessary as atribute for any form class.
			float parametro1 = gerador.nextFloat() * 1000; // floats random until 1000
			// Necessary only Retangulo class.
			float parametro2 = gerador.nextFloat() * 1000; // floats random until 1000

			if ( form == 0 )
			{
				repositorio.add( new Retangulo( parametro1, parametro2 ) );
			} else if ( form == 1 )
			{
				repositorio.add( new Quadrado( parametro1 ) );
			} else if ( form == 2 )
			{
				repositorio.add( new Circulo( parametro1 ) );
			}	
		}

	}


	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString()
	{
		// to count
		int i = 0;

		// Create the String for all repository.
		String total = "\n>>> Base de dados de Formas Geometricas <<<";
		for( Forma current : repositorio )
		{
			total += "\n>>>>> Forma " + (i+1) + " <<<<<\n";
			total += current.toString();

			++i;
		}
		total += "\n>>> Fim da Base de dados <<<\n";

		return total;
	}
	
}