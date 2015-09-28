package com.q3.qubedBot.helpers;

import com.q3.qubedBot.Main;
import com.q3.qubedBot.ServBot;


public class ConsoleCommnadHelper {

	/**
	 *
	 * @param command
	 * @return
	 */
	public void runConsoleCommand(String message) {
		switch(message.split(" ")[0]){
		case("say"):
			//TODO read server + channel and print message to that channel or entire server
			break;
		case("join"):
			//TODO ask series of questions to either join a new server or channel on a server already connected to.
			break;
		case("chat"):
			//TODO When user enters this command, it ask them what channel/room they want to switch to on an already connected network.
			chat(message);
			break;
		default:
			System.out.println("Unknown Command");
		}
	}

	private void chat(String command) {
		String[] splitMessage = command.split(" ");
		if (splitMessage.length < 3 || splitMessage.length > 3 || !splitMessage[2].startsWith("#")){
			System.out.println("Syntax Error. Correct usage is: chat <server> <#channel>. Channel needs to start with a # symbol");
			return;
		}
		ServBot bot = Main.getBotConnectedTo(splitMessage[1]);
		if (bot == null){
			System.out.println("I am not connected to that server. Please use join so you can send messages there");
			return;
		}
		String channel = splitMessage[2];
		if (!bot.getIRCServer().isConnectedTo(channel)){
			System.out.println("I am not connected to that channel. Please use join so you can send messages there"); //TODO do we want to get the bot to joint eh channel?
			return;
		}
		//Successfully engaged in chat mode
		//TODO make channel specifically output to the console even when not in verbose mode.
		System.out.println("You are now successfully talking on " + channel  + ". Use \"!endchat\" to end chat mode and \"!switch\" to change channels");
		while (true){
			String in = Main.readConsole("");
			if (in.startsWith(ServBot.commandStart) || in.startsWith("!")){//keep ! as a defult for the console. / still used by irc
				String commandIn;
				if (in.startsWith(ServBot.commandStart)){
					commandIn = in.substring(ServBot.commandStart.length());
				}else {
					commandIn = in.substring(1);
				}
				switch (commandIn.split(" ")[0]){
				case("chat"):
					//TODO what should this command do currently? nothing, enter a new chat mode?
					break;
				case("switch"):
					//TODO change channel/server chatmode is connected to
					break;
				case("endchat"):
					System.out.println("Exiting chat mode");
					return;
				default:
					runConsoleCommand(commandIn);
				}
			}else{
				bot.sendMessage(channel, in);
			}
		}

	}
}
