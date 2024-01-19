package com.company;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter a year : ");
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
       if(checkLeap(year)){
           System.out.println(year +" is Leap Year");
       }else{
           System.out.println(year +" is Not Leap Year");
       }
    }
    public static boolean checkLeap(int year){
        if(year%100==0){
            return year%400==0;
        }
        return year % 4 == 0;
    }
}
