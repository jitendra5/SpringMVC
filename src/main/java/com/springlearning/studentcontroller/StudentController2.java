package com.springlearning.studentcontroller;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//implementing @ModelAttribute
@Controller
public class StudentController2 {
	@RequestMapping(value = "/admissions.html", method = RequestMethod.GET)
	public ModelAndView helloStudent() {
		ModelAndView model = new ModelAndView("admission");
		return model;
	}

	@ModelAttribute
	public void commonMethod(Model model){
		model.addAttribute("maMsg", "Welcome to springMVC world." +"\n"+"This msg is from @managedAtrribute at method level.");
	}
	
	@RequestMapping(value = "/success.html", method = RequestMethod.POST)
	public ModelAndView successMethod(@ModelAttribute("student 1") Student student1) {
		ModelAndView model = new ModelAndView("success");
		model.addObject("msg", "Hi " + student1.getStudentName() + " . Your roll no is" + student1.getStudentNumber());
		model.addObject("student1", student1);
		return model;
	}

	/*
	 * If we use @ModelAttribute, we can avoid the extra steps of instanstiating
	 * the bean class and passing the parameters to it.(mNkqbrU6JXhB)
	 * 
	 * @RequestMapping(value = "/successpage.html", method = RequestMethod.POST)
	 * public ModelAndView successMethod(@RequestParam("studentName") String
	 * studentName,
	 * 
	 * @RequestParam("studentNumber") int studentNumber) {
	 * 
	 * Student student1 = new Student(); student1.setStudentName(studentName);
	 * student1.setStudentNumber(studentNumber); ModelAndView model = new
	 * ModelAndView("success"); model.addObject("msg", "welcome! " +
	 * studentName); model.addObject("student1", student1);
	 * 
	 * return model;
	 * 
	 * }
	 */
}
