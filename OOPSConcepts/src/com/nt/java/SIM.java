package com.nt.java;

public interface SIM {

	public void call();
	
	public void sms();
	
	public default void vedioCall() {
		System.out.println("3G new Feature" );
	}
}
