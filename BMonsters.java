import java.util.*;
public class BMonsters{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []arr=new int[n];
            int [][]ans=new int[n][2];
            int j=0;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                num%=k;
               if(num==0){
                    ans[i][0]=k;
                    ans[i][1]=i;
                }else{
                    ans[i][0]=num;
                    ans[i][1]=i;
            }
        }
         Arrays.sort(ans,(a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            else return b[0]-a[0];
         });
         for(int i=0;i<n;i++){
            System.out.print(ans[i][1]+1+" ");
         }
         System.out.println();

                     
           
        }
    }
}