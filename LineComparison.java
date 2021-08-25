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
		        System.out.println("Enter Coordinates of next line : ");
		        System.out.println("Enter x1 of line 2 : ");
		        Scanner x3s = new Scanner(System.in);
		        int x3 = x3s.nextInt();
		        Scanner x4S = new Scanner(System.in);
		        System.out.println("Enter x2 of line 2 : ");
		        int x4 = x4S.nextInt();
		        Scanner y3s = new Scanner(System.in);
		        System.out.println("Enter y1 of line 2 : ");
		        int y3 = y3s.nextInt();
		        System.out.println("Enter y2 of line 2 : ");
		        Scanner y4s = new Scanner(System.in);
		        int y4 = y4s.nextInt();
		        int c = x4 - x3;
		        int d = y4 - y3;
		        double line1 = Math.sqrt((a*a)+(b*b));
		        double line2 = Math.sqrt((c*c)+(d*d));
		        if (line1 == line2)
		        {
		            System.out.println("Both the lines are equal in length.");
		        }
		        else if (line1 > line2){
		            System.out.println("Line 1 is greater than Line 2");
		        }
		        else if (line2 > line1)
		        {
		            System.out.println("Line 2 is greater than Line 1");
		        }
		    }

	}







