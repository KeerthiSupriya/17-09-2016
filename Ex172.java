import java.util.*;
import java.io.*;
public class Ex172
{
public static void main(String args[])
{
Scanner sn=new Scanner(System.in);
String s=new String();
String str=sn.next();
Oda a=new Oda();
String p=a.backAround(str);
System.out.println(p);
}
}
