package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidade.Fornecedor;
import com.app.web.servico.FornecedorServico;

@Controller
public class FornecedorControlador {

	@Autowired
	private FornecedorServico servico;

	@GetMapping({ "/fornecedores", "/" })
	public String listarFornecedores(Model modelo) {
		modelo.addAttribute("fornecedores", servico.listarTodosFornecedores());
		return "fornecedores"; // retorna fornecedores.html
	}

	@GetMapping("/fornecedores/novo")
	public String mostrarFormularioDeRegistroDeFornecedor(Model modelo) {
		Fornecedor fornecedor = new Fornecedor();
		modelo.addAttribute("fornecedor", fornecedor);
		return "adicionarFornecedor";
	}

	@PostMapping("/fornecedores")
	public String salvarFornecedor(@ModelAttribute("fornecedor") Fornecedor fornecedor) {
		servico.salvarFornecedor(fornecedor);
		return "redirect:/fornecedores";
	}

	@GetMapping("/fornecedores/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("fornecedor", servico.listarFornecedorPorId(id));
		return "editarFornecedor";
	}

	@PostMapping("/fornecedores/{id}")
	public String atualizarFornecedor(@PathVariable Long id, @ModelAttribute("fornecedor") Fornecedor fornecedor,
			Model modelo) {
		Fornecedor fornecedorExistente = servico.listarFornecedorPorId(id);
		fornecedorExistente.setId(id);
		fornecedorExistente.setNome_fornecedor(fornecedor.getNome_fornecedor());
		fornecedorExistente.setSegmento_fornecedor(fornecedor.getSegmento_fornecedor());
		fornecedorExistente.setDia_da_visita_fornecedor(fornecedor.getDia_da_visita_fornecedor());

		servico.atualizarFornecedor(fornecedorExistente);
		return "redirect:/fornecedores";
	}

	@GetMapping("/fornecedores/{id}")
	public String deletarFornecedor(@PathVariable Long id) {
		servico.deletarFornecedor(id);
		return "redirect:/fornecedores";
	}
}
