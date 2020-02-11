package com.CapG.Lab7.Exercise5;
import java.util.*;
public class Min2ndELe {
	int getSecondSmallest(int arr[])
	{
		List<Integer> al = new ArrayList<Integer>();
		for(int insert=0;insert<arr.length;insert++)
		{
			al.add(arr[insert]);
		}
		/*Set<Integer> sa = new TreeSet<>(al);
		Object[] obj = sa.toArray();
		int ele=(int)obj[1];
		return ele;*/
		Collections.sort(al);
		Object[] obj=al.toArray();
		int ele =(int)obj[1];
		return ele;
	}
}
