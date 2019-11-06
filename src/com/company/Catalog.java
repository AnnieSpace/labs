package com.company;

import java.util.*;

public class Catalog {

    List<AlbumTrack> catalog = new ArrayList<AlbumTrack>();

    Catalog(){
    }

    void add (AlbumTrack track){
        catalog.add(track);
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

    String findByName(String name){

        String whatWeFound = "Search results by song title '" + name + "'\n\n";

        Catalog result = new Catalog();

        for (int i = 0; i < catalog.size(); i++){
            if (catalog.get(i).name.equalsIgnoreCase(name))
                result.add(catalog.get(i));
        }

        return whatWeFound + result.toString();
    }

    String findByAuthor(String author){

        String whatWeFound = "Search results by author " + author + "\n\n";

        Catalog result = new Catalog();

        for (int i = 0; i < catalog.size(); i++){
            if (catalog.get(i).author.equalsIgnoreCase(author))
                result.add(catalog.get(i));
        }

        return whatWeFound + result.toString();
    }

    void sortByName(){
        catalog.sort(Comparator.comparing(AlbumTrack::getName));
    }

    void sortByAuthor(){
        catalog.sort(Comparator.comparing(AlbumTrack::getAuthor));
    }

    String deleteTrack(Track track){

        return "The track successfully deleted.";
    }

}
