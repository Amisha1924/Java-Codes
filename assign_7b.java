import java.util.Scanner;
class TowerOfHanoi {
    public void TOH(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
        } else {
            TOH(n - 1, source, destination, auxiliary);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            TOH(n - 1, auxiliary, source, destination);
        }
    }
}

class assign_7b
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();
        
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        System.out.println("Steps to solve Tower of Hanoi for " + n + " disks:");
        towerOfHanoi.TOH(n, 'A', 'B', 'C');
        scanner.close();
    }
}
