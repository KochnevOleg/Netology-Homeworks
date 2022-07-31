package Unit4.Fibonacci;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static final String LOCALHOST = "127.0.0.1";
    private static final int PORT = 23444;

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(LOCALHOST, PORT);

        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
             Scanner scanner = new Scanner(System.in)) {

            String input;

            while (true) {
                System.out.println("Insert fibonacci num:");
                input = scanner.nextLine();
                out.println(input);

                if(input == null || input.equals("end")) {
                    System.out.println("You've finished...");
                    break;
                }

                System.out.println(in.readLine());
            }
        }
    }
}
