package br.com.poups.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.poups.model.Card;
import br.com.poups.model.Flag;
import br.com.poups.service.CardService;

@Controller
@RequestMapping("/cards")
public class CardController {

	@Autowired
	CardService cs;
	
	@RequestMapping
	public ModelAndView list() {
		List<Card> cards = cs.findAll();
		return new ModelAndView("cards/index").addObject("cards", cards);
	}
	
	@GetMapping("/insert")
	public ModelAndView insertForm() {
		return new ModelAndView("cards/insert").addObject(new Card());
	}
	
	@PostMapping("/insert")
	public String insert(@Validated Card card, Errors errors, RedirectAttributes ra) {
		if (errors.hasErrors()) {
			return "cards/insert";
		}
		cs.save(card);
		ra.addFlashAttribute("mensagem", "Cartão salvo com sucesso!");
		return "redirect:/cards";
	}
	
	@GetMapping("/{id}")
	public ModelAndView detalhe(@PathVariable("id") Card card) {
		return new ModelAndView("cards/insert").addObject(card);
	}
	
	@ModelAttribute("flags")
	public List<Flag> allFlags() {
		return cs.allFlags();
	}
}
