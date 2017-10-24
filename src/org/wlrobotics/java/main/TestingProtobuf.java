package org.wlrobotics.java.main;

import org.wlrobotics.java.main.visionProto.visionBoiler;
import org.wlrobotics.java.main.visionProto.visionGear;

public class TestingProtobuf {
	
	void test(){
	visionGear.Builder gearTest = visionGear.newBuilder();
	gearTest.setVertOffsetPx(360);
	}
	
	static visionGear fillInfo(){
		visionGear.Builder gearTest = visionGear.newBuilder();
		gearTest.setVertOffsetPx(360);
		return gearTest.build();
	}
}
