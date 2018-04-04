package media;
import java.io.File;


public class FileHandling {
    String fileTitle;
    String filePath;
    File file;



    public FileHandling(String fileTitle, String filePath)
    {
        this.filePath=filePath + ".mp3";
        this.fileTitle=fileTitle;
        this.file = new File(this.filePath);
    }


    @Override
    public String toString() {
        return "FileHandling{" +
                "fileTitle='" + fileTitle + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
