package lab_p_3a;

public class Application {
    public static void main(String[] args) {
        // Step 1: Create adapters for different music sources
        MusicSource localFile = new LocalFileAdapter("/path/to/local/file.mp3");
        MusicSource onlineStream = new OnlineStreamingAdapter("https://streaming.service.com/song");
        MusicSource radioStation = new RadioStationAdapter("Jazz FM");

        // Step 2: Create basic music players
        MusicPlayer localFilePlayer = new BasicMusicPlayer(localFile);
        MusicPlayer onlineStreamPlayer = new BasicMusicPlayer(onlineStream);
        MusicPlayer radioStationPlayer = new BasicMusicPlayer(radioStation);

        // Step 3: Enhance music players with decorators
        MusicPlayer localFilePlayerWithEqualizer = new EqualizerDecorator(localFilePlayer);
        MusicPlayer onlineStreamPlayerWithVolumeControl = new VolumeControlDecorator(onlineStreamPlayer, 75);
        MusicPlayer radioStationPlayerWithEqualizerAndVolumeControl = new EqualizerDecorator(
                new VolumeControlDecorator(radioStationPlayer, 50));

        // Step 4: Play music with different settings
        System.out.println("Playing local file with equalizer:");
        localFilePlayerWithEqualizer.play();

        System.out.println("\nPlaying online stream with volume control:");
        onlineStreamPlayerWithVolumeControl.play();

        System.out.println("\nPlaying radio station with equalizer and volume control:");
        radioStationPlayerWithEqualizerAndVolumeControl.play();
    }
}
