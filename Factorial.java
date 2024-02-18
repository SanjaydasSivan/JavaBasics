import java.util.*;
public class Factorial
{
static int factorial(int n)
{
if(n==0)
return 0;
if(n==1)
return 1;
return n*factorial(n-1);
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int ans=factorial(n);
System.out.println(ans);
}
}