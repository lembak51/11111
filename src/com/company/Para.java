package com.company;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Вова on 24.09.2015.
 */

public class Para{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ax^2 + bx + c = 0
        double a;
        double b;
        double c;

        System.out.println("Введіть а:");
        a = Double.parseDouble(scanner.next());

        System.out.println("Введіть b:");
        b = Double.parseDouble(scanner.next());

        System.out.println("Введіть c:");
        c = Double.parseDouble(scanner.next());


        double d = b*b - 4*a*c;
        double x = ( -b + Math.sqrt(d))/ (2*a);
        double y = ( -b - Math.sqrt(d) )/ (2*a);
        System.out.println(x);
        System.out.println(y);


    }
}