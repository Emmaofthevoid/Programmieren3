package FileIO.BinaryReader.Uebung17;

import java.io.IOException;

public class Ue17Main {
    public static void main(String[] args) throws IOException {

        Uebung17Produkt p1 = new Uebung17Produkt("hola", 2.0, "tres");
        Uebung17ProductManager productManager = new Uebung17ProductManager();
        String path = "C:\\Users\\s51640\\Downloads\\Programmieren3\\ue_9.txt";

        productManager.add(p1);
        productManager.save(path);

    }
}
