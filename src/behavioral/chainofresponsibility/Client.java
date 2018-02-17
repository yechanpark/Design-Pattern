package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.Request.Request;
import behavioral.chainofresponsibility.handler.Handler;
import behavioral.chainofresponsibility.handler.receiver.Receiver1;
import behavioral.chainofresponsibility.handler.receiver.Receiver2;
import behavioral.chainofresponsibility.handler.receiver.Receiver3;
import behavioral.chainofresponsibility.handler.receiver.Receiver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Sender
public class Client {
    public static void main(String args[]) {

        Handler manager = new Receiver1();
        Handler director = new Receiver2();
        Handler vicePresident = new Receiver3();
        Handler president = new Receiver4();
        manager.setHandler(director);
        director.setHandler(vicePresident);
        vicePresident.setHandler(president);

        // Press Ctrl+C to end.
        try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double doubleValue = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.handleRequest((new Request(doubleValue, "General")));
            }
        }
        catch (Exception exc) {
            System.exit(1);
        }
    }
}