package protobuf;

import java.io.IOException;

import protobuf.VisionGearReciver;

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
