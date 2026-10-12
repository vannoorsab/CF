import java.util.*;
public class ACoverInWater{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String  s=sc.next();
            /*for(int i=0;i<n;i++){
                s[i]=sc.next();
            }*/
            int ct=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='.'){
                    ct++;
                }
            }
            if(s.contains("...")) System.out.println(2);
            else System.out.println(ct);
            
        }
    }
}