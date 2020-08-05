package com.ismaeel.autowired;

public class Body {

	private Heart heart;

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startHeart()
	{
		if(heart != null)
		{
			heart.start();
			System.out.println("You are alive");
		}
		else
		{
			System.out.println("You are dead");
		}
		
	}
	
}
