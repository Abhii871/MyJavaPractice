import java.util.Scanner;

public class PositiveNegativeZero {
    static int Number;

    public static void main(String[] args) {

        try {

            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter a integer number");
            Number = Sc.nextInt();
            CheckNumber(Number);
        } catch (Exception e) {
            System.out.println(e);


        }

    }

    public static void CheckNumber(int Number) {

            if (Number > 0) {
                System.out.println("Positive");

            } else if (Number < 0) {
                System.out.println("Negative");

            }  else {
                System.out.println("Enter a valid integer or number greater or less than 0");

            }
        }

        }

