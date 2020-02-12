package com.CapG.Lab7.Exercise4;

import java.util.HashMap;

public class Main {
	public static void main(String args[])
	{
		Grading g = new Grading();
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(11609450, 75);
		map.put(11602650, 81);
		map.put(11608248, 90);
		map.put(11603432, 70);
		System.out.println(g.getStudents(map));
	}
}
