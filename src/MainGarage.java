import Garage.*;
import Veicoli.*;
public class MainGarage {

	public static void main(String[] args) 
	{
		Garage Garage = new Garage();
		/*Furgone f = new Furgone(2001,"Fiat", "benzina",2000);
		f.setCapacità(40);*/
		Automobile a = new Automobile(2021,"Tesla", "elettrico",2500);
		a.setNumeroPorte(5);
		Automobile m = new Automobile(2010,"BMW", "benzina",2000);
		Garage.SituazionePosti();
		//Garage.ImmettiVeicolo(f);
		Garage.ImmettiVeicolo(a);
		Garage.ImmettiVeicolo(m);
		Garage.SituazionePosti();
		System.out.println(Garage.estraiVeicolo(1));
		System.out.println(Garage.estraiVeicolo(2));
		Garage.SituazionePosti();
	}

}
