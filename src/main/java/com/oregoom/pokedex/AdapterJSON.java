package com.oregoom.pokedex;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdapterJSON implements ClientInterfacePokeDex {

    InterfaceVisual intre = new InterfaceVisual();
    private String id;
    
    static AdapterJSON instance;
    
    private AdapterJSON(){
        
    }
    
    public static AdapterJSON getInstance(){
        if(instance==null){
            instance = new AdapterJSON();
        }
        
        return instance;
    }

    @Override
    public void tranform(String id) {
        Scanner en = new Scanner(System.in);
        String url = "https://pokeapi.co/api/v2/pokemon/" + id.trim();
        ObjectMapper objectMapper = new ObjectMapper();
        Gson gson = new GsonBuilder().create();

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());

            Pokemon datos = new Gson().fromJson(resp.body(), Pokemon.class);

            String nom = String.valueOf(datos.getNombre().trim());
            String peso = String.valueOf(datos.getPeso().trim());

            PokemonImageDisplay pid = new PokemonImageDisplay();
            pid.imagenProceso(id, intre);

            intre.mostrarInfo(nom, peso, id, datos.getHeight());
            intre.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdapterJSON.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(AdapterJSON.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
