
    import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=3;i++){
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		
		if((a<b && a>c )|| (a<c && a>b))
		System.out.println(a);
		else if((b>a && b<c) ||(b<a && b>c))
		System.out.println(b);
		else
		System.out.println(c);
		
	}
}

}
