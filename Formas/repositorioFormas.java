import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
	
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
			// 3 classes, 0 para Retangulo, 1 para quadrado, 2 para circulo.
			int form = gerador.nextInt( 3 );

			// Necessário para construir todas as classes.
			float parametro1 = gerador.nextFloat() * 1000; // floats random té 1000
			// Necessário apenas no Retangulo.
			float parametro2 = gerador.nextFloat() * 1000; // floats random até 1000

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

		String total = "\n>>> Base de dados de Formas Geometricas <<<";
		for( Forma current : repositorio )
		{
			total += "\n>>>>> Form " + i + "<<<<< \n";
			total += current.toString();

			++i;
		}
		total += "\n>>> Fim da Base de dados <<<\n";

		return total;
	}
	
}