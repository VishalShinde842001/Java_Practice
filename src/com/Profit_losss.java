package com;

import java.util.Scanner;

public class Profit_losss {
    public static void main(String[] args) {
        System.out.println("Enter the CP and SP");
        Scanner sc=new Scanner(System.in);
        double CP=sc.nextDouble();
        double SP=sc.nextDouble();
        findProfitLoss(CP,SP);
    }
    public static void findProfitLoss(double CP ,double SP){
        if(SP>CP){
            System.out.println("Profit="+ (SP-CP));
        }
        else if(CP>SP){
            System.out.println("Loss="+(CP-SP));
        }
        else {
            System.out.println("NO Profit No Loss");
        }
    }
}
