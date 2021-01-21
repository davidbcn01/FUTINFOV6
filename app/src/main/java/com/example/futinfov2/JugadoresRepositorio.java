package com.example.futinfov2;

import java.util.ArrayList;
import java.util.List;

public class JugadoresRepositorio {
    List<Jugador> jugadores = new ArrayList<>();
    JugadoresRepositorio(){
        jugadores.add(new Jugador("Pelé","SD",91,"Link","Link","Link","Link"));
        jugadores.add(new Jugador("Ronaldo","DC",94,"Link","Link","Link","Link"));
        jugadores.add(new Jugador("Eusebio","SD",89,"Link","Link","Link","Link"));
        jugadores.add(new Jugador("Pelé","SD",91,"Link","Link","Link","Link"));
        jugadores.add(new Jugador("Gullit","SD",90,"Link","Link","Link","Link"));
        jugadores.add(new Jugador("Cruyff","SD",91,"Link","Link","Link","Link"));
    }
    List<Jugador> obtener(){
        return jugadores;
    }
}
