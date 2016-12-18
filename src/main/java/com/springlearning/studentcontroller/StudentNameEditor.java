package com.springlearning.studentcontroller;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {


	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(studentName.contains("Mr.")||studentName.contains("Ms.")){
			setValue(studentName);
		}
		else
		{
			studentName="Ms. "+studentName;
			setValue(studentName);
		}
	}


}
