package com.CapG.Lab7.Exercise2;

import java.util.HashMap;
import java.util.Map;

public class ArraySequence {
	Map sequence(char ch[])
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int freq[] = new int[26];
		for(int loop=0;loop<ch.length;loop++)
		{
			freq[ch[loop]-'a']++;
		}
		for(int loop=0;loop<ch.length;loop++)
		{
			if(freq[ch[loop]-'a']!=0)
			{
				map.put(ch[loop],freq[ch[loop]-'a']);
				freq[ch[loop]-'a']=0;
			}
		}
		return map;
	}
}
