package com.theironyard;

/**
 * Created by earlbozarth on 11/8/15.
 */
public class Favorite {
    int id;
    int userId;
    int artistId;
    String artistName;
    String image;
    boolean isfav;


    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getImage() {
        return image;
    }

    public boolean isfav() {
        return isfav;
    }
}
