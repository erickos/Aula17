import java.lang.IllegalArgumentException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.Calendar;

/**
 * Representation of a generic employee.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.23
 */
abstract public class Funcionario
{
	// A employee's name.
	private String nome;
	// A employee's birthday date.
	private String data_nascimento;
	// A employee's CPF.
	private String cpf;
	// a employee's salary.
	private double salario;


	/**
	 * Constructs a employee.
	 *
	 * @param      nome             The employee's name
	 * @param      data_nascimento  The employee's birthday date
	 * @param      cpf              The employee's cpf
	 * @param      salario          The employee's salary
	 * 
	 * @throws IllegalArgumentException if nome, data_nascimento or cpf are null, or salary is negative.
	 * @throws ParseException if data_nascimento isn't in date format (dd/MM/yyyy)
	 *   														   or (MM/dd/yyyy)
	 * 														   	   or (yyyy/dd/MM)
	 * 															   or (yyyy/MM/dd).	
	 */
	public Funcionario( 	String nome
						, 	String data_nascimento
						,	String cpf
						,	double salario 			) throws IllegalArgumentException, Exception
	{
		setNome( nome );
		setDataNascimento( data_nascimento );
		setCpf( cpf );
		setSalario( salario );
	}


	/**
	 * Sets the employee's name.
	 *
	 * @param      nome                      The employee's name.
	 *
	 * @throws     IllegalArgumentException  if nome is null.
	 */
	public void setNome( String nome ) throws IllegalArgumentException
	{
		if( nome != null )
		{
			this.nome = nome;
		} else 
		{
			throw new IllegalArgumentException( "The employee's name can't be null!!" );
		}
	}

	/**
	 * Gets the employee's name.
	 *
	 * @return     The employee's name.
	 */
	public String getNome()
	{
		return nome;
	}


	/**
	 * Sets the employee's birthday date.
	 *
	 * @param      data_nascimento           The employee's birthday date.
	 *
	 * @throws     IllegalArgumentException  if data_nascimento is null.
	 * @throws     ParseException            if data_nascimento isn't in date format (dd/MM/yyyy) 
	 * 																			  or (MM/dd/yyyy)
	 * 																		   	  or (yyyy/dd/MM)
	 * 																			  or (yyyy/MM/dd).	
	 */
	public void setDataNascimento( String data_nascimento ) throws IllegalArgumentException, Exception
	{

		if( data_nascimento != null )
		{
			// Test for correct date format.
			try 
			{
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				Calendar cal = Calendar.getInstance();
				cal.setTime( df.parse( data_nascimento ) );
				this.data_nascimento = data_nascimento;
			} catch ( Exception e )
			{
				System.out.println( e + ".\nCorrect date format : dd/MM/yyyy." );
			}
		} else 
		{
			throw new IllegalArgumentException( "Employee's birthday can't be null!!" );
		}
	}


	/**
	 * Gets the employee's birthday date.
	 *
	 * @return     The employee's birthday date.
	 */
	public String getDataNascimento()
	{
		return data_nascimento;
	}


	/**
	 * Sets the employee's cpf.
	 *
	 * @param      cpf                       The employee's cpf
	 *
	 * @throws     IllegalArgumentException  if cpf is null.
	 */
	public void setCpf( String cpf ) throws IllegalArgumentException
	{
		if( cpf != null )
		{
			this.cpf = cpf;
		} else 
		{
			throw new IllegalArgumentException( "Employee's CPF can't be null!!" );
		}
	}


	/**
	 * Gets the employee's cpf.
	 *
	 * @return     The employee's cpf.
	 */
	public String getCpf()
	{
		return cpf;
	}


	/**
	 * Sets the employee's salary.
	 *
	 * @param      salario                   The employee's salary
	 *
	 * @throws     IllegalArgumentException  if salario is negative.
	 */
	public void setSalario( double salario ) throws IllegalArgumentException
	{
		if( salario >= 0 )
		{
			this.salario = salario;
		} else 
		{
			throw new IllegalArgumentException( "Employee's salary can't be negative!!" );
		}
	}


	/**
	 * Gets the actual employee's salario.
	 *
	 * @return     The actual employee's salary.
	 */
	public double getSalario()
	{
		return salario;
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
		
		return 	  "\nNome : " + getNome()
				+ "\nData de Nascimento : " + getDataNascimento()
				+ "\nCPF : " + getCpf()
				+ "\nSalario : R$ " + formato.format( getSalario() );
	}

	// Employee's bonification variates by your role.
	abstract public double getBonificacao();
}