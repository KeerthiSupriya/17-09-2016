import java.util.*;
import java.io.*;
public class Teststring
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		String str=s.next();
	    Other o = new Other();
	    String t=o.missingChar(str,n);
	    System.out.println(t);
}
}
