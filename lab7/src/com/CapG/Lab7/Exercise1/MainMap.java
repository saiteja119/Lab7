package com.CapG.Lab7.Exercise1;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {
	public static void main(String[] args)
	{
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		map.put(1,85);
		map.put(2,960);
		map.put(3,97);
		map.put(4,88);
		SortedMap sm =new SortedMap();
		System.out.println(sm.getValues(map));
	}
}
