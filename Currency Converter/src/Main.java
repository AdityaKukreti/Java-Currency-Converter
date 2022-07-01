import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int choice1;
        Thread.sleep(1000);
        System.out.println("\n░░░▒█ ░█▀▀█ ▒█░░▒█ ░█▀▀█ 　 ▒█▀▀█ ▒█░▒█ ▒█▀▀█ ▒█▀▀█ ▒█▀▀▀ ▒█▄░▒█ ▒█▀▀█ ▒█░░▒█ 　 ▒█▀▀█ ▒█▀▀▀█ ▒█▄░▒█ ▒█░░▒█ ▒█▀▀▀ ▒█▀▀█ ▀▀█▀▀ ▒█▀▀▀ ▒█▀▀█ \n░▄░▒█ ▒█▄▄█ ░▒█▒█░ ▒█▄▄█ 　 ▒█░░░ ▒█░▒█ ▒█▄▄▀ ▒█▄▄▀ ▒█▀▀▀ ▒█▒█▒█ ▒█░░░ ▒█▄▄▄█ 　 ▒█░░░ ▒█░░▒█ ▒█▒█▒█ ░▒█▒█░ ▒█▀▀▀ ▒█▄▄▀ ░▒█░░ ▒█▀▀▀ ▒█▄▄▀ \n▒█▄▄█ ▒█░▒█ ░░▀▄▀░ ▒█░▒█ 　 ▒█▄▄█ ░▀▄▄▀ ▒█░▒█ ▒█░▒█ ▒█▄▄▄ ▒█░░▀█ ▒█▄▄█ ░░▒█░░ 　 ▒█▄▄█ ▒█▄▄▄█ ▒█░░▀█ ░░▀▄▀░ ▒█▄▄▄ ▒█░▒█ ░▒█░░ ▒█▄▄▄ ▒█░▒█");
        Thread.sleep(1000);
        System.out.println("\n\n\n*The following website has been used to extract the currency data-\n\thttps://www.x-rates.com/table/?from=INR&amount=1");
        System.out.println("*The following websites have been used for the text art-\n\thttps://fsymbols.com/generators/carty/\n\thttps://textkool.com/en/text-art/memes");
        Thread.sleep(1000);
        Handler handler = new Handler();


        while (true) {
            System.out.printf("\n\n\n\n█▀▄▀█ ▄▀█ █ █▄░█   █▀▄▀█ █▀▀ █▄░█ █░█\n█░▀░█ █▀█ █ █░▀█   █░▀░█ ██▄ █░▀█ █▄█\n\n[1] View the list of currencies\n[2] Convert one currency to other\n[3] About developer\n[4] Exit\n\nEnter your choice- ");

            choice1 = scanner.nextInt();
            if (choice1 == 1) {
                handler.choice1();
            }
            else if (choice1 == 2){
                handler.choice2();
            }
            else if (choice1 == 3){
                handler.choice3();
            }
            else if (choice1 == 4){
                System.out.println("\n\n▒█▀▀▀ █░█ ░▀░ ▀▀█▀▀ ░▀░ █▀▀▄ █▀▀▀ ░ ░ ░ \n▒█▀▀▀ ▄▀▄ ▀█▀ ░░█░░ ▀█▀ █░░█ █░▀█ ▄ ▄ ▄ \n▒█▄▄▄ ▀░▀ ▀▀▀ ░░▀░░ ▀▀▀ ▀░░▀ ▀▀▀▀ █ █ █");
                break;
            }
            else{
                System.out.println("Invalid choice entered!");
                System.out.printf("Press enter to continue...");
                try
                {
                    System.in.read();
                }
                catch(Exception e)
                {}
            }
        }
    }
}
