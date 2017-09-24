import java.lang.*;


/**
 * Class for tests of project Registro de Bonificacoes.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.23
 */
public class Main
{

	public static void main( String[] args )
	{
		// init the database
		ControleDeBonificacoes base_de_dados = new ControleDeBonificacoes();

		//try-catch because the exception what could be throw (ParseException)
		try
		{
			Gerente gerente 			= new Gerente( "Gerente", "23/09/1990", "123456", 2000.00 );
			Diretor diretor 			= new Diretor( "Diretor", "19/07/1997", "654321", 1500.00 );
			Presidente presidente		= new Presidente( "Presidente", "20/12/1980", "165216", 3000.00 );

			// Adding the employees.
			base_de_dados.adicionarFuncionario( gerente );
			base_de_dados.adicionarFuncionario( diretor );
			base_de_dados.adicionarFuncionario( presidente );

			// testing for list methods. 
			// All are not bonificated.
			base_de_dados.listarFuncionariosBonificados();
			base_de_dados.listarFuncionariosNaoBonificados();

			base_de_dados.RegistraBonificacao( presidente );

			// testing for list methods. 
			// All are not bonificated, except the president.
			base_de_dados.listarFuncionariosBonificados();
			base_de_dados.listarFuncionariosNaoBonificados();

			// testing for bonification limit. personal = 5;
			base_de_dados.RegistraBonificacao( presidente );
			base_de_dados.RegistraBonificacao( presidente );
			base_de_dados.RegistraBonificacao( presidente );
			base_de_dados.RegistraBonificacao( presidente );

			// president has 5 bonifications, he can't be register none new bonification for him.
			// if the RegistraBonificacao is work then should return false.
			if( !base_de_dados.RegistraBonificacao( presidente ) )
			{
				System.out.println( "Limite de bonificações atingido(pessoal=5), cancelando operação!!" );
			}

			// testing for list methods. 
			// All are not bonificated, except the president.
			base_de_dados.listarFuncionariosBonificados();
			base_de_dados.listarFuncionariosNaoBonificados();

			// Bonificando o gerente.
			base_de_dados.RegistraBonificacao( gerente );

			// testing for list methods. 
			// All are bonificated, except the director.
			base_de_dados.listarFuncionariosBonificados();
			base_de_dados.listarFuncionariosNaoBonificados();

			// testing for bonification limit. total = 10.
			base_de_dados.RegistraBonificacao( gerente );
			base_de_dados.RegistraBonificacao( gerente );
			base_de_dados.RegistraBonificacao( gerente );
			base_de_dados.RegistraBonificacao( gerente );

			// president has 5 bonifications, he can't be register none new bonification for him.
			// if the RegistraBonificacao is work then should return false.
			if( !base_de_dados.RegistraBonificacao( diretor ) )
			{
				System.out.println( "Limite de bonificações atingido(total=10), cancelando operação!!" );
			}

			// testing for list methods. 
			// All are bonificated, except the director.
			base_de_dados.listarFuncionariosBonificados();
			base_de_dados.listarFuncionariosNaoBonificados();
		} catch ( Exception e )
		{
			System.out.println( e );
		}

	}

}