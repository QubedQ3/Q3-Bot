/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.q3.qubedBot;

import java.util.Scanner;

public class ConsoleCommnadHelper {

    /**
     *
     * @param command
     * @return 
     */
    public String runConsoleCommand(String command) {
    
	  System.out.println("Enter Command: ");
     
      try (Scanner scanIn = new Scanner(System.in)) {
          command = scanIn.nextLine();
          return command;
          
      }            
  }
}