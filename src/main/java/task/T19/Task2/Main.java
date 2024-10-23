package task.T19.Task2;

public class Main {
        public static void main(String[] args) {
            MusicPlayer classicPlayer = new ClassicMusicPlayer();
            MusicPlayer rockPlayer = new RockMusicPlayer();
            MusicPlayer jazzPlayer = new JazzMusicPlayer();


            classicPlayer.play();
            classicPlayer.pause();

            rockPlayer.play();
            rockPlayer.pause();

            jazzPlayer.play();
            jazzPlayer.pause();


        }
    }

