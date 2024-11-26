import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter the start value for miles: "); //user input for start of miles
int start = scanner.nextInt();
System.out.print("Enter the end value for miles: ");//user input for end of miles
int end = scanner.nextInt();
scanner.close();
//fing if input is valid
if (start <= 0 || end <= 0 || start > end) {
    System.out.println("Invalid range. Please ensure both values are positive and start <= end.");
    return;}
System.out.println("----------------------");//spacer
        System.out.println("Miles      Kilometers");
        //calculates 
        for(int i = start; i<=end; i++){
            double km = i * 1.609;
            System.out.printf("%-10d%.3f%n", i, km);
        }
    }
}
