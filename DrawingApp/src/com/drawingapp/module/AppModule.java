package com.drawingapp.module;


import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import com.drawingapp.requests.SquareRequest;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
		bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
		bind(SquareRequest.class).in(Scopes.SINGLETON);
	}
	
}
