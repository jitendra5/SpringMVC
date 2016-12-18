package com.springlearning.hellocontroller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController {
	@RequestMapping("/welcome")
	protected ModelAndView helloWorld(){
	ModelAndView modelView= new ModelAndView("index");
		modelView.addObject("welcomeMessage", "Welcome to Spring MVC");
		return modelView;
	}
	@RequestMapping("/hello")
	protected ModelAndView hello(){
	ModelAndView modelView= new ModelAndView("index1");
		modelView.addObject("welcomeMessage", "Welcome to Spring MVC");
		return modelView;
	}

}
