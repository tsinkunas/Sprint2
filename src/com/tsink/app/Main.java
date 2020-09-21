package com.tsink.app;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Pasirenkame operaciją

        Scanner in = new Scanner(System.in);
        String input = null;


            System.out.println("new - įtraukti naują darbuotoją");
            System.out.println("print - išspausdinti darbuotojų sąrašą");
            System.out.println("quit - išeiti");

            System.out.println("pasirinkite operaciją:");
            input = in.nextLine();
            if (input.equals("quit")) {
                System.exit(0);
            } else if (input.equals("new")) {

                // Sukuriame darbuotojo duomenis

                Employee employee = new Employee();
                System.out.println("Įveskite darbuotojo vardą:");
                String name = in.nextLine();
                employee.setName(name);
                System.out.println("Įveskite darbuotojo pavardę:");
                String surname = in.nextLine();
                employee.setSurname(surname);
                System.out.println("Darbo užmokestis eur: ");
                employee.setWage(in.nextDouble());

                // Sukuriame darbuotojų sąrašą

                FileWriter fw = null;
                try {
                    fw = new FileWriter(new File("employees.csv"), true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(employee));
                    bw.write("\n");
                    bw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (input.equals("print")) {

                // Atspausdiname iš failo darbuotojų sąrašą

                FileReader fr = null;
                try {
                    fr = new FileReader("employees.csv");
                    BufferedReader br = new BufferedReader(fr);
                    String fileLine = br.readLine();
                    while (fileLine != null) {
                        System.out.println(fileLine);
                        fileLine = br.readLine();
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
       else {
                System.out.println("Pasirinkta neegzistuojanti operacija!!!");
            }
    }
}

