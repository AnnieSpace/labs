package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            //Track track = new Track("", "");

            Track track1 = new Track("Through Glass",
                    "Stone Sour",
                    "nu metal",
                    2006);
            AlbumTrack albumTrack1 = new AlbumTrack("Through Glass",
                    "Stone Sour",
                    "nu metal",
                    2006,
                    "Come What(ever) May10th Anniversary Edition");

            AlbumTrack albumTrack2 = new AlbumTrack("Another Home",
                    "Koven",
                    "dabstep",
                    2014,
                    "Another Home");

            AlbumTrack albumTrack3 = new AlbumTrack("Once",
                    "Khamsin",
                    "electronics",
                    2016,
                    "Leaving");

            Catalog catalog = new Catalog();

            catalog.add(albumTrack1);
            catalog.add(albumTrack2);
            catalog.add(albumTrack3);

            catalog.sortByName();
            System.out.println(catalog.toString());

            catalog.sortByAuthor();
            System.out.println(catalog.toString());

            System.out.println(catalog.findByName("Through Glass"));

            AlbumTrack albumTrack4 = new AlbumTrack("Wooow",
                    "Lol",
                    "electronics",
                    2016,
                    "Leaving");

            System.out.println(catalog.delete(albumTrack1));
            System.out.println(catalog.delete(albumTrack4));

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}