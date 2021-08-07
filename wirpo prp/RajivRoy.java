package prp1;

import java.util.*;  
class RajivRoy  
{  
public static void main(String[] args)  
{  
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b=sc.nextLine();
	String PIN=sc.nextLine();
	String PIN1="";

	int N=sc.nextInt();
	String x="";
	String y="";
		
		if(a.length()>b.length()) {
			 x=b;
			 y=a;
		}
		
		else if(a.length()<b.length()) {
			 x=a;
			 y=b;
		}
		else
		{
			for(int i=0;i<=a.length()-1;i++) {
				int m=a.charAt(i);
				int n=b.charAt(i);
				if(m==n) {
					continue;
				}
				else if(m<n) {
					 x=b;
					 y=a;
				}
				else {
					 x=a;
					 y=b;
				}
				
			}
		}
		for (int i = PIN.length() - 1; i >= 0; i--) {
			PIN1 =PIN1+PIN.charAt(i);
		}
System.out.println(y.charAt(0)+x+PIN.charAt(N-1)+PIN1.charAt(N-1));
	}

}