package com.drawingapp.services;

import javax.inject.Inject;

import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;

public class DrawSquare implements DrawShape {

	private String color;
	private Integer edge;

	@Inject
	public DrawSquare(@ColorValue String color, @EdgeValue Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Square of color : " +  color + " and edge : " + edge );		
	}	

}
