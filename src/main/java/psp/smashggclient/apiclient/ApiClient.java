package psp.smashggclient.apiclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
    public String getTournamentPhase(String tournamentSlug) throws IOException, IOException, InterruptedException {
        String url = "https://api.smash.gg/tournament/" + tournamentSlug + "?expand[]=phase";
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();
        int responseCode = response.statusCode();

        if (responseCode == 200) {
            //System.out.println(responseBody);
            return responseBody;
        }
        return null;
    }
    
    public void getEntrantsPerPhase() throws IOException, InterruptedException {
        // 1057669 = phase_id
        String url = "https://api.smash.gg/phase_group/" + "1057669" + "?expand[]=entrants";
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();
        int responseCode = response.statusCode();

        if (responseCode == 200) {
            System.out.println(responseBody);
        }
    }
}
