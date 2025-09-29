package vs;
    import javax.swing.*;


public class swing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing Window");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to Swing GUI!");
        frame.add(label);

        frame.setVisible(true);
    }
}
