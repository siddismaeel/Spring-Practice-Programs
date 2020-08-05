package com.ismaeel.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Body {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	
	
	

	public Body() {
		super();
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void start() {
		if (heart != null) {
			System.out.println("You are alive");
			heart.pump();

		} else {
			System.out.println("you are dead");
		}
	}

}
