

import java.util.Scanner;
import java.lang.Math;

public class Triangle {

        public static double triangleSquare (int a, int b, int c) throws  Exception {
            if (a<=0 || b<=0 || c<=0) throw new Exception();
            double halfperim = (a+b+c)/2;
            return Math.sqrt(halfperim*(halfperim-a)*(halfperim-b)*(halfperim-c));
        }
    }