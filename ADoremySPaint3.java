import java.util.*;
public class ADoremySPaint3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            //int k=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++){
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }
            if(hm.size()<=1) System.out.println("Yes");
            else if(hm.size()==2) {
                int [] count=new int[2];
                int j=0;
                for(int c:hm.values()){
                    count[j++]=c;
                }
                /*if(Math.abs(count[0]-count[1])<=1){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }*/
               

            }else{
                System.out.println("No");
            }
            
        }
    }
}