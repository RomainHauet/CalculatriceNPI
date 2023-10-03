public class PannelBouton extends JPanel
{
    // Panel boutons de la calculatrice

    private Controleur controleur;

    public PanelBouton(Controleur controleur)
    {
        this.controleur = controleur;
        setLayout(new GridLayout(4, 4));
        add(new Bouton("7", controleur));
        add(new Bouton("8", controleur));
        add(new Bouton("9", controleur));
        add(new Bouton("/", controleur));
        add(new Bouton("4", controleur));
        add(new Bouton("5", controleur));
        add(new Bouton("6", controleur));
        add(new Bouton("*", controleur));
        add(new Bouton("1", controleur));
        add(new Bouton("2", controleur));
        add(new Bouton("3", controleur));
        add(new Bouton("-", controleur));
        add(new Bouton("0", controleur));
        add(new Bouton(".", controleur));
        add(new Bouton("=", controleur));
        add(new Bouton("+", controleur));
    }

    //Event bouton
    private class Bouton extends JButton implements ActionListener
    {
        private Controleur ctrl;

        public Bouton(String texte, Controleur ctrl)
        {
            super(texte);
            this.ctrl = ctrl;
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent e)
        {
            switch (getText())
            {
                case "+":
                case "-":
                case "*":
                case "/":
                    ctrl.ajouterOperateur(getText());
                    break;
                case "=":
                    ctrl.calculer();
                    break;
                case ".":
                    ctrl.ajouterPoint();
                    break;
                default:
                    ctrl.ajouterChiffre(Integer.parseInt(getText()));
                    break;
            }
        }
    }

}