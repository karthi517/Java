package prp1;

import java.util.Scanner;

public class FindKey2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		String x="";
		
		
		for(int i=0;i<=a.length()-1;i++) {
			String m="",n="",o="",t="";
			
			
			int k=0,j=0,l=0,small=0,ans=0;
			
			m=m+a.charAt(i);
			k=Integer.parseInt(m);
			n=n+b.charAt(i);
			j=Integer.parseInt(n);
			o=o+c.charAt(i);
			l=Integer.parseInt(o);
			
			if(k<=j && k<=l) {
				
				small=k;
				
			}
			else if(j<=k && j<=l){
				
				small=j;
			}
			else {
			
				small=l;
			}
			
			
			t=small+"";
			x=x+t;
			
		}
		System.out.println(x);
	}

}
