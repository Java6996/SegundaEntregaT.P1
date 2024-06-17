package tp1segundaentrega;

import java.util.LinkedList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Equipo {
		// TODO Auto-generated constructor stub
	private String username;
	private LinkedList<Jugadores>jugadores=new LinkedList<Jugadores>();
	public Equipo(String username, LinkedList<Jugadores> jugadores) {
		super();
		this.username = username;
		this.jugadores = jugadores;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LinkedList<Jugadores> getJugadores() {
		return jugadores;
	}
	public void setJugadores(LinkedList<Jugadores> jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [username=" + username + ", jugadores=" + jugadores + "\n]";
	}
	public void JugadoresSupervivientes(Jugadores jugador) {
        if (jugadores.size()<=4) {
            jugadores.add(jugador);
            JOptionPane.showMessageDialog(null, "El equipo superviviente ya tiene 4 jugadores, se puede jugar la partida.");
        } else {
            JOptionPane.showMessageDialog(null, "El equipo superviviente no tiene 4 jugadores, no se puede jugar la partida.");
        }  
    }
	public void JugadoresZombies(Jugadores jugador) {
        if (jugadores.size()<=4) {
            jugadores.add(jugador);
            JOptionPane.showMessageDialog(null, "El equipo superviviente ya tiene 4 jugadores, se puede jugar la partida.");
        } else {
            JOptionPane.showMessageDialog(null, "El equipo superviviente no tiene 4 jugadores, no se puede jugar la partida.");
        }  
    }
	public Equipo generarJugadoresSupers(int cantidad) {
        Random random = new Random();
        int cantidad1=(int)(Math.random()*3+1);
        for (int i = 0; i <=cantidad1; i++) {
            String username = "Jugador " + (jugadores.size() + 1);
            Jugadores jugadores = new Jugadores(true, false);
            JugadoresSupervivientes(jugadores);
        }
        return null;
	}
	public Equipo generarJugadoresZombies(int cantidad) {
        Random random = new Random();
        int cantidad1=(int)(Math.random()*3);
        for (int i = 0; i <=cantidad1; i++) {
            String username = "Jugador " + (jugadores.size() + 1);
            Jugadores jugadores = new Jugadores(true, false);
            JugadoresZombies(jugadores);
        }
        return null;     
	}
	public Equipo PuntosSupervivientes() {
        int puntos = 0;
        boolean vivo = true;
        boolean eliminado = false;
        puntos=(int)(Math.random()*600);
        for (Jugadores jugador : jugadores) {
            if (jugador.isVivo()&& puntos==500 || puntos>=500) {
                puntos=500/jugadores.size();
                JOptionPane.showMessageDialog(null, "Los jugadores supervivientes GANARON el capitulo con un puntaje de " + puntos + " puntos.");
            } else if (jugador.isEliminado() || puntos<=500){
                eliminado = true;
                JOptionPane.showMessageDialog(null, "Los jugadores supervivientes PERDIERON el capitulo con un puntaje de " + puntos + " puntos."); 
            }
        }
        return null;
    }
	public Equipo PuntosZombies() {
        int daño = (int) (Math.random()*600); 
        int puntos = daño;
        if (daño==500 || daño>=500) {
            puntos += 25;
            JOptionPane.showMessageDialog(null, "Los jugadores zombies GANARON el capitulo con un puntaje de " + puntos + " puntos.");
        }else {
            JOptionPane.showMessageDialog(null, "Los jugadores zombies PERDIERON el capitulo con un puntaje de " + puntos + " puntos.");
        }
        return null;
    }
	public Equipo mostrarSupervivientes() {
        JOptionPane.showMessageDialog(null, "Equipo superviviente: " + username);
        for (Jugadores jugador : jugadores) {
            JOptionPane.showMessageDialog(null, jugador.toString() + " - " + (jugador.isVivo() + "Vivo" + "\nEliminado" + jugador.isEliminado()));
        }
        return null;
    }
	public Equipo mostrarZombies() {
        JOptionPane.showMessageDialog(null, "Equipo zombie: " + username);
        for (Jugadores jugador : jugadores) {
            JOptionPane.showMessageDialog(null, jugador.toString());
        }
        return null;
    }
}