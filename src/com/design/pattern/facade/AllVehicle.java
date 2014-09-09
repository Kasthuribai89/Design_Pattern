package com.design.pattern.facade;

public class AllVehicle
{
	private Vehicle nisan;
	private Vehicle honda;
	
	public AllVehicle()
	{
		nisan = new Nisan();
		honda = new Honda();
	}
	
	public void getNisanColor()
	{
		nisan.color();
	}
	
	public void getHondaColor()
	{
		honda.color();
	}
}
