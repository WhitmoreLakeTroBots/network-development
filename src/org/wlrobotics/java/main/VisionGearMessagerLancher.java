package org.wlrobotics.java.main;

import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;

import org.wlrobotics.java.main.VisionGearMessager;

public class VisionGearMessagerLancher {
	
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException, ConnectException {
		
		VisionGearMessager message = new VisionGearMessager();
		// TODO Auto-generated method stub
		System.out.println("Starting in 5...");
		Thread.sleep(5000);
		System.out.println("I'm done waiting for you!");
		message.connect();
		System.out.println("Connected?");
		while(true){
			System.out.println("RUNNING");
			message.changeMessage();
			message.sendMessage();
			Thread.sleep(100);
		}
	}
}