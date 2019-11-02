package com.company;

import java.io.IOException;

public class AlbumTrack extends Track  {
    String album;

    AlbumTrack(String _name,
               String _author) throws IOException {
        super(_name, _author);
        if (name.equals("") || author.equals(""))
            throw new IOException("The name of the song or the author is not introduced");
    }

    AlbumTrack(String _name,
               String _author,
               String _genre,
               int _year,
               String _album) throws IOException {
        super(_name, _author, _genre, _year);
        album = _album;
        if (name.equals("") || author.equals(""))
            throw new IOException("The name of the song or the author is not introduced");
    }

    String getAlbum (){
        return album;
    }

    @Override
    public String toString() {
        return  "Name: '" + getName() + "'\n"
                + "Album: '" + getAlbum() + "'\n"
                + "Author: '" + getAuthor() + "'\n"
                + "Genre : '" + getGenre() + "'\n"
                + "Year: " + getYear() + "\n";

    }
}
