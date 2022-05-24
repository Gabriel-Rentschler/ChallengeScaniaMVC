package br.com.cargapesada.truckpass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import br.com.cargapesada.truckpass.model.Veiculo;
import br.com.cargapesada.truckpass.repository.VeiculoRepository;

@Controller
@RequestMapping("veiculos")
public class VeiculoController {
	private VeiculoRepository veiculoRepository;

	public VeiculoController(VeiculoRepository veiculoRepository) {
		this.veiculoRepository = veiculoRepository;
	}

	@GetMapping
	public String listPosts(Model model) {
		model.addAttribute("veiculos", veiculoRepository.findAll());
		return null;
	}

	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("veiculo", new Veiculo());
		return null;
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Long id, Model model) {
		model.addAttribute("veiculo", veiculoRepository.findById(id).get());
		return null;
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Long id) {
		veiculoRepository.deleteById(id);
		RedirectView redirectView = new RedirectView("/veiculos");
		return redirectView;
	}

	@PostMapping("/save")
	public RedirectView savePost(@ModelAttribute("veiculo") Veiculo veiculo, RedirectAttributes attrs) {

		Veiculo savedVeiculo = veiculoRepository.save(veiculo);

		attrs.addFlashAttribute("addVeiculoSucess", true);
		attrs.addFlashAttribute("savedVeiculo", savedVeiculo);

		RedirectView redirectView = new RedirectView("/veiculos");
		return redirectView;
	}
}
