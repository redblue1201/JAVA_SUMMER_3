package com.java.ex;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        float pi = 3.14F;

        int sum1 = num1 + num2;
        System.out.println(sum1);

        int div1 = num2 / num1;
        System.out.println(div1);

        float div2 = num2 / num1;
        System.out.println(div2);

        float div3 = (float)num2 / (float) num1;
        System.out.println(div3);

       /* int sum2 = num1 + (int)pi;
        System.out.println(sum2);

        Scanner scan = new Scanner(System.in);
        System.out.println("아무값이나 입력해주세요");
        int num = Integer.parseInt(scan.next());
        String a = "";
        a = ((0 == (num%3)) ? "맞습니다":"아닙니다");
        System.out.println(a);
        */
        /*Scanner scan = new Scanner(System.in);
        System.out.println("수학점수입력");
        int math = Integer.parseInt(scan.next());
        System.out.println("국어점수입력");
        int kor = Integer.parseInt(scan.next());
        System.out.println("영어점수입력");
        int eng = Integer.parseInt(scan.next());

        float sum = math + kor + eng;
        float avg = sum/3;
        System.out.println("과목에 합은"+ sum);
        System.out.println("과목에 평균은"+ avg);

        if (avg < math){
            System.out.println("수학점수는 평균보다 높습니다");
        }
        else if (avg > math){
            System.out.println("수학점수는 평균보다 낮습니다");
        }
        else{
            System.out.println("평균과 같습니다");
        }
        if (avg < kor){
            System.out.println("국어점수는 평균보다 높습니다");
        }
        else if (avg > kor){
            System.out.println("국어점수는 평균보다 낮습니다");
        }
        else{
            System.out.println("평균과 같습니다");
        }
        if (avg < eng){
            System.out.println("영엉점수는 평균보다 높습니다");
        }
        else if (avg > eng){
            System.out.println("영어점수는 평균보다 낮습니다");
        }
        else{
            System.out.println("평균과 같습니다");
        }
*/      Scanner scan = new Scanner(System.in);
        System.out.println("1부터3까지 고르시오");
        int result = Integer.parseInt((scan.next()));

        switch (result % 3){
            case 1: {
                System.out.println();
                break;
            }
            case 2: {
                System.out.println();
                break;
            }
            case 3: {
                System.out.println();
                break;
            }
        }


    }
}
