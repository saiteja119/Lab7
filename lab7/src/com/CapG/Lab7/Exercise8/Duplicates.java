package com.CapG.Lab7.Exercise8;

import java.util.TreeSet;

public class Duplicates {
	public static void modifyArray(int[] arr)
	{
		TreeSet<Integer> s=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			s.add(arr[i]);
		}
		System.out.println(s);
	}
}

