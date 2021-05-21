package io.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = {"/home", "/index", "/", ""})
	public String homePage(Model model){
		//String[] A = new String[] {"/home", "/index", "/", ""};
		model.addAttribute("user", "Pham Ngoc Huy");
		return "index";
	}
	
	@GetMapping("/products")
	public String productPage(Model model){
		model.addAttribute("user", "Product Page");
		return "products/list";
	} 
	
	@PostMapping("/products")
	public String productPage2(Model model){
		model.addAttribute("user", "Product Page");
		return "products/list";
	} 
	
	@GetMapping("/products/{id}")
	public String productPage3(@PathVariable String id, Model model){
		model.addAttribute("id", "Product Page for Product id = " + id);
		return "products/list";
	} 

}
