import javax.swing.JOptionPane;

public class Methoden {

	//METHODEN
	
		//Pop-Up Fenster mit PW-Abfrage
		public static String input() {
			String a = JOptionPane.showInputDialog("Wie lautet Ihr Passwort?");
			return a;
		}
		
		//Hinterlegtes PW
		public static String pw() {
			String a = ("asdf");
			return a;
			
		}
		//Hinterlegter "Geheimcode"
		public static String ausgabe() {
			String a = ("Korrektes Passwort, der heutige Code lautet 123");
			return a;
		}
		
		//Vergleich von Input und PW, geloopt; wenn PW falsch neuerliche Eingabe; wenn PW richtig break loop
		public static void loop() {
			do
			{
				if (input().contentEquals(pw()))
				{			
					break;
				}
				else
				{
					System.out.println("Falsches Passwort!");
				}
			}
			while (true);
		}
	
	
}
