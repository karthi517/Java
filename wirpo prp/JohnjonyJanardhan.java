package karthi;
import java.util.Scanner;
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String String1=sc.nextLine();
        String String2=sc.nextLine();
        String String3=sc.nextLine();
        String[] arr={String1,String2,String3};
        String input1="";
        String input2="";
        String input3="";
        for(int i=0;i<3;i++){
            if((arr[i]).length()%3==0){
                int a=arr[i].length()/3;
                for(int j=0;j<a;j++){
                    input1=input1+arr[i].charAt(j);
                }

                for(int j=a;j<(a+a);j++){
                    input2=input2+arr[i].charAt(j);
                }
                for(int j=(a+a);j<(a+a+a);j++){
                    input3=input3+arr[i].charAt(j);
                }
            }
            else if(arr[i].length()%3==1){
                int a=arr[i].length()/3;
                for(int j=0;j<a;j++){
                    input1=input1+arr[i].charAt(j);
                }
                for(int j=a;j<(a+a+1);j++){
                    input2=input2+arr[i].charAt(j);
                }
                for(int j=(a+a+1);j<(arr[i].length());j++){
                    input3=input3+arr[i].charAt(j);
                }
            }
            else{
                int a=arr[i].length()/3;
                for(int j=0;j<a+1;j++){
                    input1=input1+arr[i].charAt(j);
                }
                for(int j=a+1;j<(a+a+1);j++){
                    input2=input2+arr[i].charAt(j);
                }
                for(int j=(a+a+1);j<(arr[i].length());j++){
                    input3=input3+arr[i].charAt(j);
                }
            }
        }
        System.out.println(input1);
        System.out.println(input2);
        char[] chars = input3.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i])
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }
        System.out.println(chars);
    }
}
