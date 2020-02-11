package com.CapG.Lab7.Exercise3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Square s =new Square();
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] =new int[size];
		for(int loop=0;loop<size;loop++)
		{
			arr[loop] = sc.nextInt();
		}
		System.out.println(s.getSquare(arr));
	}
}
