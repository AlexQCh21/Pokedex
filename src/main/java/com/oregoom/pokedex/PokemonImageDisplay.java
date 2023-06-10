package com.oregoom.pokedex;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class PokemonImageDisplay {

    
    public void imagenProceso(String id, InterfaceVisual intre){
        String pokemonId = String.valueOf(id.trim()); // ID del Pokémon
        int id_ = Integer.parseInt(pokemonId);
        InterfaceVisual intre1 = intre;
        if(id_<10){
            pokemonId = "00"+pokemonId;
        }else if(9<id_ && id_<100){
            pokemonId = "0"+pokemonId;
        }
        String imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/" + pokemonId + ".png";


        try {
            URL url = new URL(imageUrl);
            ImageIcon imageIcon = new ImageIcon(url);
            Image image = imageIcon.getImage();
            Image resizedImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            // Crea una etiqueta para mostrar la imagen
            //JLabel label = new JLabel();
            //label.setIcon(imageIcon);
            // Crea una ventana y agrega la etiqueta
            intre1.imagen_p.setIcon(new ImageIcon(resizedImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

}
