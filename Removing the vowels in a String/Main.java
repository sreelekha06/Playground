import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int str_len = str.length();
    
         
      
         
       str = str.replaceAll("[AEIOUaeiou]", "");
         
        
         
        System.out.println(str);
         
        
    }
}
  
