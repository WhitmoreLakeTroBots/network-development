package org.wlrobotics.java.main;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;

public class VisionGearMessagerLancher {

	public static void main(String[] args)
			throws UnknownHostException, IOException, InterruptedException, ConnectException {

		VisionGearMessager message = new VisionGearMessager();
		// TODO Auto-generated method stub
		System.out.println("Starting in 5...");
		Thread.sleep(5000);
		System.out.println("I'm done waiting for you!");
		// message.connect();
		while (true) {
			try {
				message.connect(); // I don't really like this placement, likely
									// to move to a thread init...
				System.out.println("Connected?");
				while (true) {
					Thread.sleep(100);
					System.out.println("RUNNING");
					message.changeMessage();
					message.sendMessage();
				}
			} catch (ConnectException c) {
				// s.printStackTrace();
				// message.connect();
			} catch (SocketException s) {
				// s.printStackTrace();
				// message.connect();
			}
		}
	}
}