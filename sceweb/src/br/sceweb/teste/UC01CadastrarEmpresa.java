package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {

	static Empresa empresa;
	static EmpresaDAO empresaDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa = new Empresa();
		empresaDAO = new EmpresaDAO();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		
	}
	
	/**
	 * verificar o comportamento do sistema na inclusão de empresa com sucesso
	 */

	@Test
	public void CT01UC01FBCadastrarEmpresa_com_sucesso() { //Rastreável para o Negócio
		
		assertEquals(1, empresaDAO.adiciona(empresa));
	}

}
