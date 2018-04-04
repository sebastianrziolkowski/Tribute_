package media;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.media.Duration;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class MediaHandling {

    FileHandling musicFileHandling;
    public MediaPlayer mediaPlayer;


    public MediaHandling(String titleFile, String pathFile)
    {
        musicFileHandling = new FileHandling(titleFile,pathFile);

        Media media = new Media(musicFileHandling.file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
    }



    public void PlayFile()
    {
        mediaPlayer.play();
    }

    public void StopFile()
    {
        mediaPlayer.stop();
    }

    public double GetTime()
    {
        return Math.round(mediaPlayer.getCurrentTime().toSeconds()*100)/100;
    }

    public Duration GetDuration()
    {
        return (Duration) mediaPlayer.getCurrentTime();
    }

}
