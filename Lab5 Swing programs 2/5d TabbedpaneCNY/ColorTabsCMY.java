package swings.jlist;



import javax.swing.*;
import java.awt.*;

public class ColorTabsCMY extends JFrame {

    public ColorTabsCMY() {
        JTabbedPane tabs = new JTabbedPane();

        tabs.add("CYAN",    makePanel(Color.CYAN));
        tabs.add("MAGENTA", makePanel(Color.MAGENTA));
        tabs.add("YELLOW",  makePanel(Color.YELLOW));

        tabs.addChangeListener(e ->
                System.out.println(tabs.getTitleAt(tabs.getSelectedIndex()) + " tab selected"));

        add(tabs);
        setTitle("5d – CMY Tabs");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JPanel makePanel(Color c) {
        JPanel p = new JPanel();
        p.setBackground(c);
        return p;
    }

    public static void main(String[] args) {
        new ColorTabsCMY();
    }
}
