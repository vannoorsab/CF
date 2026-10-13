import java.util.*;
public class CRaspberries{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        int even=0;
        int k=sc.nextInt();
        int []arr=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }
            int rem=arr[i]%k;
            int op=(rem==0)?0:(k-rem);
            min=Math.min(min,op);
        }
        if(k==4){
            int op1;
            if(even>=2) {
                op1=0;
            }else if(even==1) op1=1;
            else op1=2;

            min=Math.min(min,op1);
        }
        System.out.println(min);
       
    }
}
}