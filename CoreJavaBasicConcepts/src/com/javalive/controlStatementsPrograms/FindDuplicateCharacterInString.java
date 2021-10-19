package com.javalive.controlStatementsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacterInString {
	  public void countDupChars(String str){
		  
		    //Create a HashMap 
		    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		 
		    //Convert the String to char array
		    char[] chars = str.toCharArray();
		 
		    /* logic: char are inserted as keys and their count
		     * as values. If map contains the char already then
		     * increase the value by 1
		     */
		    for(Character ch:chars){
		      if(map.containsKey(ch)){
		         map.put(ch, map.get(ch)+1);
		      } else {
		         map.put(ch, 1);
		        }
		    }
		 
		    //Obtaining set of keys
		    Set<Character> keys = map.keySet();
		 
		    /* Display count of chars if it is
		     * greater than 1. All duplicate chars would be 
		     * having value greater than 1.
		     */
		    for(Character ch:keys){
		      if(map.get(ch) > 1){
		        System.out.println("Char "+ch+" "+map.get(ch));
		      }
		    }
		  }
		 
		  public static void main(String a[]){
			FindDuplicateCharacterInString obj = new FindDuplicateCharacterInString();
		    System.out.println("String: JavaLive.com");
		    System.out.println("-------------------------");
		    obj.countDupChars("JavaLive.com");
		  
		    System.out.println("\nString: EONITPark");
		    System.out.println("-------------------------");
		    obj.countDupChars("EONITPark");
		    
		    System.out.println("\nString: Magarpatta City");
		    System.out.println("-------------------------");
		    obj.countDupChars("Magarpatta City");
		    
		    System.out.println("\nString: Hinjewadi IT Park");
		    System.out.println("-------------------------");
		    obj.countDupChars("Hinjewadi IT Park");
		 
		    System.out.println("\nString: #@$@!#$%!!%@");
		    System.out.println("-------------------------");
		    obj.countDupChars("#@$@!#$%!!%@");
		  }
}
