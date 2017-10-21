package protobuf;

import protobuf.visionProto.visionBoiler;
import protobuf.visionProto.visionGear;

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
