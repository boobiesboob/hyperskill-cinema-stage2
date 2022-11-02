import java.util.Scanner;


public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int col = scanner.nextInt();

        int seats = row * col;
        int revenue;
        int frontSeats;
        int backSeats;
        int premPrice = 10;
        int econPrice = 8;
        int sitsMeridian = 60;

        System.out.println("Total income:");
        if (seats <= sitsMeridian) {
            revenue = seats * premPrice;
        } else {
            frontSeats = row / 2 * col;
            backSeats = seats - frontSeats;
            revenue = frontSeats * premPrice + backSeats * econPrice;
        }
        System.out.print("$" + revenue);
    }
}