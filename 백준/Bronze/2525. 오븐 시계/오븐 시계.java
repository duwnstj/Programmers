import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int totalMinates = A * 60 + B + C;

        int finalHours = (totalMinates / 60) % 24;
        int finalMinates = totalMinates % 60;

        System.out.println(finalHours + " " + finalMinates);


    }
}
