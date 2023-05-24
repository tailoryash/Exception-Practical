package com.yash.exception;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int num1 = scn.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = scn.nextInt();
        try{
            System.out.println("Division of given two numbers is :" + (num1/num2));
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(num2 == 0){
                System.err.println("Can't divide by zero");
            }else{
                System.out.println("Division Successfully Completed!");
            }
        }
    }
}
