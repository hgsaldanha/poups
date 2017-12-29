package br.com.poups.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PoupsController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
