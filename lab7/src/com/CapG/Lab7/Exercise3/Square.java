package com.CapG.Lab7.Exercise3;

import java.util.*;

public class Square {
	Map<Integer,Integer> ss =new HashMap<Integer,Integer>();
	Map getSquare(int arr[])
	{
		for(int loop=0;loop<arr.length;loop++)
		{
			ss.put(arr[loop],arr[loop]*arr[loop]);
		}
		return ss;
	}
}
