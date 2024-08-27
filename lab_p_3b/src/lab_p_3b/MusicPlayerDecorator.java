package lab_p_3b;

//MusicPlayerDecorator Class
public abstract class MusicPlayerDecorator implements MusicPlayer {
 protected MusicPlayer decoratedPlayer;

 public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
     this.decoratedPlayer = decoratedPlayer;
 }

 @Override
 public void play() {
     decoratedPlayer.play();
 }

 @Override
 public void stop() {
     decoratedPlayer.stop();
 }

 @Override
 public void setSource(MusicSource source) {
     decoratedPlayer.setSource(source);
 }
}

//EqualizerDecorator Class
 class EqualizerDecorator extends MusicPlayerDecorator {
 public EqualizerDecorator(MusicPlayer decoratedPlayer) {
     super(decoratedPlayer);
 }

 public void setEqualizerSettings(String settings) {
     System.out.println("Applying equalizer settings: " + settings);
 }

 @Override
 public void play() {
     super.play();
     System.out.println("Playing with equalizer settings.");
 }
}

//VolumeControlDecorator Class
 class VolumeControlDecorator extends MusicPlayerDecorator {
 private int volumeLevel;

 public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
     super(decoratedPlayer);
 }

 public void setVolume(int level) {
     this.volumeLevel = level;
     System.out.println("Setting volume to: " + level);
 }

 @Override
 public void play() {
     super.play();
     System.out.println("Playing at volume level: " + volumeLevel);
 }
}
