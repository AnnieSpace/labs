package com.company;

import java.util.*;

public class Catalog {

    List<AlbumTrack> catalog = new ArrayList<AlbumTrack>();
    //List<AlbumTrack> result = new ArrayList<AlbumTrack>();

    Catalog(){
    }

    void add (AlbumTrack track){
        catalog.add(track);
    }

    String findByName(String name){

        String whatWeFound = "Search results by song title '" + name + "'\n\n";
        return whatWeFound + cycle(name, 1).toString();
    }

    String findByAuthor(String author){

        String whatWeFound = "Search results by author " + author + "\n\n";
        return whatWeFound + cycle(author, 2).toString();
    }

    String findAllTrackInThisAlbum(String album){

        String whatWeFound = "Songs in the album " + album + "\n\n";
        return whatWeFound + cycle(album, 3).toString();
    }

    Catalog cycle(String whatNeedToFind, int parameter) {
        Catalog result = new Catalog();
        switch (parameter) {
            case (1):
                for (int i = 0; i < catalog.size(); i++) {
                    if (catalog.get(i).name.equalsIgnoreCase(whatNeedToFind))
                        result.add(catalog.get(i));
                }
                return result;
            case (2):
                for (int i = 0; i < catalog.size(); i++) {
                    if (catalog.get(i).author.equalsIgnoreCase(whatNeedToFind))
                        result.add(catalog.get(i));
                }
                return result;
            case (3):
                for (int i = 0; i < catalog.size(); i++) {
                    if (catalog.get(i).album.equalsIgnoreCase(whatNeedToFind))
                        result.add(catalog.get(i));
                }
                return result;
            default:
                return result;
        }
    }


    void sortByName(){
        catalog.sort(Comparator.comparing(AlbumTrack::getName));
    }

    void sortByAuthor(){
        catalog.sort(Comparator.comparing(AlbumTrack::getAuthor));
    }

    @Override
    public String toString() {
        String cat = "Songs that are in the catalog:\n\n";
        for (int i = 0; i < catalog.size(); i++ ){
            cat = cat   + "Name: '" + catalog.get(i).name + "'\n"
                    + "Album: '" + catalog.get(i).album + "'\n"
                    + "Author: '" + catalog.get(i).author + "'\n"
                    + "Genre : '" + catalog.get(i).genre + "'\n"
                    + "Year: " + catalog.get(i).year + "\n\n";

        }
        return cat;
    }

}
