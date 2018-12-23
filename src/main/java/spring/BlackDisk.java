package spring;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/23 8:36
 * @Version 1.0
 **/
public class BlackDisk implements CompactDisk {
    private Music music;
    public BlackDisk(Music music){
        this.music = music;
    }
    public void play() {
        System.out.println();
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
