import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("\nKundordu tandanyz: ");
            System.err.println("""
                    Monday
                    Tuesday
                    Wednesday
                    Thursday
                    Friday
                    Saturday 
                    Sunday""");
            String day= scanner.nextLine();
            if (day.equals("Monday")){
                System.out.println(Days.MONDAY.getValue());
            } else if (day.equals("Tuesday")) {
                System.out.println(Days.TUESDAY.getValue());
            } else if (day.equals("Wednesday")) {
                System.out.println(Days.WEDNESDAY.getValue());
            } else if (day.equals("Thursday")) {
                System.out.println(Days.TUESDAY.getValue());
            } else if (day.equals("Friday")) {
                System.out.println(Days.FRIDAY.getValue());
            } else if (day.equals("Saturday")) {
                System.out.println(Days.SATURDAY.getValue());
            } else if (day.equals("Sunday")) {
                System.out.println(Days.SUNDAY.getValue());
            }else {
                System.out.println("Mynday kun jok ");
            }
        }

    }
}