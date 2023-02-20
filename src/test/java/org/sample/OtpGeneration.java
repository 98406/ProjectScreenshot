package org.sample;

import java.util.Random;

public class OtpGeneration {

	public static void main(String[] args) {
		Random r = new Random();
		int in = r.nextInt();
		System.out.println(in);
		int abs = Math.abs(in);
		System.out.println(abs);
		String vi = String.valueOf(abs);
		CharSequence subSequence = vi.subSequence(0, 6);
		System.out.println(subSequence);

	}

}
