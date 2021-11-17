package Veicoli;

public class Automobile extends VeicoloAMotore {

	private int numeroPorte;
	public Automobile(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

	public String toString() {
		return "Anno immatricolazione: " + super.getAnnoImmatricolazione() + "\n" + 
				"Marca: " + super.getMarca() + "\n" +
				"Alimentazione: " + super.getTipoAlimentazione() + "\n" +
				"Cilindrata: " + super.getCilindrata() + "\n" +
				"Numero di porte: " + this.numeroPorte;
	}
}
