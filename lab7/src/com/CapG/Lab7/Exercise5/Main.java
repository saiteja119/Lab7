package com.CapG.Lab7.Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Min2ndELe me =new Min2ndELe();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int insert=0;insert<size;insert++)
		{
			arr[insert]=sc.nextInt();
		}
		System.out.println(me.getSecondSmallest(arr));
	}

}
