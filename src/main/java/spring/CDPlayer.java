package spring;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/23 8:48
 * @Version 1.0
 **/
public class CDPlayer {
    private CompactDisk compactDisk;
    public CDPlayer(CompactDisk compactDisk){
        this.compactDisk = compactDisk;
    }
    public void play(){
        System.out.println("I am a player, please listen to music: ");
        compactDisk.play();
    }

    public void setCompactDisk(CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }

    public CompactDisk getCompactDisk() {
        return compactDisk;
    }
}
