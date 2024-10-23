package task.T19.Task2;

public class ClassicMusicPlayer implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Classic Music is playing");
    }

    @Override
    public void pause() {
        System.out.println("Classic Music is paused");
    }
}

class JazzMusicPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Jazz Music is playing");
    }

    @Override
    public void pause() {
        System.out.println("Jazz Music is paused");
    }
}

class RockMusicPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Rock Music is playing");
    }

    @Override
    public void pause() {
        System.out.println("Rock Music is paused");
    }
}
