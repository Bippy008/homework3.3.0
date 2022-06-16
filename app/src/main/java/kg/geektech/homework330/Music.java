package kg.geektech.homework330;

public class Music {
    private String songName;
    private String singerName;
    private String timestamp;

    public Music(String songName, String singerName, String timestamp) {
        this.songName = songName;
        this.singerName = singerName;
        this.timestamp = timestamp;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
