public class Metier
{
    // Metier de la calculatrice

    private Controleur controleur;
    private Pile pile;
    private String affichage;

    public Metier(Controleur controleur)
    {
        this.controleur = controleur;
        pile = new Pile(10);
        affichage = "";
    }

    public void ajouterChiffre(int chiffre)
    {
        affichage += chiffre;
        controleur.afficher(affichage);
    }

    public void ajouterOperateur(String operateur)
    {
        if (pile.estVide())
        {
            pile.empiler(Integer.parseInt(affichage));
            affichage = "";
        }
        else
        {
            int operande1 = pile.depiler();
            int operande2 = Integer.parseInt(affichage);
            int resultat = 0;
            switch (operateur)
            {
                case "+":
                    resultat = operande1 + operande2;
                    break;
                case "-":
                    resultat = operande1 - operande2;
                    break;
                case "*":
                    resultat = operande1 * operande2;
                    break;
                case "/":
                    resultat = operande1 / operande2;
                    break;
            }
            pile.empiler(resultat);
            affichage = "";
        }
    }

    public void calculer()
    {
        controleur.afficher("" + pile.depiler());
    }
}