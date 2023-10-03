public class Pile
{
    // Pile d'entiers

    private int[] elements;
    private int sommet;

    public Pile(int taille)
    {
        elements = new int[taille];
        sommet = -1;
    }

    public void empiler(int valeur)
    {
        if (!estPleine())
        {
            sommet++;
            elements[sommet] = valeur;
        }
    }

    public int depiler()
    {
        if (!estVide())
        {
            int valeur = elements[sommet];
            sommet--;
            return valeur;
        }
        else
        {
            return 0;
        }
    }

    public int sommet()
    {
        if (!estVide())
        {
            return elements[sommet];
        }
        else
        {
            return 0;
        }
    }

    public boolean estVide()
    {
        return sommet == -1;
    }

    public boolean estPleine()
    {
        return sommet == elements.length - 1;
    }
}