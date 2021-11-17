package Veicoli;

public class Furgone extends VeicoloAMotore {

	private int capacità;
	public Furgone(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
	}
	
	public int getCapacità() {
		return capacità;
	}
	public void setCapacità(int capacità) {
		this.capacità = capacità;
	}
	
	public String toString() {
		return "Anno immatricolazione: " + super.getAnnoImmatricolazione() + "\n" + 
				"Marca: " + super.getMarca() + "\n" +
				"Alimentazione: " + super.getTipoAlimentazione() + "\n" +
				"Cilindrata: " + super.getCilindrata() + "\n" +
				"Capacità di carico: " + this.capacità;
	}

}