package lab_p_3a;

public class LocalFileAdapter implements MusicSource {
    private LocalFilePlayer localFilePlayer;
    private String filePath;

    public LocalFileAdapter(String filePath) {
        this.localFilePlayer = new LocalFilePlayer();
        this.filePath = filePath;
    }

    @Override
    public void play() {
        localFilePlayer.playLocalFile(filePath);
    }
}

 class OnlineStreamingAdapter implements MusicSource {
    private OnlineStreamingPlayer onlineStreamingPlayer;
    private String url;

    public OnlineStreamingAdapter(String url) {
        this.onlineStreamingPlayer = new OnlineStreamingPlayer();
        this.url = url;
    }

    @Override
    public void play() {
        onlineStreamingPlayer.playOnlineStream(url);
    }
}

 class RadioStationAdapter implements MusicSource {
    private RadioStationPlayer radioStationPlayer;
    private String station;

    public RadioStationAdapter(String station) {
        this.radioStationPlayer = new RadioStationPlayer();
        this.station = station;
    }

    @Override
    public void play() {
        radioStationPlayer.playRadioStation(station);
    }
}
