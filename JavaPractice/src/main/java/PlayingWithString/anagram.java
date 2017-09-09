package PlayingWithString;

import java.util.HashMap;

public class anagram {

	public static void main(String[] args) {
		HashMap<Character,Integer> map1=new HashMap<>();
		HashMap<Character,Integer> map2=new HashMap<>();
		String s1="iqpwoeuryt";
		String s2="qwertyuiop";
		boolean isAnagram=true;
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				if(!map1.containsKey(s1.charAt(i))){
					map1.put(s1.charAt(i), 1);
				}else{
					int val=map1.get(s1.charAt(i))+1;
					map1.replace(s1.charAt(i), val);
				}
			}
			System.out.println(map1.toString());
			for(int i=0;i<s2.length();i++){
				if(!map2.containsKey(s2.charAt(i))){
					map2.put(s2.charAt(i), 1);
				}else{
					int val=map2.get(s2.charAt(i))+1;
					map2.replace(s2.charAt(i), val);
				}
			}
			System.out.println(map2.toString());
			for(int i=0;i<s2.length();i++){
				if(map1.get(s1.charAt(i))!=map2.get(s2.charAt(i))){
					isAnagram=false;
					break;
				}
			}
		}else{
			isAnagram=false;
		}
		if(isAnagram){
			System.out.println("Yes the strings are indeed anagarams");
		}else{
			System.out.println("Well they are not anagrams");
		}
	}

}
