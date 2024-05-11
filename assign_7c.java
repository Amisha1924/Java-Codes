import java.util.Scanner;
class Fibonacci{
    public int fibo (int n)
    {
        if(n==1||n==0){
            return n;
        }
        else{
            return (fibo(n-1)+fibo(n-2));
        }
    }
}

class assign_7c{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,c=0,i=5,val=4;
        Fibonacci f=new Fibonacci();
        System.out.print("Enter the number of terms: ");
        n = scanner.nextInt();
        System.out.println("The Non - Fibonacci terms are: ");
        while(c<n)
        {
            int temp= f.fibo(i);
            while((val<temp)&&(c<n)){
                System.out.print(val+++" ");
                c++;
            }
            val = temp+1;
            i++;
        }
        scanner.close();
    }
}
