import java.util.*;
public class reverse{
    public static void rev(int n){
        int rev=0;
        while(n!=0){
            int lastDig=n%10;
            rev = 10*rev + lastDig;
            n/=10;
        }
        System.out.println(rev);
    }

    public static void main(String args[]){
        int num = 12345678;
        rev(num);
    }

}