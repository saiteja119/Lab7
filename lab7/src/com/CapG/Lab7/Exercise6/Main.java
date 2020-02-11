package com.CapG.Lab7.Exercise6;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Main {
	public static void main(String[] args){
		AgeValid av = new AgeValid();
		Map<Integer,Integer> map =new HashMap<>();
		map.put(111,av.DateVal(1998,6,9));
		map.put(222,av.DateVal(1997,6,9));
		map.put(333, av.DateVal(1999,8,3));
		map.put(444, av.DateVal(2009,2,19));
		map.put(555, av.DateVal(2000, 8, 3));
		map.put(666,av.DateVal(2010, 2, 19));
		av.ageValid(map);
	}
}