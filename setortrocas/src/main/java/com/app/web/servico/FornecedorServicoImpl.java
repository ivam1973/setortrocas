package com.app.web.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidade.Fornecedor;
import com.app.web.repositorio.FornecedorRepositorio;

@Service
public class FornecedorServicoImpl implements FornecedorServico{
	
	@Autowired
	private FornecedorRepositorio repositorio;
	
	@Override
	public List<Fornecedor> listarTodosFornecedores(){
		return repositorio.findAll();
	}
	
	@Override
	public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
		return repositorio.save(fornecedor);		
	}

	@Override
	public Fornecedor listarFornecedorPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Fornecedor atualizarFornecedor(Fornecedor fornecedor) {
		return repositorio.save(fornecedor);
	}

	@Override
	public void deletarFornecedor(Long id) {
		repositorio.deleteById(id);
	}
	
}
