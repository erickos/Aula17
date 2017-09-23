

/**
 * Implements a square class as a rectangule subclass.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.23
 */
public class Quadrado extends Retangulo
{	
	/**
	 * Constructs the square.
	 *
	 * @param      lado  The square edge value.
	 */
	public Quadrado( float lado )
	{
		// Constructs as a rectangule with height and width equal values.
		super( lado, lado );
	}


	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>> Quadrado <<\n" + "Lado : " + getAltura()
									+ "\nArea : " + calcularArea()
									+ "\nPerimetro : " + calcularPerimetro() + "\n";
	}

}