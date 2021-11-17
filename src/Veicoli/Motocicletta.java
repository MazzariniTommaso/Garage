package Veicoli;

public class Motocicletta extends VeicoloAMotore {
	
	private String tipo;
	private int numeroTempi;
	public Motocicletta(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getNumeroTempi() {
		return numeroTempi;
	}


	public void setNumeroTempi(int numeroTempi) {
		this.numeroTempi = numeroTempi;
	}

	public String toString() {
		return "Anno immatricolazione: " + super.getAnnoImmatricolazione() + "\n" + 
				"Marca: " + super.getMarca() + "\n" +
				"Alimentazione: " + super.getTipoAlimentazione() + "\n" +
				"Cilindrata: " + super.getCilindrata() + "\n" +
				"Tipo: " + this.tipo + "\n" +
				"Numero tempi motore: " + this.numeroTempi;
	}
}