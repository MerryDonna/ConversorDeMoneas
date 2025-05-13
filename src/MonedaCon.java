import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MonedaCon {

    public Moneda conversion(String divisa1, String divisa2) {
        URI direccionURL = URI.create("https://v6.exchangerate-api.com/v6/75c4a70b78a77f363e49f065/pair/"+divisa1+"/"+divisa2);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccionURL)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("Moneda no Encontrada");
        }

    }
}
