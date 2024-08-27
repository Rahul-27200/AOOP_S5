package lab_p_3a;

public class BasicMusicPlayer implements MusicPlayer {
    private MusicSource musicSource;

    public BasicMusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void play() {
        musicSource.play();
    }
}
