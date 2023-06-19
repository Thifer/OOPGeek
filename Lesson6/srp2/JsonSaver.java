package Lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSaver {
    public static void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClient().getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct().getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getProduct().getQnt()+",\n");
            writer.write("\"price\":"+order.getProduct().getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
