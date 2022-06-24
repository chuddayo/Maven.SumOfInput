import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int numInput = 0;
        int sum = 0;

        //prompt user for integer 1 or greater
        System.out.print("Choose an integer greater than 0: ");
        Scanner in = new Scanner(System.in);

        try {
            numInput = Integer.parseInt(in.next());

            // calculate sum from 1 to n
            for (int i = 1; i <= numInput; i++) {
                sum += i;
            }

            //return sum of 1 to n
            System.out.println("Your sum from 1 to " + numInput + " is: " + sum);
        } catch (Exception e) {
            System.out.println("Something went wrong. check again");
        }
    }
}
