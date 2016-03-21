package clientcalculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class CalculatorClient {

    int port = 4813;

    Socket clientSocket = null;

    BufferedReader inputStreamServer = null;
    PrintStream outputStreamServer = null;

    public CalculatorClient() {
    }
    
    

    public String izracunaj(String rezultatKaServeru) throws Exception {

        clientSocket = new Socket("localhost", port);
        inputStreamServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        outputStreamServer = new PrintStream(clientSocket.getOutputStream());

        outputStreamServer.println(rezultatKaServeru);

        String rezultatOdServera = inputStreamServer.readLine();

        clientSocket.close();
        return rezultatOdServera;

    }

}
