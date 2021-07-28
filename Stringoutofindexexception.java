import java.util.*;
class Main
{
    public  static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int l=s.length();
        try 
        {
            System.out.println(s.charAt(l));
        } 
        catch(Exception e) 
        {
            System.out.println(e);
        } 
      }
}
