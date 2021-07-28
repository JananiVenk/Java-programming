import java.util.*;
class Main
{
    public  static void main(String[] args)
     {
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int r=sc.nextInt();
        
        for(int j=0;j<r;j++)
        {
            for(int k=0;k<=j;k++)
            {
                System.out.print(i+" ");
                i++;
            }
            System.out.println();
        }
    }
}
