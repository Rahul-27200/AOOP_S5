package lab_p_3b;

//MusicSource Interface
public interface MusicSource {
 void play();
 void stop();
 String getTrackInfo();
}

//LocalFileSource Class
 class LocalFileSource implements MusicSource {
 private String filePath;

 public LocalFileSource(String filePath) {
     this.filePath = filePath;
 }

 @Override
 public void play() {
     System.out.println("Playing local file: " + filePath);
 }

 @Override
 public void stop() {
     System.out.println("Stopping local file: " + filePath);
 }

 @Override
 public String getTrackInfo() {
     return "Local File: " + filePath;
 }
}

//StreamingServiceSource Class
 class StreamingServiceSource implements MusicSource {
 private String streamingUrl;

 public StreamingServiceSource(String streamingUrl) {
     this.streamingUrl = streamingUrl;
 }

 @Override
 public void play() {
     System.out.println("Streaming music from: " + streamingUrl);
 }

 @Override
 public void stop() {
     System.out.println("Stopping streaming music from: " + streamingUrl);
 }

 @Override
 public String getTrackInfo() {
     return "Streaming Service: " + streamingUrl;
 }
}

//RadioStationSource Class
 class RadioStationSource implements MusicSource {
 private String radioStationUrl;

 public RadioStationSource(String radioStationUrl) {
     this.radioStationUrl = radioStationUrl;
 }

 @Override
 public void play() {
     System.out.println("Playing radio station: " + radioStationUrl);
 }

 @Override
 public void stop() {
     System.out.println("Stopping radio station: " + radioStationUrl);
 }

 @Override
 public String getTrackInfo() {
     return "Radio Station: " + radioStationUrl;
 }
}
