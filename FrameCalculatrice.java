public class FrameCalculatrice
{
    //Frame de la calculatrice contenant le panel affichage et le panel boutons

    private Controleur controleur;

    public FrameCalculatrice(Controleur controleur)
    {
        this.controleur = controleur;
        setTitle("Calculatrice NPI");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new PanelAffichage(controleur), BorderLayout.NORTH);
        add(new PanelBouton(controleur), BorderLayout.CENTER);
        setVisible(true);
    }

}