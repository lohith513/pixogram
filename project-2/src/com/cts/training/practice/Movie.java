package com.cts.training.practice;

public enum Movie {
	SILVER,
	GOLD,
	DIAMOND;
    	
	public int getcost() 
	{
		if(this==SILVER)
			return 70;
		else if(this==GOLD)
			return 100;
		else if(this==DIAMOND)
			return 150;
		return 0;
		
	
	}
	

}
