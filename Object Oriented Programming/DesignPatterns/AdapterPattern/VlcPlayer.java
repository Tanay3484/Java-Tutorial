package AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename){
        System.out.println("Playing vlc file with name : "+filename);
    }

    @Override
    public void playMp4(String filename){
        //do nothing;
    }
}
