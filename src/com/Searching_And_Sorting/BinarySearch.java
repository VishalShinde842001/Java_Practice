package com.Searching_And_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("enter the elements of array :");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to check its presence in array");
        int key=sc.nextInt();
        if(search(arr,arr.length,key)==-1){
            System.out.println("Key not found...");
        }
        else{
        System.out.println("Key found at Index "+search(arr,arr.length,key));}
    }
    public static int search(int[] arr,int n,int key){
        Arrays.sort(arr);
        int start=0;int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

}
