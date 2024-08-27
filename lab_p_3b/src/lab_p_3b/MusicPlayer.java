package lab_p_3b;

//MusicPlayer Interface
public interface MusicPlayer {
 void play();
 void stop();
 void setSource(MusicSource source);
}

//BasicMusicPlayer Class
 class BasicMusicPlayer implements MusicPlayer {
 private MusicSource source;

 @Override
 public void play() {
     if (source != null) {
         source.play();
     } else {
         System.out.println("No music source set.");
     }
 }

 @Override
 public void stop() {
     if (source != null) {
         source.stop();
     } else {
         System.out.println("No music source set.");
     }
 }

 @Override
 public void setSource(MusicSource source) {
     this.source = source;
 }
}
