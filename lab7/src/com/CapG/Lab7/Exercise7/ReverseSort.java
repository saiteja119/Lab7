package com.CapG.Lab7.Exercise7;

import java.util.*;

public class ReverseSort {
	Object[] reverseNum(int arr[])
	{
		Set<Integer> al =new HashSet<Integer>();
		String str;
		String rev="";
		for(int loop=0;loop<arr.length;loop++)
		{
			str=Integer.toString(arr[loop]);
			for(int loop1=str.length()-1;loop1>=0;loop1--)
			{
				rev =rev+str.charAt(loop1);
			}
			al.add(Integer.parseInt(rev));
		}
		Object[] temp =al.toArray();
		return temp;
	}
}