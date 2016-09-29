import java.io.*;
import java.util.*;
public class Another
{	
public boolean countE(String str)
{
int count=0;
StringBuilder sb = new StringBuilder(str); 
int n=sb.length();
for(int i=0;i<n;i++)
{
if((sb.charAt(i) =='e')|| (sb.charAt(i)=='E'))
{
count++;
}
}
if(count>=1&&count<=3)
{
return true;
}
else
{
return false;
}
}
}
