package com.company;

import java.io.IOException;

public class Track {

    String name;
    String author;
    String genre;
    int year;

    Track(String _name,
          String _author) throws IOException {
        name = _name;
        author = _author;
        if (name.equals("") || author.equals(""))
            throw new IOException("The name of the song or the author is not introduced");
    }

    Track(String _name,
          String _author,
          String _genre,
          int _year) throws IOException {
        name = _name;
        author = _author;
        genre = _genre;
        year = _year;
        if (name.equals("") || author.equals(""))
            throw new IOException("The name of the song or the author is not introduced");
    }

    String getName (){
        return name;
    }

    String getAuthor (){
        return author;
    }

    String getGenre (){
        return genre;
    }

    int getYear (){
        return  year;
    }
}
