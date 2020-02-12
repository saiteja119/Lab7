package com.CapG.Lab7.Exercise4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Grading {
	public static HashMap getStudents(HashMap map)
	{
		Set e = map.entrySet();
		Iterator it=e.iterator();
		HashMap<Integer,String> out=new HashMap<>();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			Integer val=(int)me.getValue();
			if(val>=90)
			{
				out.put((Integer) me.getKey(), "Gold");
			}
			else if(val<=89 && val>=80)
			{
				out.put((Integer) me.getKey(), "Silver");
			}
			else if(val<=79 && val>=70)
			{
				out.put((Integer) me.getKey(), "Bronze");
			}
		}
		return out;
	}
	
}
