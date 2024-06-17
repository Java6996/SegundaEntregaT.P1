package tp1segundaentrega;

import java.util.LinkedList;

import javax.swing.*;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String[] Opciones = {
						"Jugar partida","Salir"
						};
				int opcion =0;
				do {
					opcion = JOptionPane.showOptionDialog(null, "Elegí una opcion", null, 0, opcion, null, Opciones, opcion);
					switch (opcion) {
					case 0:
						int capitulos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos capitulos tiene la campaña"));
							if (capitulos<=5) {
								JOptionPane.showMessageDialog(null, "Se puede jugar la partida.");	
								int opcion1 =0;
								String[] Opciones1 = {
										"Zombies","Supervivientes","Ver equipos","Empezar la campaña","Salir"
										};
								do {
									opcion1= JOptionPane.showOptionDialog(null, "Elegí un equipo", null, 
											opcion1, opcion1, null, Opciones1, Opciones1[0]);
									switch (opcion1) {
									case 0:
										GestorEquipos gestorzombie = new GestorEquipos().agregarJugadoresZombies(null);
										 Equipo RandomZombies=new Equipo(null, null).generarJugadoresZombies(opcion);
										 LinkedList<Jugadores>zombies1=null;
										 for (int i = 0; i <=3; i++) {
											 RandomZombies.generarJugadoresZombies(i);
										}
										 JOptionPane.showMessageDialog(null, RandomZombies);
									break;
									case 1:
										GestorEquipos gestorsupers = new GestorEquipos().agregarJugadoresSuperviviente(null);
										Equipo RandomSupers=new Equipo(null, null).generarJugadoresSupers(opcion);
										LinkedList<Jugadores>supervivientes=null;
										 for (int i = 0; i <=3; i++) {
											 RandomSupers.generarJugadoresSupers(i);
											}
										 JOptionPane.showMessageDialog(null, RandomSupers);
									break;
									case 2:
										int opcion2=0;
										String[] Opciones2 = {
												"Zombies","Supervivientes","Salir"
												};
										do {
											opcion2= JOptionPane.showOptionDialog(null, "Elegí un equipo", null, 
													opcion2, opcion2, null, Opciones2, Opciones2[0]);
											switch (opcion2) {
											case 0:
												zombies1=null;
												Equipo mostrarzombies=new Equipo(null, zombies1).mostrarZombies();
												break;
											case 1:
												supervivientes=null;
												Equipo mostrarsupervivientes=new Equipo(null, supervivientes).mostrarSupervivientes();
												break;
											case 2:
												JOptionPane.showMessageDialog(null, "Saliendo del la sección de 'Ver equipos'.");
												break;
											}
										} while (opcion2!=2);
										
									break;
									case 3:
										zombies1=null;
										supervivientes=null;
										Equipo puntosSupers=new Equipo(null, zombies1).PuntosSupervivientes();
										Equipo puntosZombies=new Equipo(null, supervivientes).PuntosZombies();
										break;
									case 4:
										JOptionPane.showMessageDialog(null, "Saliendo de la partida.");
										break;
									} 
								}while (opcion1!=4);
						} else {
							JOptionPane.showMessageDialog(null, "No se puede jugar la partida, hay más de 5 capitulos.");
						}	
						
						case 1:
							JOptionPane.showMessageDialog(null, "Saliendo del menu principal.");
						break;
						}
				} while (opcion!=1);
			}
	}