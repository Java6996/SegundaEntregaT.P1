package tp1segundaentrega;

public class GestorEquipos {
	// TODO Auto-generated constructor stub
		private Equipo supervivientes;
	    private Equipo zombies;

		public Equipo getZombies() {
			return zombies;
		}
		public void setZombies(Equipo zombies) {
			this.zombies = zombies;
		}
		public Equipo getSupervivientes() {
			return supervivientes;
		}
		public void setSupervivientes(Equipo supervivientes) {
			this.supervivientes = supervivientes;
		}
		@Override
		public String toString() {
			return "GestorEquipos [supervivientes=" + supervivientes + ", zombies=" + zombies + "]";
		}
		public GestorEquipos agregarJugadoresSuperviviente(Jugadores jugador) {
	        this.supervivientes.JugadoresSupervivientes(jugador);
			return null;
	    }
		public GestorEquipos agregarJugadoresZombies(Jugadores jugador) {
	       this.zombies.JugadoresZombies(jugador);
	       return null;
	    }
		
		}