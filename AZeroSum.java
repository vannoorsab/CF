import java.util.*;
public class AZeroSum{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            if(sum==0) {System.out.println("YES"); continue;
        }
            if(n%2!=0) {System.out.println("NO"); continue;
    }
            if(n==2){
                if(arr[0]==arr[1]) System.out.println("NO");
                else System.out.println("YES");
                continue;
            }
            System.out.println("YES");
        }
    }
}