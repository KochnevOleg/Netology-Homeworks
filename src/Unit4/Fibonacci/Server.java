package Unit4.Fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static final int PORT = 28912;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(PORT);

        try (Socket socket = serverSocket.accept();
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            while (true) {
                String userInput = in.readLine();

                if (userInput == null || userInput.equals("end")) {
                    System.out.println("Server is crashed:(");
                    break;
                } else {
                    out.println("Result is:" + getFibonacciNumber(Integer.parseInt(userInput)));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getFibonacciNumber(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            return getFibonacciNumber(a - 1) + getFibonacciNumber(a - 2);
        }
    }
}

