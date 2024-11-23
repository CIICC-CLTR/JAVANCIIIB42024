package fetchmodifers;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import access_modifier.AccessModifiers;

public class Fetch_Modifiers extends AccessModifiers {
    
    public static void main(String[] args) {
        
        AccessModifiers fetch = new AccessModifiers();
        fetch.publiAccessModifier();

        Fetch_Modifiers fetchProtected = new Fetch_Modifiers();
        fetchProtected.protectedAccessModifier();
        
        StringBuilder sb = new StringBuilder();
sb.append("aaa").insert(1, "bb").insert(4, "ccc");
System.out.println(sb);

String s1 = "java";
StringBuilder s2 = new StringBuilder("java");
String s = "Hello";
 String t = new String(s);
 if ("Hello".equals(s)) System.out.println("one");
 if (t == s) System.out.println("two");
 if (t.equals(s)) System.out.println("three");
if ("Hello" == s) System.out.println("four");
 if ("Hello" == t) System.out.println("five");

 String roar1 = "roar";
 StringBuilder roar2 = new StringBuilder("roar");
 new Fetch_Modifiers().roar(roar1, roar2);
  System.out.println(roar1 + " " + roar2);
  String letters = "abcdef";
  System.out.println(letters.length());
  System.out.println(letters.charAt(3));
   
  String numbers = "012345678";
System.out.println(numbers.substring(1, 3));
System.out.println(numbers.substring(7, 7));
System.out.println(numbers.substring(7));
String ss = "purr";
ss.toUpperCase();
ss.trim();
System.out.println(ss.substring(1, 3));
ss.substring(1, 3);
System.out.println(ss += " two");
 
System.out.println(ss.length());
 ;
System.out.println(ss+=false);
String a = "";
 a += 2;
 a += 'c';
 a += false;
 System.out.println(a);
 if ( a == "2cfalse") System.out.println("==");
 if ( a.equals("2cfalse")) System.out.println("equals");

 int total = 0;
 StringBuilder letterss = new StringBuilder("abcdefg");
 total += letterss.substring(1, 2).length(); total += letterss.substring(6, 6).length();
  
 System.out.println(total);

 StringBuilder n = new StringBuilder("0123456789");
n.delete(2, 8);
n.append("-").insert(2, "+");
System.out.println(n);

StringBuilder puzzle = new StringBuilder("Java");
  puzzle.reverse();
 System.out.println(puzzle);
 List<String> hex = Arrays.asList("30", "8", "3A", "FF");
Collections.sort(hex);
int x = Collections.binarySearch(hex, "8");
int y = Collections.binarySearch(hex, "3A");
int z = Collections.binarySearch(hex, "4F");
System.out.println(x + " " + y + " " + z);
List<String> one = new ArrayList<String>();
one.add("abc");
List<String> two = new ArrayList<>();
two.add("abc");
if (one == two)
System.out.println("A");
else if (one.equals(two))
System.out.println("B");
else
System.out.println("C");
LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
Period p = Period.of(1, 2, 3);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
System.out.println(d.format(f));

}

 public void roar(String roar1, StringBuilder roar2) {
    String r1="!!!";

    roar1.concat("!!!");
    roar2.append("!!!");
 }
    
}
