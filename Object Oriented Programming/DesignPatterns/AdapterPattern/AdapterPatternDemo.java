package AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "A lot-21 Savage.mp3");
        audioPlayer.play("mp4", "John Wick Chapter 4.mp4");
        audioPlayer.play("vlc", "One-Piece Episode 1015.vlc");
        audioPlayer.play("avi", "Mind me.avi");
    }
}