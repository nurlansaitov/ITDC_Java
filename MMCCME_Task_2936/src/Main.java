package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short a=0,b=0;
        System.out.print("a: ");
        a = in.nextShort();
        System.out.print("b: ");
        b = in.nextShort();
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(c);
    }
}