import java.util.*;
class multi8{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            if((n&7)==0)
            {
                System.out.println("multiple of 8");

            }
            else{
                System.out.println("not a multiple of 8");
            }
        }
    }
}