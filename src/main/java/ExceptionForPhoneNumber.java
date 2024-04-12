public class ExceptionForPhoneNumber extends Exception {
    public ExceptionForPhoneNumber() {
        super();
    }


    public void printExceptionPhoneNumber() {
        System.out.print("Incorrect format phone number from client \"");
    }
}
