package swings.jlist;


import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountryCapitalList extends JFrame {

    public CountryCapitalList() {
        Map<String,String> data = new LinkedHashMap<>();
        data.put("USA", "Washington D.C.");
        data.put("India", "New Delhi");
        data.put("Vietnam", "Hanoi");
        data.put("Canada", "Ottawa");
        data.put("Denmark", "Copenhagen");
        data.put("France", "Paris");
        data.put("Great Britain", "London");
        data.put("Japan", "Tokyo");
        data.put("Africa", "Pretoria");      // continent, example capital
        data.put("Greenland", "Nuuk");
        data.put("Singapore", "Singapore");

        String[] countries = data.keySet().toArray(new String[0]);
        JList<String> jList = new JList<>(countries);

        jList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String c = jList.getSelectedValue();
                    if (c != null) {
                        System.out.println("Capital of " + c + " is " + data.get(c));
                    }
                }
            }
        });

        add(new JScrollPane(jList));
        setTitle("5c – Country Capitals");
        setSize(250, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}
