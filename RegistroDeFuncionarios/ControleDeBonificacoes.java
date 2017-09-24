import java.util.ArrayList;
import java.util.HashMap;


/**
 * Class to control the employee's database.
 * 
 * @author Erick de Oliveira Silva
 * @version 2017.09.23
 */
public class ControleDeBonificacoes
{
	// The employee's database.
	private ArrayList< Funcionario > funcionarios;

	private HashMap< Funcionario, Integer > num_bonificacoes;
	
	/**
	 * Constructs the database. Initiates the ArrayList and the HashMap.
	 */
	public ControleDeBonificacoes()
	{
		// Saves the employees.
		funcionarios = new ArrayList< Funcionario >();

		// Save the employee's bonification times.
		num_bonificacoes = new HashMap< Funcionario, Integer >();
	}

	/**
	 * Add a employee from database.
	 *
	 * @param      funcionario  The employee to be added.
	 */
	public void adicionarFuncionario( Funcionario funcionario )
	{
		// Adds on database.
		funcionarios.add( funcionario );

		// Maps the new employee.
		num_bonificacoes.put( ( funcionarios.get( funcionarios.size()-1 ) ), 0 );
	}

	/**
	 * Removes a employee from database.
	 *
	 * @param      funcionario  The employee to be added.
	 */
	public void removerFuncionario( Funcionario funcionario )
	{
		// Remove of the HashMap.
		num_bonificacoes.remove( funcionario );
		
		// Remove from database.
		funcionarios.remove( funcionario );
	}

	/**
	 * Gives a bonification to a employee.
	 * 
	 * @param funcionario The employee to give a bonification.
	 * 
	 * @return true if the employee can receive a bonification, false in otherwise.
	 */
	public boolean RegistraBonificacao( Funcionario funcionario )
	{

		if( num_bonificacoes.get( funcionario ).intValue() == 5 || getTotalBonificacoes() == 10 )
		{
			System.out.println( "!!!!! THE COMPANY BONIFICATION LIMIT WAS HITED, NONE NEW BONIFICATION REQUEST WILL BE ACCEPTED !!!!!" );
			return false;
		}

		// Increases the number of employee's bonifications times.
		num_bonificacoes.put( funcionario, num_bonificacoes.get( funcionario ) + 1 );

		// Increases the salary.
		funcionario.getBonificacao();

		return true;
	}

	/**
	 * Gets the total bonificacoes.
	 *
	 * @return  The total bonification of all employee's database.
	 */
	public int getTotalBonificacoes()
	{
		int total = 0;
		for( Funcionario current : funcionarios )
		{
			total += num_bonificacoes.get( current ).intValue();
		}

		return total;
	}

	/**
	 * Prints all the employees which don't had received any bonifications.
	 */
	public void listarFuncionariosNaoBonificados()
	{
		System.out.println( "\n>>> Empregados não bonificados <<<\n" );

		for( Funcionario current : funcionarios )
		{
			// Employyes without bonification.
			if( num_bonificacoes.get( current ).intValue() == 0 )
			{
				System.out.println( current );
			}
		}

		System.out.println( "\n>>> Fim da Base de dados <<<\n" );
	}

	/**
	 * Prints all the employees which had received any bonifications.
	 */
	public void listarFuncionariosBonificados()
	{
		System.out.println( "\n>>> Empregados bonificados <<<\n" );

		for( Funcionario current : funcionarios )
		{
			// Employyes without bonification.
			if( num_bonificacoes.get( current ).intValue() > 0 )
			{
				System.out.println( current );
				System.out.println( "\nNmero de Bonificacoes recebidas : " + num_bonificacoes.get( current ).intValue() );
			}
		}

		System.out.println( "\n>>> Fim da Base de dados <<<\n" );
	}

}