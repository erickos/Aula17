import java.lang.IllegalArgumentException;
import java.text.ParseException;
import java.text.DecimalFormat;

/**
 * Representation of a director as a employee's subclass.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.23
 */
public class Diretor extends Gerente
{


	/**
	 * Constructs the object.
	 *
	 * @param      nome             The nome
	 * @param      data_nascimento  The data nascimento
	 * @param      cpf              The cpf
	 * @param      salario          The salario
	 * 
	 * @throws IllegalArgumentException if nome, data_nascimento or cpf are null, or salario is negative
	 * @throws ParseException 			if data_nascimento isn't in date format (dd/MM/yyyy)
	 *   														   			 or (MM/dd/yyyy)
	 * 														   	   			 or (yyyy/dd/MM)
	 * 															   			 or (yyyy/MM/dd)
	 */
	public Diretor( 	String nome
					,	String data_nascimento
					,	String cpf
					,	double salario		 ) throws IllegalArgumentException, Exception
	{
		super( nome, data_nascimento, cpf, salario );
	}

	/**
	 * Calculates the director's new salary
	 *
	 * @return     The director's new salary.
	 */
	public double getBonificacao()
	{
		// Calculating the new salary.
		double novo_salario = getSalario() + getSalario()*0.2;
		// Setting the new salary
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
		DecimalFormat formato = new DecimalFormat("##,###,###,##0.00");      
		
		return 	"\n>>> Diretor <<<\n"
				+ "\nNome : " + getNome()
				+ "\nData de Nascimento : " + getDataNascimento()
				+ "\nCPF : " + getCpf()
				+ "\nSalario : R$ " + formato.format( getSalario() );
	}
}