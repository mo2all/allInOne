package spring;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/23 8:37
 * @Version 1.0
 **/
public class Music {
    private String art;
    private String songName;

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName){
        this.songName = songName;
    }

    @Override
    public String toString() {
        return "Music{" +
                "art='" + art + '\'' +
                ", songName='" + songName + '\'' +
                '}';
    }
}
