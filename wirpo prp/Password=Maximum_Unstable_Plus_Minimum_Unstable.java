package prp1;

import java.util.Scanner;

public class Maximum_Minimum_UnStable_ {


    
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
        int max=0;
        int min=0;
        for(int i=0;i<5;i++) {
        	if(min<arr2[i]) {
        		min=arr2[i];
        	}
        }
        
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
	if(min>arr2[k]) {
		min=arr2[k];
	}
	if(max<arr2[k]) {
		max=arr2[k];
	}
	
}

 else {
	continue;
}
}

System.out.println(max+min);

}
}
