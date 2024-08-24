package futbol;

public class Jugador extends Futbolista{
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador () {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}
	
	public Jugador (String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre,edad,posicion);
		this.dorsal=dorsal;
		this.golesMarcados=golesMarcados;
	}

	@Override
	public int compareTo(Futbolista o) {
		return Math.abs(this.getEdad() - o.getEdad());
	}
	
	@Override
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+
	dorsal + ". Ha marcado "+golesMarcados;
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
