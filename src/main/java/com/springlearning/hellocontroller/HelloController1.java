package com.springlearning.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController1 {
/*
	@RequestMapping("/welcome/{name}/{country}")
public ModelAndView helloMethod(@PathVariable String name, @PathVariable String country){
	ModelAndView model =new ModelAndView("index1");
	model.addObject("msg","Hello "+name+" from "+country);
	return model;
}
	*/
			@RequestMapping("welcome/{name}/{country}")
			public ModelAndView helloMethod(@PathVariable Map<String,String> var){
			ModelAndView model = new ModelAndView("index1");
			model.addObject("msg","Hello "+var.get("name")+" from "+var.get("country")+" !");
			return model;
		}

}
