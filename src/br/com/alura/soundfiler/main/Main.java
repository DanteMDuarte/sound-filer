    package br.com.alura.soundfiler.main;

    import br.com.alura.soundfiler.models.MyFavorites;
    import br.com.alura.soundfiler.models.Podcast;
    import br.com.alura.soundfiler.models.Song;

    public class Main {
        public static void main(String[] args) {
                Song mySong = new Song();
                mySong.setTitle("Respect");
                mySong.setSinger("Aretha Franklin");
                mySong.setAlbum("I Never Loved a Man the Way I Love You");
                mySong.setYearOfrelease(1967);
                mySong.setGenre("Soul");
                mySong.setDurationInMinutes(150);

                for(int i=0;i<100;i++) {
                    mySong.reproduceIt();
                }

                Podcast myPodcast = new Podcast();
                myPodcast.setTitle("Flow");
                myPodcast.setHost("Igor 3k");
                myPodcast.setDescription("Não é uma entrevista.");

                for(int i=0;i<1000;i++) {
                    myPodcast.likeIt();
                }

            MyFavorites myFavorites = new MyFavorites();
                myFavorites.include(myPodcast);
                myFavorites.include(mySong);

        }
    }