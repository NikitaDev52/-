package ServerSocket;

import Data.UserBuys;
import ProccesingWithData.ProccesingWithData;
import RequestProcessing.Entity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        String fileName = "categories.tsv";
        UserBuys userBuys = new UserBuys(fileName);

        try (ServerSocket server = new ServerSocket(8989)) {
            while (true) {
                try (Socket client = server.accept(); BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream())); PrintWriter out = new PrintWriter(client.getOutputStream());) {
                    System.out.println("Новое подключение: " + client.getPort());
                    Gson gson = new Gson();
                    Entity entity = gson.fromJson(in.readLine(), new TypeToken<Entity>() {}.getType());
                    userBuys.addData(entity);

                    ProccesingWithData withData = new ProccesingWithData(userBuys);
                    out.println(withData.getMaxCategory());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
