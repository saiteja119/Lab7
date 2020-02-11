package com.CapG.Lab7.Exercise7;
import java.util.*;
public class MainRev {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
          for(int index=0;index<size;index++)
          {
        	 arr[index]=scan.nextInt(); 
          }
          SortRevnNum obj = new SortRevnNum();
          int output[]=obj.revSorted(arr);
          for(int i=0;i<output.length;i++)
        	   System.out.println(output[i]);
        scan.close();	
	}
}
