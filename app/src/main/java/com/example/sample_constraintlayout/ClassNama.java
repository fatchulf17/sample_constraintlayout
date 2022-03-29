package com.example.sample_constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ClassNama {

    private String Nama;

    //inisialisasi objek
    public ClassNama(String nama){
        this.Nama = nama;
    }

    //membuat method getname untuk mengembalikan nilai ke variabel Nama
    public  String getNama(){
        return this.Nama;
    }
}