import java.util.Scanner;
public class SunnyNum
{
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the number:");
         int n =s.nextInt();
         if(Math.sqrt(n+1)-Math.floor(Math.sqrt(n+1))==0){
             System.out.println("Sunny Number");
         }
         else{
             System.out.println("Not a Sunny Number");
         }
}
}
