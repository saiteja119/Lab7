package com.CapG.Lab7.Exercise6;
import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class AgeValid {
	int DateVal(int year,int month,int day)
	{
		LocalDate d = LocalDate.of(year,month,day);
		LocalDate d2 =LocalDate.now(); 
		Period p =Period.between(d, d2);
		return p.getYears();
	}
	void ageValid(Map map)
	{
		Set<Entry<Integer,Integer>> entries=map.entrySet();
		for(Map.Entry<Integer,Integer> entry : entries)
		{
		if(entry.getValue()>18)
		{
			System.out.println("key: "+entry.getKey()+"    Val: "+entry.getValue());
		}
		}
	}
}