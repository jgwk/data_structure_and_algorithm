package test;

import java.util.Random;

public class Prob {
	public static void main(String[] args) {
		Random r = new Random();
		
		int max = 0;
		int min = 0;
		int avg = 0;
		for(int i=0; i<10000; i++) {
			int count = 0;
			/*
			while(r.nextInt(100) > 10) {
				count++;
			}
			*/
			while(true) {
				count++;
				if(r.nextInt(100) < 10) break;
			}
			max = max > count ? max : count;
			min = min < count ? min : count;
			avg += count;
		}
		
		System.out.println("avg : " + avg/10000);
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		
	}
}
