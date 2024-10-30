package com.enigma.java_error_exeption_handling.custom;

public class ErrorDemo {
    public static void main(String[] args) {
        String username = "Ridho";
        String password = null;
        String dbName = "m_sekolah";

        System.out.println("Springboot");
        System.out.println("Initialisasi Database");
        DatabaseConnection db = new DatabaseConnection(dbName, username, password);
        // ini memang seharusnya tidak di try catch
        // karena memang ketika database gagal konek harus error dan aplikasi tidak berjalan
        // karena kalau aplikasi berjalan tapi sesungguhnya dbnya gak konek, itu bahaya
        db.connect();

        System.out.println("Sistem Berjalan di port 8080");
    }
}
