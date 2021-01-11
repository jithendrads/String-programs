import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {

	public static void main(String[] args) {
		String str="have a nice day";
		str=str.replaceAll(" ","");
		System.out.println(str);
		Map<Character,Integer> map=new HashMap<>();
		for(char ch:str.toCharArray())
		{
			System.out.println(map.get(ch));
			if(map.get(ch) == null)
				map.put(ch,1);
			else
				map.put(ch,map.get(ch)+1);
		}
		map.forEach((key,value)->System.out.println(key+" occured "+value));
}
}
			
		

	


