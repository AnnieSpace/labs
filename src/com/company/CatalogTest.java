package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class CatalogTest {

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

    CatalogTest() throws IOException {
    }

    @Test
    void insert() throws IOException {
        boolean actual = true;
        boolean expected = false;
        try {
            Track track = new Track("", "");
        }
        catch (IOException e){
            actual = false;
            System.out.println("");
        }

        Assert.assertEquals(expected, actual);
    }


    @Test
    void add() {

        Catalog expected1 = new Catalog();
        expected1.add(albumTrack1);
        expected1.add(albumTrack2);
        expected1.add(albumTrack3);

        Catalog actual1 = new Catalog();
        actual1.catalog.add(albumTrack1);
        actual1.catalog.add(albumTrack2);
        actual1.catalog.add(albumTrack3);

        Assert.assertEquals(expected1.toString(), actual1.toString());
    }

    @Test
    void sortByAuthor() throws IOException {

        Catalog expected = new Catalog();
        expected.add(albumTrack1);
        expected.add(albumTrack2);
        expected.add(albumTrack3);

        for (int i = expected.catalog.size() - 1 ; i > 0; i--)
            for (int j = 0; j < i; j++){
                if (expected.catalog.get(j).getAuthor().compareTo(expected.catalog.get(j+1).getAuthor()) >= 0){
                    AlbumTrack track = new AlbumTrack("", "");
                    track.name = expected.catalog.get(j).name;
                    track.author = expected.catalog.get(j).author;
                    track.album = expected.catalog.get(j).album;
                    track.year = expected.catalog.get(j).year;
                    track.genre = expected.catalog.get(j).genre;
                    expected.catalog.set(j, expected.catalog.get(j+1));
                    expected.catalog.set(j+1, track);

                }

            }

        Catalog actual = new Catalog();
        actual.add(albumTrack1);
        actual.add(albumTrack2);
        actual.add(albumTrack3);

        actual.sortByAuthor();

        Assert.assertEquals(expected.toString(), actual.toString());
    }


}