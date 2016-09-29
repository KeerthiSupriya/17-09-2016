public class Other
{
	
public String missingChar(String str,int n)
{
String s=str.substring(0,n);
s +=str.substring(n+1);
return s;
}
}
