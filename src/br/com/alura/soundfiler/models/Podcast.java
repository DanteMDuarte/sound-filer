package br.com.alura.soundfiler.models;

public class Podcast extends Audio{

    private String description;
    private int number;
    private String host;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getClassification() {
        if(this.getTotalOfLikes() > 10) {
            return 10;
        } else {
            return 8;
        }
    }
}
