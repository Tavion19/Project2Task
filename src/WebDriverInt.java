public interface WebDriverInt {
    void open();
    void close();
    String getTitle();




}


interface RemoteWebDriver extends WebDriverInt{

    void navigate();


}
interface TakesScreenShot extends RemoteWebDriver{

    void getScrenShot();
}
class ChromeDriver implements WebDriverInt, RemoteWebDriver{


    @Override
    public void navigate(){
        System.out.println("ChromeDriver navigated to page");
    }

    public void open(){System.out.println("ChromeDriver opened the page");}
    public void close(){System.out.println("ChromeDriver closed the page");}
    public String getTitle(){return "google";}

}
class FireFoxDriver implements WebDriverInt,RemoteWebDriver{

    public void navigate(){
        System.out.println("FireFoxDriver navigated to page");
    }

    public void open(){System.out.println("FireFoxDriver opened the page");}
    public void close(){System.out.println("FireFoxDriver closed the page");}
    public String getTitle(){return "FireFox";}

}
class SafariDriver implements WebDriverInt,RemoteWebDriver {

    public void navigate() {
        System.out.println("Safari navigated to page");
    }

    public void open() {
        System.out.println("Safari opened the page");
    }

    public void close() {
        System.out.println("Safari closed the page");
    }

    public String getTitle() {
        return "Safari";}

}


class TestWebDrivers{
    public static void main(String[] args) {

        RemoteWebDriver[]arr = {new ChromeDriver(),new FireFoxDriver(), new SafariDriver()};

        for(RemoteWebDriver web: arr ){

            web.open();
            web.close();
            web.getTitle();
            web.navigate();
            // web.getScreeShot(); not available

        }

    }

}
