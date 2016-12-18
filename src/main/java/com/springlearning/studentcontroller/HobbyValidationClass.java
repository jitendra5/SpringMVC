package com.springlearning.studentcontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidationClass implements ConstraintValidator<HobbyValidAnnotation,String>{

	private String listOfHobbies;
	@Override
	public void initialize(HobbyValidAnnotation hobbyValid) {
		this.listOfHobbies=hobbyValid.listOfHobbies();
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext c) {
		if(studentHobby==null){
			return false;
		}
		if(studentHobby.matches(listOfHobbies)){
			return true;
		}
		else{
			return false;	
		}
		
	}

}
