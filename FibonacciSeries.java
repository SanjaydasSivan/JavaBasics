import java.util.*;
public class FibonacciSeries {
static int first=-1,second=1,third=0;
static void fib(int n){
if(n>0) {
third=first+second;
System.out.println(third+" ");
first=second;
second=third;
fib(n-1) }}
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
fib(n);}}