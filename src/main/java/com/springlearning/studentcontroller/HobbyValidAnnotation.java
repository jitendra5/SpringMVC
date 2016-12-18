package com.springlearning.studentcontroller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidationClass.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface HobbyValidAnnotation {
	String listOfHobbies() default "Music|Football|cricket|Hockey";
	String message() default "please provide a valid hobby." + "accepted hobbies are- Music, Football, cricket,Hockey";
	Class<?>[] groups() default{};
	Class<? extends Payload> [] payload() default{};
}
