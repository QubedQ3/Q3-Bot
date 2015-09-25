/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.q3.qubedBot;


public class ConsoleCommnadHelper {

    /**
     *
     * @param command
     * @return 
     */
    public void runConsoleCommand(String command) {
    
	  switch(command){
	  case("say"):
		  //TODO read server + channel and print message to that channel or entire server
		  break;
	  case("join"):
		  //TODO ask series of questions to either join a new server or channel on a server already connected to.
		  break;
	  default:
		  System.out.println("Unknown Command");
	  }
  }
}