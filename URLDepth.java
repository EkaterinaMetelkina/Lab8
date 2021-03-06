import java.net.MalformedURLException;
import java.net.URL;

public class URLDepth {

    private String URL;
    private int depth;

    public URLDepth (String url, int num) {
        URL = url;
        depth = num;
    }

    /**
     * Метод возвращает унифицированную метку ресурса для данного объекта
     */
    public String getURL() {
        return URL;
    }
    /**
     * Метод возвращает глубину поиска для данного объекта
     */
    public int getDepth (){
        return depth;
    }

    /**
     * Метод, возвращающий путь для данной ссылки, либо возвращающий пустую строку, если такого пути нет
     */
    public String getDocPath() {
        try {
            URL url = new URL(URL);
            return url.getPath();
        }
        catch (MalformedURLException e) {
            System.err.println("MalformedURLException: " + e.getMessage());
            return null;
        }
    }
    /*
    public String getDocPath() {
        Pattern p = Pattern.compile("http://.*?/(.*)");
        Matcher m = p.matcher(URL);
        if (m.find()) {
            return "/" + m.group(1);
        } else {
            return "/";
        }
    }
    */

    /*
     * Метод возвращает глубину поиска и URL в виде строки
     */
    public String toString() {
        String stringDepth = Integer.toString(depth);
        return stringDepth + '\t' + URL;
    }

    /*
     * Метод возвращающий хост в виде строки
     */
    public String getWebHost() {
        try {
            URL url = new URL(URL);
            return url.getHost();
        }
        catch (MalformedURLException e) {
            System.err.println("MalformedURLException: " + e.getMessage());
            return null;
        }
    }
}