package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {

	static Empresa empresa;
	static EmpresaDAO empresaDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {


	}
	/**
	 * estabelece as pre-condicoes antes da execucao de cada teste
	 * @throws Exception
	 */
	@Before
	public void excluiEmpresa() throws Exception{
		empresaDAO.exclui("89424232000180");
	}
	/**
	 * verifica o comportamento do sistema na inclusao de um cnpj valido
	 */
	@Test
	public void CT01UC01FBCadastrarEmpresa_com_sucesso() { //Rastre�vel para o Neg�cio
		
		assertEquals(1, empresaDAO.adiciona(empresa));
	}

}
