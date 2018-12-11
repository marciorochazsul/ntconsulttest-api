package Listener;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class ExecucaoListener extends RunListener {

	/**
	 * Chamado antes de quaisquer testes terem sido executados.
	 */
	public void testRunStarted(Description description) throws java.lang.Exception {
		System.out.println("N�mero de testes para executar : " + description.testCount());
	}

	/**
	 * Chamado quando todos os testes terminarem
	 */
	public void testRunFinished(Result result) throws java.lang.Exception {
		System.out.println("N�mero de testes executados: " + result.getRunCount());
	}

	/**
	 * 
	 * Chamado quando um teste at�mico est� prestes a ser iniciado.
	 */
	public void testStarted(Description description) throws java.lang.Exception {
		System.out.println("Iniciando a execu��o do caso de teste : " + description.getMethodName());
	}

	/**
	 * 
	 * Chamado quando um teste at�mico termina, se o teste � bem-sucedido ou falha.
	 */
	public void testFinished(Description description) throws java.lang.Exception {
		System.out.println("Execu��o finalizada do caso de teste : " + description.getMethodName());
	}

	/**
	 * 
	 * 
	 * Chamado quando um teste at�mico falha.
	 */
	public void testFailure(Failure failure) throws java.lang.Exception {
		System.out.println("Execu��o do caso de teste falhou : " + failure.getMessage());
	}

	/**
	 * 
	 * Chamado quando um teste n�o ser� executado, geralmente porque um m�todo de
	 * teste � anotado com Ignorar.
	 */
	public void testIgnored(Description description) throws java.lang.Exception {
		System.out.println("Execu��o do caso de teste ignorado : " + description.getMethodName());
	}

}
