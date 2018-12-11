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
		System.out.println("Número de testes para executar : " + description.testCount());
	}

	/**
	 * Chamado quando todos os testes terminarem
	 */
	public void testRunFinished(Result result) throws java.lang.Exception {
		System.out.println("Número de testes executados: " + result.getRunCount());
	}

	/**
	 * 
	 * Chamado quando um teste atômico está prestes a ser iniciado.
	 */
	public void testStarted(Description description) throws java.lang.Exception {
		System.out.println("Iniciando a execução do caso de teste : " + description.getMethodName());
	}

	/**
	 * 
	 * Chamado quando um teste atômico termina, se o teste é bem-sucedido ou falha.
	 */
	public void testFinished(Description description) throws java.lang.Exception {
		System.out.println("Execução finalizada do caso de teste : " + description.getMethodName());
	}

	/**
	 * 
	 * 
	 * Chamado quando um teste atômico falha.
	 */
	public void testFailure(Failure failure) throws java.lang.Exception {
		System.out.println("Execução do caso de teste falhou : " + failure.getMessage());
	}

	/**
	 * 
	 * Chamado quando um teste não será executado, geralmente porque um método de
	 * teste é anotado com Ignorar.
	 */
	public void testIgnored(Description description) throws java.lang.Exception {
		System.out.println("Execução do caso de teste ignorado : " + description.getMethodName());
	}

}
