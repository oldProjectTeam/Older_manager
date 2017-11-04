package com.older.junit.test;

import java.util.Arrays;

import com.sun.mail.handlers.image_gif;

public class MaxTest {
	public static void main(String[] args) {
		int[] datas = new int[] { 26, 59, 30, 84, 27, 77, 176, 1182, 487, 188, 60,
				23};
		int maxValue=datas[0];
		int maxIndex=0;
		int minValue=datas[0];
		int minIndex=0;
		for (int i = 0; i < datas.length; i++) {
			if (maxValue<datas[i]) {
				maxValue=datas[i];
				maxIndex=i;
			}
			if (minValue>datas[i]) {
				minValue=datas[i];
				minIndex=i;
			}
		}
        System.out.println(maxValue);
        System.out.println(maxIndex+1);
        System.out.println("------------------------");
        System.out.println(minValue);
        System.out.println(minIndex+1);
	}
}
