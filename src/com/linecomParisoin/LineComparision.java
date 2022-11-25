package com.linecomParisoin;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision Problem");
		
		double line1X1 = 3.4;
		double line1Y1 = 6.3;
		double line1X2 = 2.9;
		double line1Y2 = 8.2;
		
		double line1Length = (double) Math.sqrt(Math.pow(line1X2 - line1X1, 2) + Math.pow(line1Y2 - line1Y1, 2));
		
		System.out.println("Line point 1 is ("+line1X1+", "+line1Y1+"), point 2 is ("+line1X2+", "+line1Y2+") and length is "+line1Length);
	}

}
