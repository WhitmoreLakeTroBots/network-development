package protobuf;

import java.io.IOException;
import java.net.UnknownHostException;

import protobuf.VisionGearMessager;

public class VisionGearMessagerLancher {
	
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		VisionGearMessager message = new VisionGearMessager();
		// TODO Auto-generated method stub
		while(true){
			message.sendMessage();
			Thread.sleep(100);
		}
	}
}
