import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

class Tom{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
            new WorkingClass();
            File file = new File("Pics/bgm.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();

    }
}
