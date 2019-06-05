import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     String rev = "";
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int str_len = str.length();
      for(int i = (str_len -1); i >= 0; i--)
      {
        rev = rev+str.charAt(i);
      }
      if(str.equals(rev))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
        
    } 
}