package com.box2;

public class Box5 extends Box3 {

	private static int L  = 39;
	private static int W  = 27;
	private static int H  = 23;

	public Box5(int length, int width, int height)  {
		super(length, width, height);
	}

	@Override
	public boolean validate(int length, int width, int height) {
		if (length < L  && width < W  && height < H ) {
		return true;
		} else {
		return false;
		}
	}


}
