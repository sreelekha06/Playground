import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      int i , temp ,sum =0;
      temp = n;
      while(n>0)
      {
        i = n%10;
        sum = sum+i*i*i;
        n = n/10;
      }
      if(sum == temp)
      {
        System.out.println("Armstrong Number");
        
      }
      else
      {
         System.out.println( "Not a Armstrong Number");
      }
}
}