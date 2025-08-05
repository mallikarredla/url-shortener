import java.util.HashMap;
import java.util.Map;

public class URLShortener {
    private Map<String, String> urlToCode = new HashMap<>();
    private Map<String, String> codeToUrl = new HashMap<>();
    private static final String BASE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODE_LENGTH = 6;
    private int counter = 1;

    // Custom domain
    private static final String DOMAIN = "http://localhost:8080/";


    public String shorten(String url) {
        if (urlToCode.containsKey(url)) {
            return DOMAIN + urlToCode.get(url);
        }

        String code = encode(counter++);
        urlToCode.put(url, code);
        codeToUrl.put(code, url);
        return DOMAIN + code;
    }

    public String getOriginal(String shortUrl) {
        // Extract just the code by removing the domain
        String code = shortUrl.replace(DOMAIN, "");
        return codeToUrl.getOrDefault(code, null);
    }

    private String encode(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(BASE.charAt(num % BASE.length()));
            num /= BASE.length();
        }
        while (sb.length() < CODE_LENGTH) {
            sb.append('0');
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        URLShortener shortener = new URLShortener();

        String longUrl = "https://www.google.com/search?q=java";
        String shortUrl = shortener.shorten(longUrl);

        System.out.println("Shortened URL: " + shortUrl);
        System.out.println("Original URL: " + shortener.getOriginal(shortUrl));
    }
}
