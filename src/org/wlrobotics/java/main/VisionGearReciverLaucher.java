package org.wlrobotics.java.main;

import java.io.IOException;

import org.wlrobotics.java.main.VisionGearReciver;
import org.wlrobotics.java.main.visionProto.visionGear;

public class VisionGearReciverLaucher {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		System.out.println("Starting");
		visionGear data;
		VisionGearReciver recive = new VisionGearReciver();
		System.out.println("Looking for a client...");
		//recive.acceptConnection();
		System.out.println("Client found!");
		while(true){
			System.out.println("RUNNING");
			data = recive.reciveGearData();
			System.out.println("VertOffsetPx: " + data.getVertOffsetPx());
			data = null;
			Thread.sleep(10);
		}
	}
}
