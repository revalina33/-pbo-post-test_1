/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


public class PostTest1 {

    public static void main(String[] args) {
        ArrayList<Film> films = new ArrayList<>();
        films.add(new Film("the walking dead", "robert kirkman", "horror", 30000, 2010));
        films.add(new Film("avatar", "James Cameron", "action", 40000, 2009));
        films.add(new Film("another", "yukito", "horror", 20000, 2012));
        films.add(new Film("titanic", "james cameron", "drama", 45000, 1997));
        films.add(new Film("Jurassic park", "Steven Spielberg", "Sci-fi", 35000, 1993));

        for (Film f : films) {
            System.out.println("judul: " + f.judul + ", produser: " + f.produser + ", genre: " + f.genre + ", harga: " + f.hargakaset + ", tahun rilis: " + f.tahunterbit);
        }
    }
}



