package org.wlrobotics.java.main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.wlrobotics.java.main.visionProto.visionGear;

public class VisionGearMessager {
	
	boolean imageVaild = true;
	int vertOffsetPx = 100;
	int horOffsetPx = 100;
	double angleD = 0;
	double distanceIn = 60;
	
	Socket socket;
	
	public visionGear makeMessage(boolean imageValid, int vertOffsetPx, int horOffsetPx, double angleD, double distanceIn){
		visionGear.Builder gearTest = visionGear.newBuilder();
		gearTest.setImageValid(imageValid);
		gearTest.setVertOffsetPx(vertOffsetPx);
		gearTest.setHorOffsetPx(horOffsetPx);
		gearTest.setAngleD(angleD);
		gearTest.setDistanceIn(distanceIn);
		return gearTest.build();
	}
	
	public void sendMessage() throws UnknownHostException, IOException{
			socket = new Socket("localhost", 100);
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			
			out.writeObject(makeMessage(imageVaild, vertOffsetPx, horOffsetPx, angleD, distanceIn));
	}
	
	public void closeConnection() throws IOException{
		socket.close();
	}
}
