import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Extractor {
    ArrayList<String> currencyNames = new ArrayList<>(53);
    ArrayList<String> currencyRates = new ArrayList<>(53);

     {
         Document doc;
         try {
             doc = Jsoup.connect("https://www.x-rates.com/table/?from=INR&amount=1").get();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         String data = doc.select("tr").toString();
        String[] splitData = Arrays.stream(data.split("</tr>")).toArray(String[]::new);

        for (int i = 12; i < splitData.length;i++){
            String[] currency_data = Arrays.stream(splitData[i].split("</td>")).toArray(String[]::new);
            currencyNames.add(currency_data[0].substring(11));
            currencyRates.add(currency_data[2].substring(83).split("</a>")[0]);
        }
    }
}
