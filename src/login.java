import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class login extends JFrame implements ActionListener {
    JButton b1 = new JButton("Login");
    GridBagConstraints gbc = new GridBagConstraints();
    JTextField number = new JTextField("Enter Employee #");
    login() throws IOException {
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
        number.setBackground(Color.white);
        number.setForeground(Color.black);
        add(number,gbc);

        this.getContentPane();
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choose = number.getText();


        switch (choose) {
            case "10001" -> {
                dispose();
                try {
                    new employee1();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10002" -> {
                dispose();
                try {
                    new employee2();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10003" -> {
                dispose();
                try {
                    new employee3();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10004" -> {
                dispose();
                try {
                    new employee4();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10005" -> {
                dispose();
                try {
                    new employee5();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10006" -> {
                dispose();
                try {
                    new employee6();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10007" -> {
                dispose();
                try {
                    new employee7();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10008" -> {
                dispose();
                try {
                    new employee8();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10009" -> {
                dispose();
                try {
                    new employee9();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10010" -> {
                dispose();
                try {
                    new employee10();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10011" -> {
                dispose();
                try {
                    new employee11();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10012" -> {
                dispose();
                try {
                    new employee12();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10013" -> {
                dispose();
                try {
                    new employee13();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10014" -> {
                dispose();
                try {
                    new employee14();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10015" -> {
                dispose();
                try {
                    new employee15();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10016" -> {
                dispose();
                try {
                    new employee16();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10017" -> {
                dispose();
                try {
                    new employee17();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10018" -> {
                dispose();
                try {
                    new employee18();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10019" -> {
                dispose();
                try {
                    new employee19();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10020" -> {
                dispose();
                try {
                    new employee20();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10021" -> {
                dispose();
                try {
                    new employee21();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10022" -> {
                dispose();
                try {
                    new employee22();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10023" -> {
                dispose();
                try {
                    new employee23();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10024" -> {
                dispose();
                try {
                    new employee24();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            case "10025" -> {
                dispose();
                try {
                    new employee25();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            default -> {
                number.setText("Enter Employee #");
            }
        }
    }
}

