import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame{
    //Widget
    private JButton btnPanini[];
    private JButton btnStampa, btnAggiungi, btnConferma;
    private JPanel pnlSx,pnlDown,pnlCentral,pnlLabel;
    private JLabel lblCode;
    private JLabel lblIngredienti;

    View(int n){
        super("Java Burger");
        //Istanzio i widget
        
        //Dispongo i widget  

        //Operazioni finali
        setSize(400,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }

    //Definire i getter per ogni widget
   

    //Definire i setter per le Label
    
}
