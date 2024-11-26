package com.ll;

import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        lab1();
        //lab2();

        //lab3();
        //lab4();
    }


    private static void lab4() {
        System.out.println("===시작===");

        //출력이 모니터로 안되도록 설정
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        System.out.println("안녕하세요.");  //기본적으로 모니터에 출력되는데 output에 쌓임.
        System.out.println("반갑습니다.");
        System.out.println("output에 쌓이는 중입니다.");


        //다시 모니터로 출력되도록 하는 설정
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.println("===끝===");
        System.out.println("출력: " +  output.toString());


        //output자원 해제
        try {
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void lab3() {

        System.out.println("===시작===");

        System.out.println("안녕하세요.");  //기본적으로 모니터에 출력
        System.out.println("반갑습니다.");

        System.out.println("===끝===");
    }


    private static void lab2() {
        InputStream in = new ByteArrayInputStream("안녕\n잘가".getBytes());
        Scanner sc = new Scanner(in);  //선입력 된 내용 읽는다.

        System.out.println("명령) ");
        String cmd = sc.nextLine().trim();

        System.out.println("입력한 명령: " +  cmd);

        System.out.println("명령) ");
        cmd =  sc.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);

    }

    private static void lab1() {
        
        Scanner sc = new Scanner(System.in); //사람의 키보드 입력

        System.out.println("명령) ");
        String cmd = sc.nextLine().trim();

        System.out.println("입력한 명령: " +  cmd);
    
    }
}