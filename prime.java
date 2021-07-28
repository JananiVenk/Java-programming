import java.util.*;
class Main
{
    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the number: ");  
        int a=sc.nextInt();
        prime p=new prime();
        p.isprime(a);
        sc.close();
    }
}
class prime
{
    void isprime(int n)
    {
        int flag=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println(n+" is Prime");
        else
        System.out.println(n+" is Composite");
    }
}
