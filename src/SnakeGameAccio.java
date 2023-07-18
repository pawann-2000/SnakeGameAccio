import java.awt.EventQueue;
import javax.swing.JFrame;
//Main SnakeGameAccio class
public class SnakeGameAccio extends JFrame {
    public static Board playBoard;
    public SnakeGameAccio() {

        initUI();
    }

    private void initUI() {
        playBoard = new Board();
        add(playBoard);

        setResizable(false);
        pack();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new SnakeGameAccio();
            ex.setVisible(true);

        });
    }
}
