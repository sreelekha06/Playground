import java.util.Scanner;
 public class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int str_len = str.length();
    String [ ] words = str.split(" ");
    for(int i = 0; i < words.length ; i++)
    {
      if(words[i] != null)
      {
        for(int j = i+1; j < words.length ; j++)
        {
          if(words[i] .equals(words[j]))
          {
            words[j] = null;
          }
        }
      }
    }
      for(int k = 0; k < words.length;k++)
      {
        if(words[k] != null)
        {
          System.out.print(words[k]+ " ");
        }
      }
    }
 } 
    
  
