package moc;

import java.util.HashMap;

public class javaprgm1 
{
	public static void main(String[] args) 
	{
		String s ="aaabbbb11cccdeeefff";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch))
			{
				Integer count = map.get(ch);
				count++;
				map.replace(ch,count);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		for(Character key:map.keySet())
		{
			System.out.print(key+""+map.get(key)+" ");
		}
		
	}

}
