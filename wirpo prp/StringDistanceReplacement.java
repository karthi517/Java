package prp1;
import java.util.*;
public class StringDistanceReplacement {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String arr1[]=s1.split("");
      int i=0,j=1;
      
      StringBuilder s2=new StringBuilder();
      while(j<arr1.length){
    	  char c1=s1.charAt(i),c2=s1.charAt(j);
    	  
    	  int as=(int)c1-96; 
    	  int as1=(int)c2-96;
          int v=as+as1;
          
          int v1=v+96;
          char c3=(char)v1;
          if(j!=arr1.length-1) {
        	  s2.append(c1);
        	  s2.append(c3);
        	  i=i+1;
        	  j=j+1;
          }
          else {
        	  s2.append(c1);
        	  s2.append(c3);
        	  s2.append(c2);
        	  i=i+1;
        	  j=j+1;
          }
    	  
    	  
    	  }
      System.out.print(s2);
      }
      
	}


