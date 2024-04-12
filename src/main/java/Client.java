import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.TreeSet;

public class Client implements Comparable<Client> {
    Logger logger = LoggerFactory.getLogger(Client.class);
    private static Set<Client> setClients = new TreeSet<>();
    private String name; //Alex
    private long phoneNumber; //89676400941
    private String regexForPhoneNumber = "[8][0-9]{10}";
    private String email; //mura.m.v@mail.ru

    public Client(String name, long phoneNumber, String email) throws Exception {

        try {
            this.name = name;

            if (String.valueOf(phoneNumber).matches(regexForPhoneNumber)) {
                this.phoneNumber = phoneNumber;
            } else {
                String[] arrayString = null;
                arrayString[2] = "Hello";
            }

            if (email.contains("@")) {
                this.email = email;
            } else {
                String[] arrayStringTwo = null;
                arrayStringTwo[2] = "Hello";
            }
            setClients.add(this);
        } catch (Exception ex) {
            if (!String.valueOf(phoneNumber).matches(regexForPhoneNumber)) {
                ExceptionForPhoneNumber exceptionForPhoneNumber = new ExceptionForPhoneNumber();
                exceptionForPhoneNumber.printExceptionPhoneNumber();
                System.out.println(name + "\"");
                logger.error("Incorrect format phone number from client \"" + name + "\"");
            }

            if (!email.contains("@")) {
                ExceptionForEmail exceptionForEmail = new ExceptionForEmail();
                exceptionForEmail.printExceptionEmail();
                System.out.println(name + "\"");
                logger.error("Incorrect format email from client \"" + name + "\"");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void printInformationAboutClients() {
        for (Client currentClient : setClients) {
            System.out.println(
                    "Client \"" + currentClient.getName() +
                            "\":\n" + currentClient + "\n");
        }
    }

    public static void removeClient(String phoneNumber) {
        for (Client client : setClients) {
            if (client.getPhoneNumber().equals(Long.parseLong(phoneNumber))) {
                System.out.println("Client \"" + client + "\" removed!");
                setClients.remove(client);
            }
        }
    }

    @Override
    public String toString() {
        return "Name \"" + getName() + "\"" +
                "\nPhone number \"" + getPhoneNumber() + "\"" +
                "\nEmail \"" + getEmail() + "\".";
    }

    @Override
    public int compareTo(Client o) {
        return -getName().compareTo(o.getName());
    }
}
