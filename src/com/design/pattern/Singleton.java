package com.design.pattern;

public class Singleton 
{
	private static Singleton uniqueInstance;
	
	public static synchronized Singleton getInstance()
	{
		if(uniqueInstance == null)
		{
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}

}
