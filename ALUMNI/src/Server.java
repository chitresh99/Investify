package alumni;

import java.net.*;//conatins server scoket cls
import java.io.*;
import java.util.*;

public class Server implements Runnable //Implementing Runnable suggests that instances of this class can be executed as separate threads.
{

    Socket socket; //socket  will hold the socket connection to a client. It is intended to be used to communicate with a specific client.

    public static Vector client = new Vector(); //vector is meant to store information about connected clients.
    //we can use list or Arraylist instead of vector

    public Server(Socket socket) //it is a constructor for server cls
    // constructor is used to set up a server connection for a specific client.
    {
        try {
            this.socket = socket;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // BufferedReader is created to read data from the socket's input stream. This allows the server to read data sent by the connected client.
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            // A BufferedWriter is created to write data to the socket's output stream. This allows the server to send data back to the client.

            client.add(writer);

            while (true) {
                String data = reader.readLine().trim();
                //the server reads a line of text from the client and trims whitespaces 
                System.out.println("Recieved " + data);

                for (int i = 0; i < client.size(); i++) {
                    try {
                        BufferedWriter bw = (BufferedWriter) client.get(i);
                        bw.write(data); // writes the received data to the BufferedWriter
                        bw.write("r\n");
                        bw.flush(); //flush() method is used to clear the buffer and write the data to the output stream.

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(2003);
        //line creates a ServerSocket named s that listens on port 2003.
        while (true) {
            Socket socket = s.accept(); //accept() method of the ServerSocket s
            // When a client connects, accept() returns a Socket object (socket) that can be used for communication with that specific client.
            Server server = new Server(socket);
            //used to handle clients request
            Thread thread = new Thread(server);
            //thread initiates the execution of the Server 
            thread.start();
        }
    }
}
