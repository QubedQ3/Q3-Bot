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
            case("channel"):
                //TODO When user enters this command, it ask them what channel/room they want to switch to on an already connected network.
                break;
            default:
                System.out.println("Unknown Command");
        }
    }
}