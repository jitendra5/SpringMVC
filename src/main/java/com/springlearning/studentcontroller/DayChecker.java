package com.springlearning.studentcontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayChecker extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		Calendar cal= Calendar.getInstance();
		int day=cal.get(cal.DAY_OF_WEEK);
		if(day==1){
			response.getWriter().write("The website is closed on sunday. get back to us on monday.");
		return false;
		}
		
		return true;
	}
}
