
/**
 * Main class to test the Form project.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.23
 */
public class Main
{
	public static void main(String[] args)
	{
		// create the form repository and add the random forms.
		repositorioFormas r = new repositorioFormas();

		// walks on through the form repository and print.
		System.out.println( r );
	}

}