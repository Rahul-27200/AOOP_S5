package lab_p_3a;

public class VolumeControlDecorator extends MusicPlayerDecorator {
    private int volumeLevel;

    public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer, int volumeLevel) {
        super(decoratedMusicPlayer);
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void play() {
        setVolume();
        super.play();
    }

    private void setVolume() {
        System.out.println("Setting volume to level: " + volumeLevel);
    }
}
