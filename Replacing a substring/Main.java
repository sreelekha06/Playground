import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
       Scanner scan = new Scanner(System.in);
         String str1 = scan.nextLine();
         String search = scan.nextLine();
         String replace = scan.nextLine();
      String result = str1.replace(search,replace);
       System.out.print(result);
    }
}