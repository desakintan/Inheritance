package com.kuliah;

public class Inheritance{
    public static void main(String[] args){
        Kepsek kepsek = new Kepsek();
        kepsek.nama = "Nyoman Wira Raharja";
        kepsek.NIP = "198908172015021008";
        kepsek.jk = "Laki-laki";
        kepsek.display();

        GuruMipa gmipa = new GuruMipa();
        gmipa.nama = "Ni Putu Mia arini";
        gmipa.NIP = "199504282017052068";
        gmipa.jk = "Perempuan";
        gmipa.display();

        GuruIps gips = new GuruIps();
        gips.nama = "Ni kadek Elisia Winata";
        gips.NIP = "199701172020032058";
        gips.jk = "Perempuan";
        gips.display();
    }
}


