package com.q3.qubedBot.irc.advert;

public interface Advert {

	public void start();
	
	public void stop();
	
	public void delay(long delay);
	
	public void setInterval(long interval);
}
