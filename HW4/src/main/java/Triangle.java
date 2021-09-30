

import java.util.Scanner;
import java.lang.Math;

public class Triangle {
        static int function(int a,int b,int c) {
            int p=a+b+c;
            return p;
        }
        public static void main (String [] args) {
            Scanner scan = new Scanner (System.in);
            System.out.println ("This program calculates the perimeter "+"and the area of a given rectangle");
            System.out.println ("Please enter three length of the "+"triangle's sides");
            System.out.print("a= ");
            int a = scan.nextInt();
            System.out.print("b= ");
            int b = scan.nextInt();
            System.out.print("c= ");
            int c  = scan.nextInt();
            System.out.println("Perimeter:"+function (a,b,c));
            double p1 = (a + b + c) / 2;
            double s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
            System.out.println("Area:"+s);
        }
    }