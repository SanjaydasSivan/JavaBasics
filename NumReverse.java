import java.util.*;
public class NumReverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,rev=0,rem;
        while(n!=0)
        {
            rem=n%10;
            n/=10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}