public class Controleur
{
    // Controleur de la calculatrice

    private Metier metier;
    private FrameCalculatrice frame;

    public Controleur()
    {
        metier = new Metier(this);
        frame = new FrameCalculatrice(this);
    }

    public static void main(String[] args)
    {
        Controleur controleur = new Controleur();
    }

    public void afficher(String texte)
    {
        frame.afficher(texte);
    }

    public void ajouterChiffre(int chiffre)
    {
        metier.ajouterChiffre(chiffre);
    }

    public void ajouterOperateur(String operateur)
    {
        metier.ajouterOperateur(operateur);
    }

    public void calculer()
    {
        metier.calculer();
    }

    public void ajouterPoint()
    {
        metier.ajouterPoint();
    }

    public void effacer()
    {
        metier.effacer();
    }

    public void quitter()
    {
        System.exit(0);
    }

    public void ajouter()
    {
        metier.ajouter();
    }

    public void soustraire()
    {
        metier.soustraire();
    }

    public void multiplier()
    {
        metier.multiplier();
    }

    public void diviser()
    {
        metier.diviser();
    }

    public void empiler(int valeur)
    {
        metier.empiler(valeur);
    }

    public int depiler()
    {
        return metier.depiler();
    }

    public int sommet()
    {
        return metier.sommet();
    }

    public boolean estVide()
    {
        return metier.estVide();
    }

    public static void main(String[] args)
    {
        Controleur controleur = new Controleur();
    }

}