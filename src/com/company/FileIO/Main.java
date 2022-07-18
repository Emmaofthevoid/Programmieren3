package com.company.FileIO;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, AddressExportFileAlreadyExistsException, AddressLoadException {

        Address a1 = new Address("Maria", "Palosanto", "0934852340982", "hola@hotmail.com");
        Address a2 = new Address("fg", "fgnhfgfg", "9679879", "asetaewrhh@hotmail.com");
        Address a3 = new Address("rt", "dfhsdfhh", "345134", "sdg<szeji@hotmail.com");
        Address a4 = new Address("fgj", "dfhsdfh", "64747568", "<xcvxcg>@hotmail.com");
        Address a5 = new Address("asdg", "hlöiuo", "23245665", "werwesdf<sd@hotmail.com");

        AddressManager addressManager = new AddressManager();
        String filepath = "supermegatest.csv";
        String separator = " , ";

        addressManager.add(a1);
        addressManager.add(a2);
        addressManager.add(a3);
        addressManager.add(a4);
        addressManager.add(a5);

        addressManager.exportToCsv(filepath, separator);
    }
}
