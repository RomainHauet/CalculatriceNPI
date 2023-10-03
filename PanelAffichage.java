public class PanelAffichage extends JPanel
{
    // Panel affichage de la calculatrice
    
    private Controleur controleur;
    private JLabel affichage;

    public PanelAffichage(Controleur controleur)
    {
        this.controleur = controleur;
        affichage = new JLabel("0");
        affichage.setHorizontalAlignment(JLabel.RIGHT);
        affichage.setFont(new Font("Arial", Font.BOLD, 20));
        setLayout(new BorderLayout());
        add(affichage, BorderLayout.CENTER);
    }

    public void afficher(String texte)
    {
        affichage.setText(texte);
    }

    public void effacer()
    {
        affichage.setText("0");
    }

    public void ajouterChiffre(int chiffre)
    {
        if (affichage.getText().equals("0"))
        {
            affichage.setText("" + chiffre);
        }
        else
        {
            affichage.setText(affichage.getText() + chiffre);
        }
    }

    public void ajouterOperateur(String operateur)
    {
        if (affichage.getText().equals("0"))
        {
            controleur.ajouterOperateur(operateur);
        }
        else
        {
            controleur.ajouterChiffre(Integer.parseInt(affichage.getText()));
            controleur.ajouterOperateur(operateur);
        }
    }

    public void calculer()
    {
        controleur.ajouterChiffre(Integer.parseInt(affichage.getText()));
        controleur.calculer();
    }

    public void ajouterPoint()
    {
        if (!affichage.getText().contains("."))
        {
            affichage.setText(affichage.getText() + ".");
        }
    }

    public void effacerChiffre()
    {
        if (affichage.getText().length() > 1)
        {
            affichage.setText(affichage.getText().substring(0, affichage.getText().length() - 1));
        }
        else
        {
            affichage.setText("0");
        }
    }

    public void effacerTout()
    {
        controleur.effacerTout();
    }

    public void changerSigne()
    {
        if (!affichage.getText().equals("0"))
        {
            if (affichage.getText().charAt(0) == '-')
            {
                affichage.setText(affichage.getText().substring(1));
            }
            else
            {
                affichage.setText("-" + affichage.getText());
            }
        }
    }
}