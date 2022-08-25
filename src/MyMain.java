import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean repeat = true;

        while(repeat)
            try {
                System.out.println("enter a");
                int a = scanner.nextInt();
                System.out.println("enter b");
                int b = scanner.nextInt();
                sum = a + b;
                if (sum < 150) {
                    throw new MyFirstException("Custom Exception Occurred");
                } else {
                    System.out.println("sum = " + sum);
                    repeat = false;
                }
            }
            catch (MyFirstException e) {
                System.err.println(e);
                repeat = true;
            }
    }
}