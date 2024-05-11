import java.util.Scanner;
class Name
{
    String f,m,l;
    Name(String First,String Middle,String Last)
    {
        f=First;
        m=Middle;
        l=Last;
    }
}
class DOB
{
    int d,m,y;
    DOB(int x1,int y1,int z1)
    {
        d=x1;
        m=y1;
        y=z1;
    }
}
class Student
{
    Scanner sc = new Scanner(System.in);
    int id;
    Name n;
    DOB b;
    int marks []=new int[3];
    Student (int id1, String fn, String mn, String ln, int dd, int mm, int yy)
    {
        id=id1;
        n=new Name (fn, mn, ln);
        b= new DOB (dd,mm,yy);
        System.out.println("Enter the marks for English, Maths, CS: "); 
        for (int i=0; i<marks.length; i++) {
            marks[i]=sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("ID = "+id);
        System.out.println("Name = "+n.f+" "+n.m+" "+n.l);
        System.out.println("DOB = "+b.d+"/"+b.m+"/"+b.y);
        System.out.println("Marks in English = "+marks[0]);
        System.out.println("Marks in Mathematics = "+marks[1]);
        System.out.println("Marks in CS = "+marks[2]);
        System.out.println();
    }
}
public class assign_7d
{
    public static void main(String args[])
    {
        int i,id1,dd,mm,yy;
        String fn,mn,ln;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students:");
        int n=sc.nextInt();
        Student arr[]=new Student[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter id: ");
            id1=sc.nextInt();
            System.out.println("Enter first name: ");
            fn=sc.next();
            System.out.println("Enter middle name: ");
            mn=sc.next();
            System.out.println("Enter last name: ");
            ln=sc.next();
            System.out.println("Enter birth month: ");
            mm=sc.nextInt();
            System.out.println("Enter birth year: ");
            yy=sc.nextInt();
            System.out.println("Enter birth date: ");
            dd=sc.nextInt();
            arr[i]=new Student(id1,fn,mn,ln,dd,mm,yy);
        }
        System.out.println("The Database:\n");
        for(i=0;i<n;i++){
            arr[i].display();
        }
        sc.close();
    }
}