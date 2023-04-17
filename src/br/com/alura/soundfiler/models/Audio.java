package br.com.alura.soundfiler.models;

public class Audio {
    private String title;
    private int durationInMinutes;
    private int totalOfReproductions;
    private int totalOfLikes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalOfReproductions() {
        return totalOfReproductions;
    }

    public int getTotalOfLikes() {
        return totalOfLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void likeIt() {
        this.totalOfLikes++;
    }

    public void reproduceIt() {
        this.totalOfReproductions++;
    }
}
