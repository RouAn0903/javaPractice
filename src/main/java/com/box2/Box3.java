package com.box2;

public class Box3 {
	private int length;
	private int width;
	private int height;

	private static int L  = 23;
	private static int W  = 14;
	private static int H  = 13;

	public boolean cont;

	public Box3(int length, int width, int height) {
		if (length > 0 && width > 0 && height > 0) {
			this.length = length;
			this.width = width;
			this.height = height;
			cont = true;
		} else {
			System.out.println("Need to set Box values > 0");
			cont = false;
		}
	}

	public boolean validate(int length, int width, int height) {
		if (length < L  && width < W  && height < H ) {
				return true;
			} else {
				return false;
			}
	}

}

