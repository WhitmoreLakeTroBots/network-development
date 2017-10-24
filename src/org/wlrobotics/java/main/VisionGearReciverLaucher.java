package org.wlrobotics.java.main;

import java.io.IOException;

import org.wlrobotics.java.main.VisionGearReciver;

public class VisionGearReciverLaucher {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		VisionGearReciver recive = new VisionGearReciver();
		while(true){
			recive.acceptConnection();
			recive.reciveGearData();
			Thread.sleep(0);
		}
	}
}
