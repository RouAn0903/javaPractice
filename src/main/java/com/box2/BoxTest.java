package com.box2;

public class BoxTest {

	public static void main(String[] args) {
		
		Box3 b3 = null;
		Box5 b5 = null;
		int length=30;
		int width=13;
		int height=12;
		int select = 3;

		switch (select) {
		case 3:
			b3 = new Box3(length, width, height);
			if (b3.cont){
			System.out.println("Things could place in the box3 => " + b3.validate(length, width, height));
			}
			break;
		case 5:
			b5 = new Box5(length, width, height);
			if (b5.cont){
			System.out.println("Things could place in the box5 => " + b5.validate(length, width, height));
			}
			break;
		
		default:
		 		System.out.println("Please select the right box.");
		}
		
	}

}
