import java.lang.IllegalArgumentException;
import java.text.ParseException;

public class Presidente extends Funcionario
{

	/**
	 * Constructs a president.
	 *
	 * @param      nome             The president's name
	 * @param      data_nascimento  The president's birthday date
	 * @param      cpf              The president's cpf
	 * @param      salario          The president's salary
	 * 
	 * @throws IllegalArgumentException if nome, data_nascimento or cpf are null, or salary is negative.
	 * @throws ParseException if data_nascimento isn't in date format (dd/MM/yyyy)
	 *   														   or (MM/dd/yyyy)
	 * 														   	   or (yyyy/dd/MM)
	 * 															   or (yyyy/MM/dd).	
	 */
	public Presidente( 	String nome
					,	String data_nascimento
					,	String cpf
					,	double salario 		) throws IllegalArgumentException, Exception
	{
		super( nome, data_nascimento, cpf, salario );
	}

	/**
	 * Calculates the president's new salary
	 *
	 * @return     The president's new salary.
	 */
	public double getBonificacao()
	{
		// Calculating the new salary.
		double novo_salario = getSalario() + getSalario()*0.3;
		// Setting the new salary
		setSalario( novo_salario );

		return getSalario();
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString()
	{
		return "\n>>> Presidente <<<\n" + super.toString();
	}
}