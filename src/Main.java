import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.01", 9999);

        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        out.write(line);
        out.write("\n");
        out.write(line2);
        out.write("\n");
        out.write(line3);
        out.write("\n");

        out.flush();
        outputStream.close();
    }
}
