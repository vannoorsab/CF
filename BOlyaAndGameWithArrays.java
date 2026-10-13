import java.util.*;
public class BOlyaAndGameWithArrays{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int first=Integer.MAX_VALUE;
            int sum=0;
            int s_min[]=new int[n];
            for(int i=0;i<n;i++){
                int s=sc.nextInt();
                int []arr=new int[s];
                
                for(int j=0;j<s;j++){
                    arr[j]=sc.nextInt();
                }
                Arrays.sort(arr);
                first=Math.min(first,arr[0]);
                s_min[i]=arr[1];
            }
                Arrays.sort(s_min);
                for(int num:s_min){
                    sum+=num;
                }
           long total=sum-s_min[0]+first;
           System.out.println(total);
           
        }
    }
}