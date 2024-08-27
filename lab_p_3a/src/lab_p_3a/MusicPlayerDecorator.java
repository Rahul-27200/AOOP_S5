package lab_p_3a;

public abstract class MusicPlayerDecorator implements MusicPlayer {
    protected MusicPlayer decoratedMusicPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedMusicPlayer) {
        this.decoratedMusicPlayer = decoratedMusicPlayer;
    }

    @Override
    public void play() {
        decoratedMusicPlayer.play();
    }
}
