package com.CapG.Lab7.Exercise7;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		ReverseSort rs = new ReverseSort();
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr=new int[size];
		for(int insert=0;insert<size;insert++)
		{
			arr[insert]=sc.nextInt();
		}
		Object obj[] = rs.reverseNum(arr);
		for(Object o : obj)
		{
			System.out.println(o);
		}
	}
}