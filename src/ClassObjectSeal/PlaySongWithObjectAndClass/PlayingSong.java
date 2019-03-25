package ClassObjectSeal.PlaySongWithObjectAndClass;

public class PlayingSong {

    public static void main(String[] args){

        MediaPlayerPropertise musicPlayer = new MediaPlayerPropertise();

//        boolean b = musicPlayer.initializePlayer();
//        System.out.println("Initializing player: "+b);
//
//        String song = musicPlayer.currentSong();
//        System.out.println("Playing.. "+song);

        musicPlayer.play();
        musicPlayer.pause();
        musicPlayer.stop();
        musicPlayer.prev();
        musicPlayer.next();
        musicPlayer.currentSong();
        musicPlayer.initializePlayer();


        System.out.println("Total songs: "+musicPlayer.totalSongs());


    }

}
