package Garage;
import Veicoli.*;

public class Garage {
		
		VeicoloAMotore[] listaVeicoli = new VeicoloAMotore[15];
		private int numeroPosto = 0;
		
		public Garage(){}
		
		public int ImmettiVeicolo(VeicoloAMotore v) {
			int i = 0;
			boolean flag = true;
			while(flag && i<15)
			{
				if (listaVeicoli[i] == null)
				{
					listaVeicoli[i] = v;
					this.numeroPosto = i;
					flag = false;
					
				}
				i++;
			}
			return this.numeroPosto;	
		}
		
		public VeicoloAMotore estraiVeicolo (int x)
		{
			VeicoloAMotore veicolo = listaVeicoli[x-1];
			listaVeicoli[x-1] = null;
			return veicolo;
		}
		
		public void SituazionePosti()
		{
			System.out.println("I posti disponibili sono:");
			for (int i = 0; i<15; i++ )
			{
				if (listaVeicoli[i] == null) System.out.print("["+ (i+1) + "°] ");
			}
			System.out.println();
		}
		

}
