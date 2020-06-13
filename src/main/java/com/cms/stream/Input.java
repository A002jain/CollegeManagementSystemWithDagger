package com.cms.stream;

import java.util.Scanner;

public class Input {
    final static Scanner scanner=new Scanner(System.in);

    public int getInt(String string){
        System.out.println(string);
        return scanner.nextInt(); }

    public String getString(String string){
        System.out.println(string);
        return scanner.next(); }
}
