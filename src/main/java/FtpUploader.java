/**
 * Created by admin on 25.04.2017.
 */
public class FtpUploader implements Uploader {
    public boolean upload(String content) {
        System.out.println(content + "Downloaded");
        return true;
    }
}
