import java.util.*;
public class Taxi
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int hash[] = new int[5];
        for(int i=0;i<5;i++)
        {
            hash[i]=0;
        }
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
            hash[arr[i]]++;
        }
        int sum=0;
        sum+=(hash[4]);
        int mini = Math.min(hash[1],hash[3]);
        sum+=mini;
        hash[1]-=mini;
        hash[3]-=mini;
        sum+=hash[3];
        if(hash[2]%2==0)
        {
            sum+=hash[2]/2;
            hash[2]=0;
        }
        else
        {
            sum+=hash[2]/2;
            hash[2]=1;
        }
        if(hash[2]==1 && hash[1]>=2)
        {
            sum+=1;
            hash[2]=0;
            hash[1]-=2;
        }
        if(hash[2]==1 && hash[1]<2)
        {
            sum+=1;
            hash[2]=0;
            hash[1]=0;
        }
        sum+= hash[1]/4;
        sum+= hash[1]%4>0?1:0;
        System.out.print(sum);
    }
}
