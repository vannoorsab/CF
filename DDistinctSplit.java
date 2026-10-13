import java.util.*;
public class DDistinctSplit{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            HashSet<Character> hs=new HashSet<>();
            int []pref=new int[n];
            int []suff=new int[n];
            HashSet<Character> hs1=new HashSet<>();
            for(int i=0;i<n;i++){
                hs.add(s.charAt(i));
                pref[i]=hs.size();
            }
                        hs.clear();
            for (int i = n - 1; i >= 0; i--) {
                hs.add(s.charAt(i));
                suff[i] = hs.size();
            }

            
            int max=0;
            for(int i=0;i<n-1;i++){
                max=Math.max(pref[i]+suff[i+1],max);
            }
            System.out.println(max);
            
            
            
                     
           
        }
    }
}