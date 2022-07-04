import java.io.IOException;
import java.util.Scanner;


public class Handler {

    Extractor dataExtractor = new Extractor();
    public void choice1() {

        System.out.println("\n\n\n\n▒█▀▀█ █░░█ █▀▀█ █▀▀█ █▀▀ █▀▀▄ █▀▀ █░░█ 　 ▒█░░░ ░▀░ █▀▀ ▀▀█▀▀ \n▒█░░░ █░░█ █▄▄▀ █▄▄▀ █▀▀ █░░█ █░░ █▄▄█ 　 ▒█░░░ ▀█▀ ▀▀█ ░░█░░ \n▒█▄▄█ ░▀▀▀ ▀░▀▀ ▀░▀▀ ▀▀▀ ▀░░▀ ▀▀▀ ▄▄▄█ 　 ▒█▄▄█ ▀▀▀ ▀▀▀ ░░▀░░");
        System.out.println("\n\n+------+-------------------------+----------------+");
        System.out.println("| S.no | Currency                |  Value(INR)    |");
        System.out.println("+------+-------------------------+----------------+");
        for (int i = 0; i < dataExtractor.currencyNames.size(); i++) {
            System.out.printf("| [%s]",i+1);
            if (i <= 9){
                System.out.printf("  ");
            }
            else{
                System.out.printf(" ");
            }
            System.out.printf("| %s", dataExtractor.currencyNames.get(i));
            for (int j = 0; j < (24 - dataExtractor.currencyNames.get(i).length()); j++) {
                System.out.printf(" ");
            }
            System.out.printf("|");
            System.out.printf("   %s", dataExtractor.currencyRates.get(i));
            for (int j = 0; j < (13 - dataExtractor.currencyRates.get(i).length()); j++) {
                System.out.printf(" ");
            }
            System.out.println("|");
        }
        System.out.println("+------+-------------------------+----------------+");
        System.out.printf("\nPress enter to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    public void choice2() throws IOException {

        Scanner scanner = new Scanner(System.in);
        dataExtractor.currencyNames.add("Indian Rupee");
        System.out.printf("\n\n\n\n▒█▀▀█ ▒█▀▀▀█ ▒█▄░▒█ ▒█░░▒█ ▒█▀▀▀ ▒█▀▀█ ▀▀█▀▀ ▒█▀▀▀ ▒█▀▀█ \n▒█░░░ ▒█░░▒█ ▒█▒█▒█ ░▒█▒█░ ▒█▀▀▀ ▒█▄▄▀ ░▒█░░ ▒█▀▀▀ ▒█▄▄▀ \n▒█▄▄█ ▒█▄▄▄█ ▒█░░▀█ ░░▀▄▀░ ▒█▄▄▄ ▒█░▒█ ░▒█░░ ▒█▄▄▄ ▒█░▒█\n\n");
        for (int i = 0; i < 18; i++){
            System.out.printf("[%d] %s",3*i+1,dataExtractor.currencyNames.get(3*i));
            if (i <= 9) {
                for (int j = 0; j < 36 - dataExtractor.currencyNames.get(3 * i).length(); j++) {
                    System.out.printf(" ");
                }
            } else {
                for (int j = 0; j < 35 - dataExtractor.currencyNames.get(3 * i).length(); j++) {
                    System.out.printf(" ");
                }
            }
            System.out.printf("[%d] %s",3*i+2,dataExtractor.currencyNames.get(3*i+1));
            if (i <= 9) {
                for (int j = 0; j < 36 - dataExtractor.currencyNames.get(3 * i + 1).length(); j++) {
                    System.out.printf(" ");
                }
            } else {
                for (int j = 0; j < 35 - dataExtractor.currencyNames.get(3 * i + 1).length(); j++) {
                    System.out.printf(" ");
                }
            }
            System.out.printf("[%d] %s",3*i+3,dataExtractor.currencyNames.get(3*i+2));
            System.out.println();

        }
        System.out.printf("\n\n\n\nEnter the currency you want to convert from- ");
        int currency1 = scanner.nextInt();
        System.out.printf("Enter the currency you want to convert to- ");
        int currency2 = scanner.nextInt();
        System.out.printf("Enter the amount- ");
        int amount = scanner.nextInt();

        float currency1Value;
        float currency2Value;
        String currency1Name;
        String currency2Name;

        if (currency1 == 54){
            currency1Value = 1;
            currency1Name = "Indian Rupee";
            currency2Value = Float.parseFloat(dataExtractor.currencyRates.get(currency2-1));
            currency2Name = dataExtractor.currencyNames.get(currency2-1);

        } else if (currency2 == 54) {
            currency2Value = 1;
            currency2Name = "Indian Rupee";
            currency1Value = Float.parseFloat(dataExtractor.currencyRates.get(currency1-1));
            currency1Name = dataExtractor.currencyNames.get(currency1-1);

        } else{
            currency1Value = Float.parseFloat(dataExtractor.currencyRates.get(currency1-1));
            currency1Name = dataExtractor.currencyNames.get(currency1-1);
            currency2Value = Float.parseFloat(dataExtractor.currencyRates.get(currency2-1));
            currency2Name = dataExtractor.currencyNames.get(currency2-1);

        }

        System.out.printf("\n\n\n%d %s equals %f %s",amount,currency1Name,amount*currency1Value/currency2Value,currency2Name);
        dataExtractor.currencyNames.remove("Indian Rupee");
        System.out.printf("\n\nPress enter to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    public void choice3(){
        System.out.println("\n\n\n\n░█▀▀█ █▀▀▄ █▀▀█ █░░█ ▀▀█▀▀ 　 ▒█▀▀▄ █▀▀ ▀█░█▀ █▀▀ █░░ █▀▀█ █▀▀█ █▀▀ █▀▀█ \n▒█▄▄█ █▀▀▄ █░░█ █░░█ ░░█░░ 　 ▒█░▒█ █▀▀ ░█▄█░ █▀▀ █░░ █░░█ █░░█ █▀▀ █▄▄▀ \n▒█░▒█ ▀▀▀░ ▀▀▀▀ ░▀▀▀ ░░▀░░ 　 ▒█▄▄▀ ▀▀▀ ░░▀░░ ▀▀▀ ▀▀▀ ▀▀▀▀ █▀▀▀ ▀▀▀ ▀░▀▀\n\n");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n░░░░░░░▄▄▀▀▀▀▀▀▀▀▀▀▄▄█▄░░░░▄░░░░█░░░░░░░\n░░░░░░█▀░░░░░░░░░░░░░▀▀█▄░░░▀░░░░░░░░░▄░\n░░░░▄▀░░░░░░░░░░░░░░░░░▀██░░░▄▀▀▀▄▄░░▀░░\n░░▄█▀▄█▀▀▀▀▄░░░░░░▄▀▀█▄░▀█▄░░█▄░░░▀█░░░░\n░▄█░▄▀░░▄▄▄░█░░░▄▀▄█▄░▀█░░█▄░░▀█░░░░█░░░\n▄█░░█░░░▀▀▀░█░░▄█░▀▀▀░░█░░░█▄░░█░░░░█░░░\n██░░░▀▄░░░▄█▀░░░▀▄▄▄▄▄█▀░░░▀█░░█▄░░░█░░░\n██░░░░░▀▀▀░░░░░░░░░░░░░░░░░░█░▄█░░░░█░░░\n██░░░░░░░░░░░░░░░░░░░░░█░░░░██▀░░░░█▄░░░\n██░░░░░░░░░░░░░░░░░░░░░█░░░░█░░░░░░░▀▀█▄\n██░░░░░░░░░░░░░░░░░░░░█░░░░░█░░░░░░░▄▄██\n░██░░░░░░░░░░░░░░░░░░▄▀░░░░░█░░░░░░░▀▀█▄\n░▀█░░░░░░█░░░░░░░░░▄█▀░░░░░░█░░░░░░░▄▄██\n░▄██▄░░░░░▀▀▀▄▄▄▄▀▀░░░░░░░░░█░░░░░░░▀▀█▄\n░░▀▀▀▀░░░░░░░░░░░░░░░░░░░░░░█▄▄▄▄▄▄▄▄▄██\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");

        System.out.printf("My name's Aditya Kukreti and i'm currently a first year, pursuing Bachelor of Technology in Artificial Intelligence and Data Science from G.L. Bajaj Institute of Technology\nand Management, Greater Noida. I like to explore and learn new things in the field of programming and I love working on projects!!!\n\nPress enter to continue...");

        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

}
