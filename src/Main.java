import Prog1Tools.IOTools;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		int i = 0, summe = 0;
		double mittelwert = 0.0;
		int verkauf[] = new int[12];

		DecimalFormat df = new DecimalFormat("###.##");
		
		while (i < 12) {
			
			verkauf[i] = IOTools.readInteger("Geben Sie eine Zahl für " + (i + 1) + ". Monat ein: ");
			summe = summe + verkauf[i];
			mittelwert = summe / 12;
			i++;
			
		}
		System.out.println("Der Mittelwert der Verkaufszahlen für Wanderschuhe beträgt: " + df.format(mittelwert));

	}

}
