import java.lang.IllegalArgumentException;
/**
 * Implements a rectangule. A rectangule have a height and width values.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.23
 */
public class Retangulo extends Forma
{
	// The height of the rectangule.
	private float altura;
	// The width of the rectangule.
	private float lado;


	/**
	 * Default constructor.
	 *
	 * @param      altura  The height
	 * @param      lado    The width
	 * 
	 * @throws IllegalArgumentException if altura or lado are be negative.
	 */
	public Retangulo( float altura
					, float lado  ) throws IllegalArgumentException
	{
		setAltura( altura );
		setLado( lado );
	}


	/**
	 * Sets the rectangule height.
	 *
	 * @param      altura                    The rectangule height.
	 *
	 * @throws     IllegalArgumentException  if altura is negative.
	 */
	public void setAltura( float altura ) throws IllegalArgumentException
	{
		if( altura >= 0 )
		{
			this.altura = altura;
		} else 
		{
			throw new IllegalArgumentException( "Height of rectangule can't be negative!!" );
		}
	}

	/**
	 * Gets the rectangule height.
	 *
	 * @return     The rectangule height.
	 */
	public float getAltura()
	{
		return altura;
	}


	/**
	 * Sets the rectangule width.
	 *
	 * @param      lado                      The rectangule width.
	 *
	 * @throws     IllegalArgumentException  if lado is negative.
	 */
	public void setLado( float lado ) throws IllegalArgumentException
	{
		if( lado >= 0 )
		{
			this.lado = lado;
		} else 
		{
			throw new IllegalArgumentException( "Width of rectangule can't be negative!!" );
		}
	}


	/**
	 * Gets the rectangule width.
	 *
	 * @return     The rectangule width.
	 */
	public float getLado()
	{
		return lado;
	}


	/**
	 * Calculates the rectangule area.
	 *
	 * @return     The rectangule area
	 */
	public float calcularArea()
	{
		return ( getAltura() * getLado() );
	}


	/**
	 * Calculates the rectangule perimeter.
	 *
	 * @return     The rectangule perimeter.
	 */
	public float calcularPerimetro()
	{
		return ( 2 * getAltura() + 2 * getLado() );
	}


	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>> Retangulo <<\n" + "Altura : " + getAltura()
									 + "\nLado : " + getLado()
									 + "\nArea : " + calcularArea()
									 + "\nPerimetro : " + calcularPerimetro() + "\n";
	}

}