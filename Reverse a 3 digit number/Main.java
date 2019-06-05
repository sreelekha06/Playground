import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int last = n1/100;
    int second = (n1/10)%10;
    int first = n1%10;
    int rev = first*100+second*10+last;
    System.out.println(rev);
  }
}