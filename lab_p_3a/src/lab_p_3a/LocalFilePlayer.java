package lab_p_3a;

public class LocalFilePlayer {
    public void playLocalFile(String filePath) {
        System.out.println("Playing music from local file: " + filePath);
    }
}

 class OnlineStreamingPlayer {
    public void playOnlineStream(String url) {
        System.out.println("Streaming music from URL: " + url);
    }
}

 class RadioStationPlayer {
    public void playRadioStation(String station) {
        System.out.println("Playing music from radio station: " + station);
    }
}
