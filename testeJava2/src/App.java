import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws Exception {
        var url = "https://imdb-api.com/en/API/Top250Movies/k_p4r1xs5r";
        URI uri = URI.create(url); //URI é mais genérico que a URL

        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(uri).build();

        //peha o texto (JSON)
        String json = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

        //IMPRIME O TEXTO
        System.out.println(json);
    }
}
