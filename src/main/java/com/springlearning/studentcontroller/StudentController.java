package com.springlearning.studentcontroller;

import java.util.Map;

import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping(value="/admissionform.html", method=RequestMethod.GET)
	public ModelAndView getForm(){
		ModelAndView model=new ModelAndView("admission");
		return model;
	}
	/*
	@RequestMapping(value="/submission.html", method=RequestMethod.POST)
	public ModelAndView submissionForm(@RequestParam("sname") String name, @RequestParam("snum") String number ){
		ModelAndView model=new ModelAndView("success");
		model.addObject("msg","Hello "+name+". \n Your number is "+number);
		return model;
	}*/
	@RequestMapping(value="/submission.html", method=RequestMethod.POST)
	public ModelAndView submissionForm(@RequestParam Map<String,String> students){
		
		ModelAndView model= new ModelAndView("success");
		model.addObject("msg", "Hello "+students.get("sname")+" . Your Id is "+students.get("snum"));
		return model;
	}
}
