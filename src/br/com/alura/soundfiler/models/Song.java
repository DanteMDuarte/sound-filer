package br.com.alura.soundfiler.models;

public class Song extends Audio {

    private String genre;
    private String album;
    private String singer;
    private int yearOfrelease;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getYearOfrelease() {
        return yearOfrelease;
    }

    public void setYearOfrelease(int yearOfrelease) {
        this.yearOfrelease = yearOfrelease;
    }

    @Override
    public int getClassification() {
        if(this.getTotalOfReproductions() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
