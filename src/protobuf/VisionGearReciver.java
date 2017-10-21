package protobuf;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import protobuf.visionProto.visionGear;

public class VisionGearReciver {
	
	ServerSocket serverSocket;
	Socket socket;
	ObjectInputStream in;
	
	public VisionGearReciver() throws IOException{
	serverSocket = new ServerSocket(100);
	socket = serverSocket.accept();
	in = new ObjectInputStream(socket.getInputStream());
	}
	
	void acceptConnection() throws IOException{
		socket = serverSocket.accept();
	}
	
	visionGear reciveGearData() throws ClassNotFoundException, IOException{
		visionGear data = (visionGear) in.readObject();
		return data;
	}
	
	void closeConnection () throws IOException{
		serverSocket.close();
		socket.close();
	}
}
