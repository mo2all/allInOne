package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/23 8:35
 * @Version 1.0
 **/
@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    public CDPlayer cdPlayer(CompactDisk compactDisk){
        return new CDPlayer(compactDisk);
    }

    @Bean
    public CompactDisk compactDisk(){
        return new BlackDisk(music());
    }
    @Bean
    public Music music(){
        Music music = new Music();
        music.setArt("华仔");
        music.setSongName("冷冷的冰雨");
        return music;
    }
}
