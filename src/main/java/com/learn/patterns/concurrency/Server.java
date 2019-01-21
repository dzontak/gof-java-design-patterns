package com.learn.patterns.concurrency;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
  public static void main(String[] args) throws IOException {
    ServerSocket socket = new ServerSocket(9000);
    while (true) {
      final Socket s = socket.accept();
      new Thread(() -> doWork(s)).start();
    }
  }

  static void doWork(Socket s) {
    try (PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()))
       ) {

        String userInput;
        while ((userInput = in.readLine()) != null) {
            System.out.println(userInput);
        }
        out.write("HTTP/1.x 200 OK");
        s.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
