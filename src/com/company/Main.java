package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Text example_1 = new Text();
        Scanner in = new Scanner(System.in);
        System.out.print("Input the text: ");
        String text = in.nextLine();
        char[] chArray = text.toCharArray();
        System.out.println("Old text: "+text);
        example_1.transform(chArray);

        text = String.valueOf(chArray);
        System.out.println("New text: "+text);
    }
}
