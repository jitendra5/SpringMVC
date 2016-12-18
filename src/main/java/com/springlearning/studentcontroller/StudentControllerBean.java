package com.springlearning.studentcontroller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentControllerBean {
	
	@InitBinder
	public void initBinderDemom(WebDataBinder binder){
		binder.registerCustomEditor(String.class, "studentName",new StudentNameEditor());
	}

	@RequestMapping(value = "/studentform.html", method = RequestMethod.GET)
	public ModelAndView helloMethod() {
		ModelAndView model = new ModelAndView("admission");
		return model;
	}

	@ModelAttribute
	public void commonsMessage(Model model1) {
		model1.addAttribute("maMsg", "This message is from @modelAttribute");
	}
//implementing BindingResult to validate the form.
	@RequestMapping(value = "/submit.html", method = RequestMethod.POST)
	public ModelAndView successPage(@Valid @ModelAttribute("student1") StudentBean student1, BindingResult result) {
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("admission");
			return model;
		}
		
		ModelAndView model = new ModelAndView("successpage");
		model.addObject("msg", "This message is from successmethod.");
		return model;
	}
}
