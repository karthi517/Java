package prp1;
import java.util.*;
public class SableUnstbleNumbers {
	
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		int input5=sc.nextInt();
        int stable=0;
        int not_stable=0;
        int[] arr2= {input1,input2,input3,input4,input5};
        
for(int k=0;k<5;k++) {
	   int[] digitFreq = new int[10];
	   int mod = 0;
	   int count=0;
	   int t=arr2[k];
		while(t!= 0){
	          mod = t % 10;
	          digitFreq[mod]++;            
	          t = t/10;	
	}
		
int[] arr1 = new int[10];
for(int i=0;i<digitFreq.length;i++) {
 if(digitFreq[i]!=0) {  
	 arr1[count]=digitFreq[i];
		   count=count+1;
	 }
}
int[] arr = new int[count];
for (int i=0;i<count;i++) {
	arr[i]=arr1[i];
	  }
int c=0;
	
for (int i=0;i<count;i++) {
	for (int j=0;j<count;j++) {
		if(arr[i]==arr[j]) {
			c=c+1;
		}
		else {
			c=0;
			break;
		}
		
	}
	if(c==0) {
		break;
	}
}
if(c==0) {
	not_stable=not_stable+1;
}
else {
	stable=stable+1;
}
}

System.out.println((stable*10)+not_stable);

}
}
