package prp1;
import java.util.*;
public class ReversingWordWithOption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int value=2;
		String string=sc.nextLine();;
		

		
		String ar[]=string.split(" ");
		String x="";
		for(int i=0;i<ar.length;i++) {
			StringBuilder n=new StringBuilder(ar[i]);
			if(i!=ar.length-1) {
			x+=n.reverse()+" ";
			}
			else {
				x+=n.reverse();
			}
		}
		switch(value) {
		case 0:
			System.out.println(x);
			break;
		
		case 1:

			x=x.toLowerCase();
			StringBuffer y=new StringBuffer(x);
			for(int i=0;i<x.length();i++) {
				Character c = y.charAt(i);
				if(i==0 || i==6 ||i==10 ||i==19 ||i==24) {
					y.replace(i, i + 1,Character.toUpperCase(c) + "");
					
				}
				
			}
				
		        System.out.println(y);
		        break;
		case 2:
			x=x.toUpperCase();
			String ar1[]=x.split(" ");
			String str1="";
			for(int i=0;i<ar1.length;i++) {
				StringBuilder n=new StringBuilder(ar1[i]);
				int len=ar1[i].length();
				Character c = n.charAt(len-1);
				n.replace(len-1,len,Character.toLowerCase(c) + "");
				if(i!=ar1.length-1) {
					str1+=n+" ";
				}
				else {
					str1+=n;
				}
				
			}
			System.out.println(str1);
			break;
		   default:System.out.println(string);
			
		
	}
	}
	}
