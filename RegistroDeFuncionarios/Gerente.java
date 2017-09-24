import java.lang.IllegalArgumentException;
import java.text.ParseException;


/**
 * Representation of a manager as a employee's subclass.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.23
 */
public class Gerente extends Funcionario
{


	/**
	 * Constructs the manager.
	 *
	 * @param      nome             The manager's name
	 * @param      data_nascimento  The manager's birthday date
	 * @param      cpf              The manager's cpf
	 * @param      salario          The manager's salary
	 * 
	 * @throws IllegalArgumentException if nome, data_nascimento or cpf are null, or salario is negative
	 * @throws ParseException 			if data_nascimento isn't in date format (dd/MM/yyyy)
	 *   														   			 or (MM/dd/yyyy)
	 * 														   	   			 or (yyyy/dd/MM)
	 * 															   			 or (yyyy/MM/dd).
	 */
	public Gerente( 	String nome
					, 	String data_nascimento
					, 	String cpf
					,	double salario			) throws IllegalArgumentException, Exception
	{
		super( nome, data_nascimento, cpf, salario );
	}


	/**
	 * Calculates the manager's new salary
	 *
	 * @return     The manager's new salary.
	 */
	public double getBonificacao()
	{
		double novo_salario = getSalario() + getSalario()*0.1;
		setSalario( novo_salario );

		return getSalario();
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	@Override
	public String toString()
	{
		return "\n>>> Gerente <<<\n" + super.toString();
	}
}