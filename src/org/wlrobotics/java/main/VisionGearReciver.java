package org.wlrobotics.java.main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.wlrobotics.java.main.visionProto.visionGear;

public class VisionGearReciver {
	
	ServerSocket serverSocket;
	Socket socket;
	ObjectInputStream in;
	
	public VisionGearReciver() throws IOException{
	serverSocket = new ServerSocket(100);
	socket = serverSocket.accept();
	
	}
	
	void acceptConnection() throws IOException{
		socket = serverSocket.accept();
	}
	
	visionGear reciveGearData() throws ClassNotFoundException, IOException{
		in = new ObjectInputStream(socket.getInputStream());
		visionGear data = (visionGear) in.readObject();
		return data;
	}
	
	void closeConnection () throws IOException{
		serverSocket.close();
		socket.close();
	}
}
