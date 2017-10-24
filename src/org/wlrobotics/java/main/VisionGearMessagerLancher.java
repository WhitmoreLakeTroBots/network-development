package org.wlrobotics.java.main;

import java.io.IOException;
import java.net.UnknownHostException;

import org.wlrobotics.java.main.VisionGearMessager;

public class VisionGearMessagerLancher {
	
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		System.out.println("Hello Gradle...");
		VisionGearMessager message = new VisionGearMessager();
		// TODO Auto-generated method stub
		while(true){
			System.out.println("Hello Gradle...");
			message.sendMessage();
			Thread.sleep(100);
		}
	}
}
