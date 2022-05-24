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

import br.com.cargapesada.truckpass.model.Motorista;
import br.com.cargapesada.truckpass.repository.MotoristaRepository;

@Controller
@RequestMapping("motoristas")
public class MotoristaController {
	
	
	private MotoristaRepository motoristaRepository;

	public MotoristaController(MotoristaRepository motoristaRepository) {
		this.motoristaRepository = motoristaRepository;
	}

	@GetMapping
	public String listMotoristas(Model model) {
		model.addAttribute("motoristas", motoristaRepository.findAll());
		return null;
	}

	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("motorista", new Motorista());
		return null;
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Long id, Model model) {
		model.addAttribute("motorista", motoristaRepository.findById(id).get());
		return null;
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Long id) {
		motoristaRepository.deleteById(id);
		RedirectView redirectView = new RedirectView("/motoristas");
		return redirectView;
	}

	@PostMapping("/save")
	public RedirectView savePost(@ModelAttribute("motorista") Motorista motorista, RedirectAttributes attrs) {

		Motorista savedMotorista = motoristaRepository.save(motorista);

		attrs.addFlashAttribute("addMotoristaSucess", true);
		attrs.addFlashAttribute("savedMotorista", savedMotorista);

		RedirectView redirectView = new RedirectView("/motoristas");
		return redirectView;
	}
}
