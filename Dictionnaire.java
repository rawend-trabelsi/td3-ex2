package ex2;

public class Dictionnaire {
    private int nbMots;
    private MotDico[] dico;
    private String nom;

    public Dictionnaire(int nbMots, String nom) {
        this.nbMots = 0;
        this.dico = new MotDico[nbMots];
        this.nom = nom;
    }

    public int getNbMots() {
        return nbMots;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public MotDico[] getDico() {
        return dico;
    }

    public void setDico(MotDico[] dico) {
        this.dico = dico;
    }

    public void ajouterMot(String mot, String definition) {
        if (nbMots < dico.length) {
        	dico[nbMots] = new MotDico();
        	dico[nbMots].setMot(mot);
        	dico[nbMots].setDefinition(definition);

            nbMots++;
        } else {
            System.out.println("Le dictionnaire est plein. Impossible d'ajouter plus de mots.");
        }
    }

    public void supprimerMot(String ch) {
        int i = 0;
        int j = 0;

        while (i < nbMots) {
            if (dico[i] != null && dico[i].getMot()==(ch)) {
                dico[i] = null;
            }
            i++;
        }

        i = 0;

        while (i < nbMots) {
            if (dico[i] != null) {
                dico[j] = dico[i];
                j++;
            }
            i++;
        }

        while (j < nbMots) {
            dico[j] = null;
            j++;
        }

        nbMots = j;
    }


    public int chercherMot(String ch) {
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].getMot().equals(ch)) {
                return i;
            }
        }
        return -1;
    }

    public void listerDico() {
        System.out.println("Contenu du dictionnaire '" + nom + "':");
        for (int i = 0; i < nbMots; i++) {
            MotDico mot = dico[i];
            System.out.println("Mot #" + mot.getNum() + ": " + mot.getMot() + " - Définition: " + mot.getDefinition());
        }
    }

    public int nbSynonymes(MotDico m) {
        int count = 0;
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].synonyme(m)) {
                count++;
            }
        }
        return count;
    }

   
}
