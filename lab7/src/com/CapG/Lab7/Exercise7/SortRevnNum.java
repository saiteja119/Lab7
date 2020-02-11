package com.CapG.Lab7.Exercise7;

import java.util.Arrays;

public class SortRevnNum {
	public int[] revSorted(int arr[])
	{
		StringBuffer arr2[]=new StringBuffer[arr.length];
		 for(int loop=0;loop<arr.length;loop++)
		 {
			arr2[loop]=new StringBuffer(""+arr[loop]);
			arr2[loop].reverse();
		 }
		 
		 int arr3[]=new int[arr.length];
		 for(int loop=0;loop<arr.length;loop++)
		 {
			arr3[loop]=Integer.parseInt(arr2[loop].toString()); 
		 }
		 Arrays.sort(arr3);
		 return arr3;
	}
}
