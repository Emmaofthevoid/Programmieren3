package com.company.FileIO;

import java.io.*;
import java.util.ArrayList;

public class AddressManager {

    private ArrayList<Address> addresses;

    public AddressManager() {
        addresses = new ArrayList<>();
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void add(Address address) {
        addresses.add(address);
    }

    public void exportToCsv(String path, String separator) throws AddressExportFileAlreadyExistsException, AddressLoadException {
        File file = new File(path);
        if (file.exists()) {
            throw new AddressExportFileAlreadyExistsException("The File already exists, please provide a new path.");
        }
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Address a : getAddresses()) {
                bufferedWriter.write(a.getFirstname() + separator + a.getLastname() + separator +
                        a.getEmail() + separator + a.getMobileNumber());
                bufferedWriter.newLine();

                System.out.println("Write to file: " + a);

            }
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("All elements were written to the file and saved.");
        } catch (IOException e) {
            throw new AddressLoadException(e);
        }


    }

    public void loadFromCsv(String path, String separator) throws AddressLoadException, AddressLoadWrongFormatException {
       // addresses.removeAll(addresses);
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<Address> newArr = new ArrayList<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(separator);
                if (line.length() != 4) {
                    throw new AddressLoadWrongFormatException ("4 Spalten erwartet");
                }
                newArr.add(new Address(temp[0], temp[1], temp[2], temp[3]));
            }


        } catch (IOException e) {
            throw new AddressLoadException(e);
        }


    }
}
