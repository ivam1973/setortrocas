package com.app.web.servico;

import java.util.List;

import com.app.web.entidade.Fornecedor;

public interface FornecedorServico {
	
	public List<Fornecedor> listarTodosFornecedores();
	
	public Fornecedor salvarFornecedor(Fornecedor fornecedor);
	
	public Fornecedor listarFornecedorPorId(Long id);
	
	public Fornecedor atualizarFornecedor(Fornecedor fornecedor);
	
	public void deletarFornecedor(Long id);

}




