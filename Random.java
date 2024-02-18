import java.util.*;
public class Random
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
long seed = System.currentTimeMillis();
long m = 2345879879L;
long a = 776484L;//x=(a*x+c)%m;
long c =2848793087L;
long x=seed;
for(int i=0;i<n;i++){
x=(a*x+c)%m;
int randomNum=(int)(x%100);
System.out.println(randomNum);
}
}
}