package claw0ed.lab;

public class Lab18 {

	public static void main(String[] args) {
		// 연습문제 7-7, 7-8, 7-9, 7-10, 7-15, 7-17, 8-2, 8-8
		
		// 7-15
		class Unit {}
		class AirUnit extends Unit {}
		class GroundUnit extends Unit {}
		class Tank extends GroundUnit {}
		class AirCraft extends AirUnit {}
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
		u = (Unit)ac;
		u = ac;
		GroundUnit gu = (GroundUnit)u;
		AirUnit au = ac;
		t = (Tank)u;
		// GroundUnit gu = t;
	}

}
