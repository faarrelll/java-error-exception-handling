package com.enigma.java_error_exeption_handling.custom;

import java.util.ArrayList;
import java.util.List;

public class ExampleExceptionDemo {
    private static List<String> animals = new ArrayList<>(
            List.of("Capybara", "Buaya", "Sapi", "Ayam", "Kucing", "Kambing")
    );

    private static List<String> persons = new ArrayList<>(
            List.of("Adi", "Yuda", "Hafizh", "Farrel", "Ayyik")
    );
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        // jadi walaupun unchecked exception dalam kenyataan perlu juga try catch agar aplikasi tetap berjalan
        // walau seharusnya diperbaiki di bagian kodingnya
//        var foundAnimal = findAnimalByName("Anoa");
//        System.out.println("foundAnimal " + foundAnimal);
        int index = InputUtils.inputInt("Pilih indeks yang diinginkan");
        int divider = InputUtils.inputInt("Bagi dengan berapa");

        try {
            System.out.println("Nilai yang dipilih" + numbers[index]);
            System.out.println("Dibagi dengan" + divider);
            System.out.println("Hasil Pembagian" + numbers[index] / divider);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tidak ada index tersebut di array" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Tidak bisa dibagi dengan 0" + e.getMessage());
        }

        try {
            System.out.println("Nilai yang dipilih" + numbers[index]);
            System.out.println("Dibagi dengan" + divider);
            System.out.println("Hasil Pembagian" + numbers[index] / divider);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Error di index array atau aritmatika error" + e.getMessage());
        }

        try {
            System.out.println("Nilai yang dipilih" + numbers[index]);
            System.out.println("Dibagi dengan" + divider);
            System.out.println("Hasil Pembagian" + numbers[index] / divider);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    // kalau checked exception itu baru perlu pakai throws
    private static String findPersonByName(String name) throws NotFoundException {
        String temp = null;

        for (String person : persons) {
            if (person.equalsIgnoreCase(name)) {
                temp = person;
            }
        }

        if (temp == null) {
            throw new NotFoundException("Orang yang kamu cari tidak ditemukan");
        }
        return temp;
}


// kalau unchecked exception (Runtime Exception dan turun2annya) itu gak perlu pakai throws
//    private static String findAnimalByName(String name) throws NotFoundException {
private static String findAnimalByName(String name) {
        String tempAnimal = null;

    for (String animal : animals) {
            if (animal.equalsIgnoreCase(name)) {
                tempAnimal = animal;
            }
        }

        if (tempAnimal == null) {
//            throw new NotFoundException("Hewan yang kamu cari belum tersedia");
            throw new NotFoundButRuntimeException("Hewan yang kamu cari belum tersedia");
        }
        return tempAnimal;
    }
}
