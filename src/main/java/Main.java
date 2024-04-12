import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Client clientOne = new Client("Garic", 89676400943224242l, "pogosyan.g.gmail.ru");
        Client clientTwo = new Client("Arsenii", 89676400944l, "zubarev.a.s@mail.ru");
        Client clientThree = new Client("Max", 89676400945l, "null");
        Client clientFour = new Client("Boris", 89676400946l, "kryzhev.b.a@mail.ru");
        Client clientFive = new Client("Garic", 89676400943l, "pogosyan.g.g@mail.ru");

        System.out.println("Input command from existing \"printInformationAboutClient\", \"remove\":");
        String command = new Scanner(System.in).nextLine();
        if (command.equals("printInformationAboutClient")) {
            Client.printInformationAboutClients();
        } else if (command.equals("remove")) {
            System.out.println("Input phone number for remove corresponding client: ");
            command = new Scanner(System.in).nextLine();
            Client.removeClient(command);
        }
    }
}
