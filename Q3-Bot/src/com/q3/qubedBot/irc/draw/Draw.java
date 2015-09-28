package com.q3.qubedBot.irc.draw;

public interface Draw {

	public void open();
	
	public void close();
	
	public boolean addParticipant(String name, String[]...args);
	
	public String getWinner();
}
