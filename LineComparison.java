package com.LineComparisonComputation;
import java.util.Scanner;
public class LineComparison {
	 public static void main(String[] args) {
		 
	 int x1, x2, y1, y2,a,b;
     System.out.println("Enter x1 ");
     Scanner x1s = new Scanner(System.in);
	 x1 = x1s.nextInt();
	 System.out.println("Enter x2 ");
	 Scanner x2s = new Scanner(System.in);
     x2 = x2s.nextInt();
     System.out.println("Enter y1 ");
     Scanner y1s = new Scanner(System.in);
     y1 = y1s.nextInt();
     System.out.println("Enter y2 ");
     Scanner y2s = new Scanner(System.in);
     y2 = y2s.nextInt();
      a = x2 - x1;
	 b = y2 - y1;
 System.out.println("Distance between the given coordinates are : "+Math.sqrt((a * a) + (b * b)));
		     }
		 }








