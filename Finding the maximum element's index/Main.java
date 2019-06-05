import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
 for(int i = 0; i < n; i++)
{
list[i] = sc.nextInt();
 }
    large(list,n);
  }
    public static void large(int list[], int n)
    {
      int max;
    if(list[0] > list[1])
    {
        max = 0;
    }
    else
    {
      max = 1;
    }
    for(int i = 2; i <= n-1; i++)
    {
      if(list[max] < list[i])
      {
        max = i;
      }
    }
    System.out.print(max);
  }
}