import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 25.04.2017.
 */
public class Main {
    private static Downloader downloader;
    private static Uploader uploader;

    public static void main(String[] args) {
//        downloader = new HttpDownloader();
//        uploader = new HttpUploader();

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        downloader = (Downloader) context.getBean("dowloader");
        uploader = (Uploader) context.getBean("uploader");

        String content = downloader.dowload(" ");
        uploader.upload(content);
    }
}
