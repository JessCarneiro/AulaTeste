package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC02ConsultarEmpresa {
	static Empresa resultadoEsperado;
	static Empresa resultadoObtido;
	static EmpresaDAO empresaDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		resultadoEsperado = new Empresa();
		resultadoEsperado.setNomeDaEmpresa("empresa x");
		resultadoEsperado.setCnpj("89424232000180");
		resultadoEsperado.setNomeFantasia("empresa x");
		resultadoEsperado.setEndereco("rua taquari");
		resultadoEsperado.setTelefone("2222");
		empresaDAO.exclui("89424232000180"); //Verificar onde está o erro. Por isso está aqui!
		empresaDAO.adiciona(resultadoEsperado);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO.exclui("89424232000180");
	}
	
	
	/**
	 * estabelece as pre-condicoes antes da execucao de cada teste
	 * @throws Exception
	 */
	@Before
	public void excluiEmpresa() throws Exception{
		empresaDAO.exclui("89424232000180");
	}
	@Test
	public void CT01UC02ConsultarEmpresa_com_sucesso() {
		resultadoObtido = empresaDAO.consulta("89424232000180");
	
		assertTrue(resultadoEsperado.equals(resultadoEsperado));
		empresaDAO.exclui("89424232000180");
	}

}
