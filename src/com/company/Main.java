package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("автомобили.txt");
        Scanner s = new Scanner(fr);
        s.nextLine();

        Factory factory = new Factory();

        ArrayList<IBuyingBookingCar> mas = new ArrayList<IBuyingBookingCar>();

        while (s.hasNextLine()) {
            String[] str = s.nextLine().split("\t");

            mas.add(factory.getCurrentCar(str[0]));

            if (str[0].equals("ГрузовойАвтомобиль")) {
                mas.set(mas.size()-1, new CargoCar(str[1], Integer.parseInt(str[2]), str[3], Integer.parseInt(str[4]), str[5], str[6]));
                //System.out.println(mas.get(mas.size()-1).ToString());
            }

            if (str[0].equals("ПассажирскийАвтомобиль")) {
                mas.set(mas.size()-1, new PassengerCar(str[1], Integer.parseInt(str[2]), str[3], Integer.parseInt(str[4]), Integer.parseInt(str[5]), Boolean.parseBoolean(str[6])));
                //System.out.println(mas.get(mas.size()-1).ToString());
            }

            if (str[0].equals("МалыйПассажирскийАвтомобиль")) {
                mas.set(mas.size()-1, new SmallPassenger(str[1], Integer.parseInt(str[2]), str[3], Integer.parseInt(str[4]), Integer.parseInt(str[5]), Boolean.parseBoolean(str[6]), str[7], str[8], str[9]));
            }
            //System.out.println(str[0]);
        }
        fr.close();

        int count = 0;
        System.out.println("");
        System.out.println("Автомобили с ценой за час более 20 р:");
        for (int i=0; i<mas.size(); i++) {
            FuncInterface funcInterface = (zp) -> (zp > 20);
            if (funcInterface.test(mas.get(i).getHourPrice())){
                System.out.println(mas.get(i).ToString() + " Цена: " + mas.get(i).getHourPrice());
                count++;
            }
        }
        System.out.println("Количество: " + count);

        count = 0;
        System.out.println("");
        System.out.println("Автомобили с ценой за час более 50 р:");
        for (int i=0; i<mas.size(); i++) {
            FuncInterface funcInterface = (zp) -> (zp > 50);
            if (funcInterface.test(mas.get(i).getHourPrice())){
                System.out.println(mas.get(i).ToString() + " Цена: " + mas.get(i).getHourPrice());
                count++;
            }
        }
        System.out.println("Количество: " + count);
    }
}
