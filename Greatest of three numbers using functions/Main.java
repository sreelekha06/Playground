import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner( System.in);
       int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
      int result = great(n1,n2);
      System.out.print(great(result,n3));
    }
  public static int great(int n1,int n2)
  {
    int max = 0;
    if( n1 > n2)
    {
      max= n1;
    }
    else
    {
      max = n2;
    }
    return max;
  
	}
}