package com.CapG.Lab7.Exercise1;

import java.util.*;

public class SortedMap {
	ArrayList<Integer> getValues(Map<Integer,Integer> map)
	{
		ArrayList<Integer> al = new ArrayList<Integer>(map.values());
		Collections.sort(al);
		return al;
	}
}
