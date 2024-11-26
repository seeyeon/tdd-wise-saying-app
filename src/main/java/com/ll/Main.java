package com.ll;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //lab1();
        
        lab2();
    }

    private static void lab2() {
        InputStream in = new ByteArrayInputStream("안녕\n잘가".getBytes());
        Scanner sc = new Scanner(in);  //선입력 된 내용 읽는다.

        System.out.println("명령) ");
        String cmd = sc.nextLine().trim();

        System.out.println("입력한 명령: " +  cmd);
    }

    private static void lab1() {
        
        Scanner sc = new Scanner(System.in); //사람의 키보드 입력

        System.out.println("명령) ");
        String cmd = sc.nextLine().trim();

        System.out.println("입력한 명령: " +  cmd);
    
    }
}