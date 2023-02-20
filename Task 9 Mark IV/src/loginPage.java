import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPage extends JFrame implements ActionListener {

    JButton b1 = new JButton("Login");
    JComboBox comboBox;
    GridBagConstraints gbc = new GridBagConstraints();

    String[] employeeNum = {"10001", "10002", "10003","10004","10005","10006","10007","10008","10009","10010"
            ,"10011","10012","10013","10014","10015","10016","10017","10018","10019","10020","10021",
            "10022","10023","10024","10025",};

    loginPage() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setSize(180, 100);

        gbc.gridy = 4;
        gbc.gridx = 1;
        b1.setSize(100, 50);
        add(b1, gbc);
        b1.addActionListener(this);

        gbc.gridy = 2;
        gbc.gridx = 1;
        comboBox = new JComboBox<>(employeeNum);
        add(comboBox, gbc);

        this.getContentPane();
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choose = (String) comboBox.getSelectedItem();
        switch (choose) {
            case "10001" -> {
                dispose();
                new employeeOne();
            }
            case "10002" -> {
                dispose();
                new employee2();
            }
            case "10003" -> {
                dispose();
                new employee3();
            }
            case "10004" -> {
                dispose();
                new employee4();
            }
            case "10005" -> {
                dispose();
                new employee5();
            }
            case "10006" -> {
                dispose();
                new employee6();
            }
            case "10007" -> {
                dispose();
                new employee7();
            }
            case "10008" -> {
                dispose();
                new employee8();
            }
            case "10009" -> {
                dispose();
                new employee9();
            }
            case "10010" -> {
                dispose();
                new employee10();
            }
            case "10011" -> {
                dispose();
                new employee11();
            }
            case "10012" -> {
                dispose();
                new employee12();
            }
            case "10013" -> {
                dispose();
                new employee13();
            }
            case "10014" -> {
                dispose();
                new employee14();
            }
            case "10015" -> {
                dispose();
                new employee15();
            }
            case "10016" -> {
                dispose();
                new employee16();
            }
            case "10017" -> {
                dispose();
                new employee17();
            }
            case "10018" -> {
                dispose();
                new employee18();
            }
            case "10019" -> {
                dispose();
                new employee19();
            }
            case "10020" -> {
                dispose();
                new employee20();
            }
            case "10021" -> {
                dispose();
                new employee21();
            }
            case "10022" -> {
                dispose();
                new employee22();
            }
            case "10023" -> {
                dispose();
                new employee23();
            }
            case "10024" -> {
                dispose();
                new employee24();
            }
            case "10025" -> {
                dispose();
                new employee25();
            }
        }
        }
    }
