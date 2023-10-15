package ex2;

public class Main {

	public static void main(String[] args) {
		        Dictionnaire larousse = new Dictionnaire(10, "Larousse");
		        larousse.ajouterMot("Informatique", "Science du traitement de l'information.");
		        larousse.ajouterMot("Programmation", "Processus de création de programmes informatiques.");
		        larousse.ajouterMot("Internet", "Réseau mondial de communication.");

		        int positionMotInexistant = larousse.chercherMot("Dictionnaire");
		        if (positionMotInexistant == -1) {
		            System.out.println("Le mot 'Dictionnaire' n'a pas été trouvé dans le dictionnaire.");
		        }

		        int positionMotExistant = larousse.chercherMot("Informatique");
		        if (positionMotExistant != -1) {
		            MotDico motExistant = larousse.getDico()[positionMotExistant];
		            System.out.println("Mot " + motExistant.getNum() + ": " + motExistant.getMot() + " - Définition: " + motExistant.getDefinition());
		        }

		       
		        larousse.supprimerMot("Informatique");

		        larousse.listerDico();
		    }
}
