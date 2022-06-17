package jana60.valutazioni;

public class Main {

	public static void main(String[] args) {
		
		// array di studenti
		
				Studente Romolo = new Studente(1, 25, 5.0);
				Studente NumaPompilio = new Studente(2, 50, 1.0);
				Studente TullioOstilio = new Studente(3, 51, 3.0);
				Studente AncoMarzio = new Studente(4, 35, 2.0);
				Studente TarquinioPrisco = new Studente(5, 22, 5.0);
				Studente ServioTullio = new Studente(6, 71, 4.0);
				Studente TarquinioilSuperbo = new Studente(7, 12, 3.0);
				Studente[] Studenti = { Romolo, NumaPompilio, TullioOstilio, AncoMarzio, TarquinioPrisco, ServioTullio, TarquinioilSuperbo };

				
				int studentiPromossi = 0;
				int idStudente = 201;
				
				
				for (int i = 0; i < Studenti.length; i++) {
					if (Studenti[i].esitoFinale()) {
						System.out.println("Lo studente con ID " + idStudente + " è stato Promosso");
						studentiPromossi++;
						idStudente ++;

					} else {
						System.out.println("Lo studente con ID " + idStudente + " è stato Bocciato");
						idStudente++;
					}

				}

				// stampare il numero totale di studenti promossi
				System.out.println("\nIn totale gli  studenti promossi sono: " + studentiPromossi);
			}

}
