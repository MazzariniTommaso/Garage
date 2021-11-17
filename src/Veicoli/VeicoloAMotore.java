package Veicoli;

public class VeicoloAMotore {

	private int annoImmatricolazione;
	private String marca;
	private String tipoAlimentazione;
	private int cilindrata;
	
	public VeicoloAMotore() {}

	public VeicoloAMotore(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		this.annoImmatricolazione = annoImmatricolazione;
		this.marca = marca;
		this.tipoAlimentazione = tipoAlimentazione;
		this.cilindrata = cilindrata;
	}

	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}

	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}

	public void setTipoAlimentazione(String tipoAlimentazione) {
		this.tipoAlimentazione = tipoAlimentazione;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	
	
}
