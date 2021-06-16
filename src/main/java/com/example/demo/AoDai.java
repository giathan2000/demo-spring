package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AoDai implements Outfit{

	@Override
	public void wear() {
		System.out.println("Dang mac ao dai");
		
	}
	
}
