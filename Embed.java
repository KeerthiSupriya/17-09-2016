import java.io.*;
import java.util.*;
public class Embed
{	
	int i;
	String m;
	String q;
public String embedWord(String str,String st)
{
StringBuilder sb = new StringBuilder(str); 
int n=sb.length();
if(i==n%2)
{
q=sb.substring(0,n/2);
m=sb.substring(n/2,n);
}
return q+st+m;
}
}
