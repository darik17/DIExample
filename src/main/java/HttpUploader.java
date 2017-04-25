/**
 * Created by admin on 25.04.2017.
 */
public class HttpUploader implements Uploader {
    public boolean upload(String content) {
        System.out.println(content+ "dowloaded by http");
        return true;
    }
}
