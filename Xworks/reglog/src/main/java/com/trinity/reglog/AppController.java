package com.trinity.reglog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

//	@Autowired
//	private userrepository userRepo;

	@GetMapping("/")
	public String viewHomePage() {
		return "index";
	}
//
//	@GetMapping("/register")
//	public String showRegistrationForm(Model model) {
//		model.addAttribute("user", new user());
//
//		return "signup_form";
//	}
//
//	@PostMapping("/process_register")
//	public String processRegister(user user) {
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String encodedPassword = passwordEncoder.encode(user.getPassword());
//		user.setPassword(encodedPassword);
//
//		userRepo.save(user);
//
//		return "register_success";
//	}
//
//	@GetMapping("/list_users")
//	public user viewUserslist(@RequestParam Long id) {
//
//		user byId = userRepo.getById(id);
//		return byId;
//	}
}
