import java.lang.Math; // for PI
import java.lang.IllegalArgumentException;

/**
 * Implements a circle class as geometric form subclass.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.23
 */
public class Circulo extends Forma
{
	// CONSTANT PI
	private static final float PI = (float) Math.PI;

	// The circle radius.
	private float raio;

	/**
	 * Constructs the circle
	 *
	 * @param      radius  The circle radius
	 */
	public Circulo( float raio ) throws IllegalArgumentException
	{
		setRaio( raio );
	}


	/**
	 * Sets the circle 
	 *
	 * @param      raio                      The circle radius.
	 *
	 * @throws     IllegalArgumentException  if raio is negative.
	 */
	public void setRaio( float raio ) throws IllegalArgumentException
	{
		if( raio >= 0 )
		{
			this.raio = raio;
		} else 
		{
			throw new IllegalArgumentException( "Radius can't be negative!!" );
		}
	}


	/**
	 * Gets the circle radius.
	 *
	 * @return     The circle radius.
	 */
	public float getRaio()
	{
		return raio;
	}

	/**
	 * Calculates the circle area.
	 *
	 * @return     The circle area value.
	 */
	public float calcularArea()
	{
		return ( PI * (float) Math.pow( getRaio(), 2 ) );
	}


	/**
	 * Calculates the circle perimeter.
	 *
	 * @return     The circle perimeter value.
	 */
	public float calcularPerimetro()
	{
		return( 2 * PI * getRaio() );
	}


	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>> Circulo <<\n" + "-> Raio : " + getRaio()
								   + "\n-> Area : " + calcularArea()
								   + "\n-> Perimetro : " + calcularPerimetro() + "\n";
	}
}