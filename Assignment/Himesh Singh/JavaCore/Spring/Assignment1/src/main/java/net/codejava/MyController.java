package net.codejava;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	@GetMapping("/login")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "login_form";
	}
	
	@PostMapping("/login")
	public String submitForm(@ModelAttribute("user") User user) {
		System.out.println(user);
		return "login_success";
	}
}

