public class Calculatrice
{
    // Calculatrice qui ajoute multiplier divise et soustrait plusieurs nombres
    // en notation polonaise inverse

    private Pile pile;
    private Controleur controleur;

    public Calculatrice(Controleur controleur)
    {
        this.controleur = controleur;
        pile = new Pile(100);
    }

    public void ajouter()
    {
        int a = pile.depiler();
        int b = pile.depiler();
        pile.empiler(a + b);
    }

    public void soustraire()
    {
        int a = pile.depiler();
        int b = pile.depiler();
        pile.empiler(b - a);
    }

    public void multiplier()
    {
        int a = pile.depiler();
        int b = pile.depiler();
        pile.empiler(a * b);
    }

    public void diviser()
    {
        int a = pile.depiler();
        int b = pile.depiler();
        pile.empiler(b / a);
    }

    public void empiler(int valeur)
    {
        pile.empiler(valeur);
    }

    public int depiler()
    {
        return pile.depiler();
    }

    public int sommet()
    {
        return pile.sommet();
    }

    public boolean estVide()
    {
        return pile.estVide();
    }

    public boolean estPleine()
    {
        return pile.estPleine();
    }

    public void afficher(String texte)
    {
        controleur.afficher(texte);
    }

    public void calculer(String expression)
    {
        String[] elements = expression.split(" ");
        for (String element : elements)
        {
            if (element.equals("+"))
            {
                ajouter();
            }
            else if (element.equals("-"))
            {
                soustraire();
            }
            else if (element.equals("*"))
            {
                multiplier();
            }
            else if (element.equals("/"))
            {
                diviser();
            }
            else
            {
                empiler(Integer.parseInt(element));
            }
        }
        afficher("Résultat : " + depiler());
    }
}