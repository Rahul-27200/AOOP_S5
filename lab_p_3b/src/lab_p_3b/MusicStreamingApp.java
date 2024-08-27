package lab_p_3b;

public class MusicStreamingApp {
    public static void main(String[] args) {
        // Create a basic music player
        MusicPlayer player = new BasicMusicPlayer();

        // Set a local file as the music source
        MusicSource localFile = new LocalFileSource("song.mp3");
        player.setSource(localFile);

        // Play the music
        player.play();
        player.stop();

        // Add equalizer functionality
        player = new EqualizerDecorator(player);
        ((EqualizerDecorator) player).setEqualizerSettings("Bass Boost");

        // Play with equalizer settings
        player.play();
        player.stop();

        // Add volume control functionality
        player = new VolumeControlDecorator(player);
        ((VolumeControlDecorator) player).setVolume(10);

        // Play with volume control
        player.play();
        player.stop();

        // Switch to an online streaming service
        MusicSource streamingService = new StreamingServiceSource("http://streaming-service-url");
        player.setSource(streamingService);

        // Play the streaming service with equalizer and volume control
        player.play();
        player.stop();
    }
}
