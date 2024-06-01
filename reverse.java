import java.util.*;
public class reverse{
    public static int rev(int n){
        int rev=0;
        while(n!=0){
            int lastDig=n%10;
            rev = 10*rev + lastDig;
            n/=10;
        }
        return rev;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = rev(n);
        System.out.println(rev);
        System.out.println(n-rev);
    }
}