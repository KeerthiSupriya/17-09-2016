import java.io.*;
import java.util.*;
public class Ex174
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
String st=s.next();
Embed a=new Embed();
String p = a.embedWord(str,st);
System.out.println(p);
}
}
