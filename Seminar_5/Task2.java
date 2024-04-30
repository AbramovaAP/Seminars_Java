/*---------------------Задача 2-------------------------
 * Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
некоторую букву во втором слове, при этом:
    1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
    порядка следования. (Например, add - egg изоморфны)
    2. буква может не меняться, а остаться такой же. (Например, note - code)

слова «abca» и «zbxz» изоморфны, потому что мы можем отобразить «a» в «z», «b» в «b» и «c» в «x».
слова «bar» и «foo» не являются изоморфными, потому что мы можем отобразить «f» в «b», «o» в «a» и «o» в «r»

Пример 1:
Input: s = "foo", t = "bar"
Output: false

Пример 2:
Input: s = "paper", t = "title"
Output: true
 */
package Seminar_5;
import java.util.*;

public class Task2 {  
   public static void main(String[] args) {
        String str1 ="foo";
		String str2 ="bar";
		System.out.println("Is "+str1 +" and "+str2 +" are Isomorphic? "+is_Isomorphic(str1, str2));
    }
  public static boolean is_Isomorphic(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length())
			return false;
        Map<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < str1.length(); i++) {
            char char_str1 = str1.charAt(i), char_str2 = str2.charAt(i);
            if (map.containsKey(char_str1)) 
			{
                if (map.get(char_str1) != char_str2)
					return false;
            }
			else 
			{
                if (map.containsValue(char_str2)) 
					return false;
             map.put(char_str1, char_str2);
            }
        }
        
        return true;
    }
}
