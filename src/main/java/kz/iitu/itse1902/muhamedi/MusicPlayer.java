package kz.iitu.itse1902.muhamedi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MusicPlayer {

    private Music music;

    public MusicPlayer(@Qualifier("chillPopMusic") Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Now is playing - " + music.getSong());
    }

}
