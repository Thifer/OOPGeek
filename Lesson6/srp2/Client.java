package Lesson6.srp2;

public class Client {
    private final String clientName;


    public String getClientName() {
        return clientName;
    }


    public Client(String clientName) {
        this.clientName = clientName;
    }

    public Client(){
        this.clientName = WorkWithConsole.inputFromConsole("Client Name: ");
    }
}
