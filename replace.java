import java.util.*;
class Main
{
    public  static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String s1=s.replace('a','@');
        System.out.println(s1);
      }
}
