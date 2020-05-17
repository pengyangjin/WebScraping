import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static void main(String[] args)
    {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        WebDriver webDriver= new ChromeDriver(chromeOptions);
        webDriver.get("https://www.cocservice.top/update/0000-Barbarian/");
        String pageSource = webDriver.getPageSource();
        //System.out.println(pageSource);

        Document document= Jsoup.parse(pageSource);
        Element element = document.selectFirst("table[class = updating]");
        System.out.println(element.toString());
    }
}
