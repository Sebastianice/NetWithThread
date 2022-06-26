package Sebastian;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;



public class ServerDemo {
    public static void main(String[] args) throws IOException {

        ServerSocket ss=new ServerSocket(10000);
        Socket s=ss.accept();

        InputStream is=s.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);

        String line;
        while((line=br.readLine())!=null)
            System.out.println(line);

        ss.close();
    }
}