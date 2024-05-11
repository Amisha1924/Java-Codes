import java.util.*;
class shapes{
    void rect(int a,char ch)
    {
        for(int j=0;j<a;j++)
        {
            for(int i=0;i<a;i++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    void rect(int l,int b,char ch)
    {
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
public class assign_7e
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        shapes S =new shapes();
        System.out.print("Enter the sides of a square: ");
        int a = sc.nextInt();
        System.out.print("Enter the character: ");
        char ch=sc.next().charAt(0);
        S.rect(a,ch);
        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        System.out.print("Enter the character: ");
        ch=sc.next().charAt(0);
        S.rect(l,b,ch);
        sc.close();
    }
}