import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class employee25 implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel, panel1, panel2;
    JButton enter = new JButton("Enter");
    GridBagConstraints gbc = new GridBagConstraints();
    JComboBox combo, combo1;
    JLabel label = new JLabel("Enter Hours: ");
    JLabel label1 = new JLabel("Enter Minutes: ");
    JLabel name, doB, employeeNum;
    JTextField pay;
    Integer[] Minutes = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,
            25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,
            50,51,52,53,54,55,56,57,58,59,60};
    Integer[] hours = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
    JWindow receipt;

    employee25() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 170);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridy = 5;
        gbc.gridx = 1;
        enter.setSize(50,25);
        enter.addActionListener(this);
        frame.add(enter,gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        combo = new JComboBox<>(hours);
        combo.setSize(50,50);
        frame.add(combo,gbc);

        gbc.gridy = 4;
        gbc.gridx = 1;
        combo1 = new JComboBox<>(Minutes);
        combo1.setSize(50,50);
        frame.add(combo1,gbc);

        gbc.gridy = 4;
        gbc.gridx = 2;
        pay = new JTextField("Enter Hourly Salary");
        pay.setBackground(Color.white);
        pay.setForeground(Color.black);
        pay.setCaretColor(Color.black);
        combo1.setSize(50,50);
        frame.add(pay,gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        frame.add(label,gbc);

        gbc.gridy = 3;
        gbc.gridx = 1;
        frame.add(label1,gbc);

        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setOpaque(true);
        gbc.gridy = 1;
        gbc.gridx = 2;
        frame.add(panel,gbc);

        panel1 = new JPanel();
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setOpaque(true);
        gbc.gridy = 1;
        gbc.gridx = 0;
        frame.add(panel1,gbc);

        panel2 = new JPanel();
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setOpaque(true);
        gbc.gridy = 1;
        gbc.gridx = 1;
        frame.add(panel2,gbc);

        employeeNum = new JLabel("Employee#: 10025 |");
        panel1.add(employeeNum,gbc);

        doB = new JLabel("DoB: 1/27/1939");
        panel.add(doB,gbc);

        name = new JLabel("Name: Delia Aguilar |");
        panel2.add(name);

        frame.getContentPane();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int hours = (int) combo.getSelectedItem();
        int minutes = (int) combo1.getSelectedItem();
        double sss = 135;
        double salary = Double.parseDouble(pay.getText());
        double totalTime = (hours*60)+minutes;
        double totalTimeHours = totalTime/60;
        double totalTimeWeek = totalTimeHours*5;
        double grossWage = (salary*totalTimeWeek)*4;
        int pagIbig = 100;
        double philHealth, philHealth1, philHealth2;
        double taxableIncome, taxableIncome1, taxableIncome2;
        double add;
        double incomeTax, incomeTax1, incomeTax2, incomeTax3;

        philHealth = 300;
        philHealth1 = (grossWage*0.03)/(2);
        philHealth2 = 1800;

        if ((grossWage >=3250.00) && (grossWage <=3750.00)){
            sss = 157.50;
        } else if ((grossWage >=3750.01) && (grossWage <=4250.00)){
            sss = 180.00;
        } else if ((grossWage >=4250.01) && (grossWage <=4750.00)){
            sss = 202.50;
        } else if ((grossWage >=4750.01) && (grossWage <=5250.00)){
            sss = 225.00;
        } else if ((grossWage >=5250.01) && (grossWage <=5750.00)){
            sss = 247.50;
        } else if ((grossWage >=5750.01) && (grossWage <=6250.00)){
            sss = 270.00;
        } else if ((grossWage >=6250.01) && (grossWage <=6750.00)){
            sss =292.50;
        } else if ((grossWage >=6750.01) && (grossWage <=7250.00)){
            sss = 315.00;
        } else if ((grossWage >=7250.01) && (grossWage <=7750.00)){
            sss = 337.50;
        } else if ((grossWage >=7750.01) && (grossWage <=8250.00)){
            sss = 360.00;
        } else if ((grossWage >=8250.01) && (grossWage <=8750.00)){
            sss = 382.50;
        } else if ((grossWage >=8750.01) && (grossWage <=9250.00)){
            sss = 405.00;
        } else if ((grossWage >=9250.01) && (grossWage <=9750.00)){
            sss = 427.50;
        } else if ((grossWage >=9750.01) && (grossWage <=10250.00)){
            sss = 450.00;
        } else if ((grossWage >=10250.01) && (grossWage <=10750.00)){
            sss = 472.50;
        } else if ((grossWage >=10750.01) && (grossWage <=11250.00)){
            sss = 495.00;
        } else if ((grossWage >=11250.01) && (grossWage <=11750.00)){
            sss = 517.50;
        } else if ((grossWage >=11750.01) && (grossWage <=12250.00)){
            sss = 540.00;
        }else if ((grossWage >=12250.01) && (grossWage <=12750.00)){
            sss = 562.50;
        }else if ((grossWage >=12750.01) && (grossWage <=13250.00)){
            sss = 585.00;
        }else if ((grossWage >=13250.01) && (grossWage <=13750.00)){
            sss = 607.50;
        }else if ((grossWage >=13750.01) && (grossWage <=14250.00)){
            sss = 630.00;
        }else if ((grossWage >=14250.01) && (grossWage <=14750.00)){
            sss = 652.50;
        }else if ((grossWage >=14750.01) && (grossWage <=15250.00)){
            sss = 675.00;
        }else if ((grossWage >=15250.01) && (grossWage <=15750.00)){
            sss = 697.50;
        }else if ((grossWage >=15750.01) && (grossWage <=16250.00)){
            sss = 720.00;
        }else if ((grossWage >=16250.01) && (grossWage <=16750.00)){
            sss = 742.50;
        }else if ((grossWage >=16750.01) && (grossWage <=17250.00)){
            sss = 765.00;
        }else if ((grossWage >=17250.01) && (grossWage <=17750.00)){
            sss = 787.50;
        }else if ((grossWage >=17750.01) && (grossWage <=18250.00)){
            sss = 810.00;
        }else if ((grossWage >=18250.01) && (grossWage <=18750.00)){
            sss = 832.50;
        }else if ((grossWage >=18750.01) && (grossWage <=19250.00)){
            sss = 855.00;
        }else if ((grossWage >=19250.01) && (grossWage <=19750.00)){
            sss = 877.50;
        }else if ((grossWage >=19750.01) && (grossWage <=20250.00)){
            sss = 900.00;
        }else if ((grossWage >=20250.01) && (grossWage <=20750.00)){
            sss = 922.50;
        }else if ((grossWage >=20750.01) && (grossWage <=21250.00)){
            sss = 945.00;
        }else if ((grossWage >=21250.01) && (grossWage <=21750.00)){
            sss = 967.50;
        }else if ((grossWage >=21750.01) && (grossWage <=22250.00)){
            sss = 990.00;
        }else if ((grossWage >=22250.01) && (grossWage <=22750.00)){
            sss = 1012.50;
        }else if ((grossWage >=22750.01) && (grossWage <=23250.00)){
            sss = 1035.00;
        }else if ((grossWage >=23250.01) && (grossWage <=23750.00)){
            sss = 1057.50;
        }else if ((grossWage >=23750.01) && (grossWage <=24250.00)){
            sss = 1080.00;
        }else if ((grossWage >=24250.01) && (grossWage <=24750.00)){
            sss = 1102.50;
        }else if (grossWage >= 24750.01){
            sss = 1125.00;
        }

        if (grossWage <= 10000){
            taxableIncome = grossWage-philHealth-sss-pagIbig;
            add = philHealth+sss+pagIbig;
            JLabel gW = new JLabel();
            JLabel totalCont = new JLabel();
            JLabel taxIncome = new JLabel();

            receipt = new JWindow();
            receipt.setSize(300,200);
            receipt.setLocationRelativeTo(null);
            receipt.setLayout(new GridBagLayout());

            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout());
            panel.setSize(200, 230);
            panel.setBackground(Color.white);

            gbc.gridx = 0;
            gbc.gridy = 0;
            JLabel R = new JLabel();
            R.setText("RECEIPT");
            panel.add(R,gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            JLabel border = new JLabel();
            border.setText("***************************");
            panel.add(border,gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gW.setText(String.format("Gross Wage: %.2f", grossWage));
            panel.add(gW,gbc);

            gbc.gridx = 0;
            gbc.gridy = 3;
            totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
            panel.add(totalCont,gbc);

            gbc.gridx = 0;
            gbc.gridy = 4;
            JLabel line = new JLabel();
            line.setText("--------------------------------");
            panel.add(line,gbc);

            gbc.gridx = 0;
            gbc.gridy = 5;
            taxIncome.setText(String.format("Net Wage | No Withholding Tax: %.2f%n", taxableIncome));
            panel.add(taxIncome,gbc);

            gbc.gridx = 0;
            gbc.gridy = 6;
            JLabel border1 = new JLabel();
            border1.setText("***************************");
            panel.add(border1,gbc);

            receipt.add(panel);
            receipt.getContentPane();
            receipt.setVisible(true);
        } else if ((grossWage >= 10000.01) && (grossWage <= 59999.99)){
            taxableIncome1 = grossWage-philHealth1-sss-pagIbig;
            add = philHealth1+sss+pagIbig;
            JLabel gW = new JLabel();
            JLabel totalCont = new JLabel();
            JLabel taxIncome = new JLabel();
            JLabel withTax = new JLabel();
            JLabel netWage = new JLabel();
            incomeTax = (taxableIncome1-20833)*0.20;
            incomeTax1 = (taxableIncome1-33333)*0.25+(2500);
            if ((taxableIncome1 >= 20833.00) && (taxableIncome1 <= 33333)){
                receipt = new JWindow();
                receipt.setSize(190,200);
                receipt.setLocationRelativeTo(null);
                receipt.setLayout(new GridBagLayout());

                JPanel panel = new JPanel();
                panel.setLayout(new GridBagLayout());
                panel.setSize(200, 230);
                panel.setBackground(Color.white);

                gbc.gridx = 0;
                gbc.gridy = 0;
                JLabel R = new JLabel();
                R.setText("RECEIPT");
                panel.add(R,gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                JLabel border = new JLabel();
                border.setText("***************************");
                panel.add(border,gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gW.setText(String.format("Gross Wage: %.2f", grossWage));
                panel.add(gW,gbc);

                gbc.gridx = 0;
                gbc.gridy = 3;
                totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                panel.add(totalCont,gbc);

                gbc.gridx = 0;
                gbc.gridy = 4;
                JLabel line = new JLabel();
                line.setText("--------------------------------");
                panel.add(line,gbc);

                gbc.gridx = 0;
                gbc.gridy = 5;
                taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome1));
                panel.add(taxIncome,gbc);

                gbc.gridx = 0;
                gbc.gridy = 6;
                withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax));
                panel.add(withTax,gbc);

                gbc.gridx = 0;
                gbc.gridy = 7;
                JLabel line1 = new JLabel();
                line1.setText("--------------------------------");
                panel.add(line1,gbc);

                gbc.gridx = 0;
                gbc.gridy = 8;
                netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome1 - incomeTax));
                panel.add(netWage,gbc);

                gbc.gridx = 0;
                gbc.gridy = 9;
                JLabel border1 = new JLabel();
                border1.setText("***************************");
                panel.add(border1,gbc);

                receipt.add(panel);
                receipt.getContentPane();
                receipt.setVisible(true);
            } else if ((taxableIncome1 >= 33333.00)&&(taxableIncome1 <= 59999.99)){
                receipt = new JWindow();
                receipt.setSize(190,200);
                receipt.setLocationRelativeTo(null);
                receipt.setLayout(new GridBagLayout());

                JPanel panel = new JPanel();
                panel.setLayout(new GridBagLayout());
                panel.setSize(200, 230);
                panel.setBackground(Color.white);

                gbc.gridx = 0;
                gbc.gridy = 0;
                JLabel R = new JLabel();
                R.setText("RECEIPT");
                panel.add(R,gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                JLabel border = new JLabel();
                border.setText("***************************");
                panel.add(border,gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gW.setText(String.format("Gross Wage: %.2f", grossWage));
                panel.add(gW,gbc);

                gbc.gridx = 0;
                gbc.gridy = 3;
                totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                panel.add(totalCont,gbc);

                gbc.gridx = 0;
                gbc.gridy = 4;
                JLabel line = new JLabel();
                line.setText("--------------------------------");
                panel.add(line,gbc);

                gbc.gridx = 0;
                gbc.gridy = 5;
                taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome1));
                panel.add(taxIncome,gbc);

                gbc.gridx = 0;
                gbc.gridy = 6;
                withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax1));
                panel.add(withTax,gbc);

                gbc.gridx = 0;
                gbc.gridy = 7;
                JLabel line1 = new JLabel();
                line1.setText("--------------------------------");
                panel.add(line1,gbc);

                gbc.gridx = 0;
                gbc.gridy = 8;
                netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome1 - incomeTax1));
                panel.add(netWage,gbc);

                gbc.gridx = 0;
                gbc.gridy = 9;
                JLabel border1 = new JLabel();
                border1.setText("***************************");
                panel.add(border1,gbc);

                receipt.add(panel);
                receipt.getContentPane();
                receipt.setVisible(true);

            } else if (taxableIncome1 <= 20832.99){
                receipt = new JWindow();
                receipt.setSize(300,200);
                receipt.setLocationRelativeTo(null);
                receipt.setLayout(new GridBagLayout());

                JPanel panel = new JPanel();
                panel.setLayout(new GridBagLayout());
                panel.setSize(200, 230);
                panel.setBackground(Color.white);

                gbc.gridx = 0;
                gbc.gridy = 0;
                JLabel R = new JLabel();
                R.setText("RECEIPT");
                panel.add(R,gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                JLabel border = new JLabel();
                border.setText("***************************");
                panel.add(border,gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gW.setText(String.format("Gross Wage: %.2f", grossWage));
                panel.add(gW,gbc);

                gbc.gridx = 0;
                gbc.gridy = 3;
                totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                panel.add(totalCont,gbc);

                gbc.gridx = 0;
                gbc.gridy = 4;
                JLabel line = new JLabel();
                line.setText("--------------------------------");
                panel.add(line,gbc);

                gbc.gridx = 0;
                gbc.gridy = 5;
                taxIncome.setText(String.format("Net Wage | No Withholding Tax: %.2f%n", taxableIncome1));
                panel.add(taxIncome,gbc);

                gbc.gridx = 0;
                gbc.gridy = 6;
                JLabel border1 = new JLabel();
                border1.setText("***************************");
                panel.add(border1,gbc);

                receipt.add(panel);
                receipt.getContentPane();
                receipt.setVisible(true);
            }
        } else if (grossWage >= 60000.00){
            taxableIncome2 = grossWage-philHealth2-sss-pagIbig;
            add = philHealth2+sss+pagIbig;
            JLabel gW = new JLabel();
            JLabel totalCont = new JLabel();
            JLabel taxIncome = new JLabel();
            JLabel withTax = new JLabel();
            JLabel netWage = new JLabel();
            incomeTax =(taxableIncome2-33333.00)*0.25+(2500);
            incomeTax1 =(taxableIncome2-66667.00)*0.30+(10833);
            incomeTax2 =(taxableIncome2-166667.00)*0.32+(40833.33);
            incomeTax3 =(taxableIncome2-666667.00)*0.35+(200833.33);

            if ((taxableIncome2 <=66667.00)){
                receipt = new JWindow();
                receipt.setSize(190,200);
                receipt.setLocationRelativeTo(null);
                receipt.setLayout(new GridBagLayout());

                JPanel panel = new JPanel();
                panel.setLayout(new GridBagLayout());
                panel.setSize(200, 230);
                panel.setBackground(Color.white);

                gbc.gridx = 0;
                gbc.gridy = 0;
                JLabel R = new JLabel();
                R.setText("RECEIPT");
                panel.add(R,gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                JLabel border = new JLabel();
                border.setText("***************************");
                panel.add(border,gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gW.setText(String.format("Gross Wage: %.2f", grossWage));
                panel.add(gW,gbc);

                gbc.gridx = 0;
                gbc.gridy = 3;
                totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                panel.add(totalCont,gbc);

                gbc.gridx = 0;
                gbc.gridy = 4;
                JLabel line = new JLabel();
                line.setText("--------------------------------");
                panel.add(line,gbc);

                gbc.gridx = 0;
                gbc.gridy = 5;
                taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome2));
                panel.add(taxIncome,gbc);

                gbc.gridx = 0;
                gbc.gridy = 6;
                withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax));
                panel.add(withTax,gbc);

                gbc.gridx = 0;
                gbc.gridy = 7;
                JLabel line1 = new JLabel();
                line1.setText("--------------------------------");
                panel.add(line1,gbc);

                gbc.gridx = 0;
                gbc.gridy = 8;
                netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome2 - incomeTax));
                panel.add(netWage,gbc);

                gbc.gridx = 0;
                gbc.gridy = 9;
                JLabel border1 = new JLabel();
                border1.setText("***************************");
                panel.add(border1,gbc);

                receipt.add(panel);
                receipt.getContentPane();
                receipt.setVisible(true);
            } else if ((taxableIncome2 >= 66667.01) && (taxableIncome2 <=166667.00)){

                receipt = new JWindow();
                receipt.setSize(190,200);
                receipt.setLocationRelativeTo(null);
                receipt.setLayout(new GridBagLayout());

                JPanel panel = new JPanel();
                panel.setLayout(new GridBagLayout());
                panel.setSize(200, 230);
                panel.setBackground(Color.white);

                gbc.gridx = 0;
                gbc.gridy = 0;
                JLabel R = new JLabel();
                R.setText("RECEIPT");
                panel.add(R,gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                JLabel border = new JLabel();
                border.setText("***************************");
                panel.add(border,gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gW.setText(String.format("Gross Wage: %.2f", grossWage));
                panel.add(gW,gbc);

                gbc.gridx = 0;
                gbc.gridy = 3;
                totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                panel.add(totalCont,gbc);

                gbc.gridx = 0;
                gbc.gridy = 4;
                JLabel line = new JLabel();
                line.setText("--------------------------------");
                panel.add(line,gbc);

                gbc.gridx = 0;
                gbc.gridy = 5;
                taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome2));
                panel.add(taxIncome,gbc);

                gbc.gridx = 0;
                gbc.gridy = 6;
                withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax1));
                panel.add(withTax,gbc);

                gbc.gridx = 0;
                gbc.gridy = 7;
                JLabel line1 = new JLabel();
                line1.setText("--------------------------------");
                panel.add(line1,gbc);

                gbc.gridx = 0;
                gbc.gridy = 8;
                netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome2 - incomeTax1));
                panel.add(netWage,gbc);

                gbc.gridx = 0;
                gbc.gridy = 9;
                JLabel border1 = new JLabel();
                border1.setText("***************************");
                panel.add(border1,gbc);

                receipt.add(panel);
                receipt.getContentPane();
                receipt.setVisible(true);
            } else if ((taxableIncome2 >= 166667.01) && (taxableIncome2 <=666667.00)){

                receipt = new JWindow();
                receipt.setSize(190,200);
                receipt.setLocationRelativeTo(null);
                receipt.setLayout(new GridBagLayout());

                JPanel panel = new JPanel();
                panel.setLayout(new GridBagLayout());
                panel.setSize(200, 230);
                panel.setBackground(Color.white);

                gbc.gridx = 0;
                gbc.gridy = 0;
                JLabel R = new JLabel();
                R.setText("RECEIPT");
                panel.add(R,gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                JLabel border = new JLabel();
                border.setText("***************************");
                panel.add(border,gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gW.setText(String.format("Gross Wage: %.2f", grossWage));
                panel.add(gW,gbc);

                gbc.gridx = 0;
                gbc.gridy = 3;
                totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                panel.add(totalCont,gbc);

                gbc.gridx = 0;
                gbc.gridy = 4;
                JLabel line = new JLabel();
                line.setText("--------------------------------");
                panel.add(line,gbc);

                gbc.gridx = 0;
                gbc.gridy = 5;
                taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome2));
                panel.add(taxIncome,gbc);

                gbc.gridx = 0;
                gbc.gridy = 6;
                withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax2));
                panel.add(withTax,gbc);

                gbc.gridx = 0;
                gbc.gridy = 7;
                JLabel line1 = new JLabel();
                line1.setText("--------------------------------");
                panel.add(line1,gbc);

                gbc.gridx = 0;
                gbc.gridy = 8;
                netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome2 - incomeTax2));
                panel.add(netWage,gbc);

                gbc.gridx = 0;
                gbc.gridy = 9;
                JLabel border1 = new JLabel();
                border1.setText("***************************");
                panel.add(border1,gbc);

                receipt.add(panel);
                receipt.getContentPane();
                receipt.setVisible(true);
            } else if (taxableIncome2 >= 666667.01){

                receipt = new JWindow();
                receipt.setSize(190,200);
                receipt.setLocationRelativeTo(null);
                receipt.setLayout(new GridBagLayout());

                JPanel panel = new JPanel();
                panel.setLayout(new GridBagLayout());
                panel.setSize(200, 230);
                panel.setBackground(Color.white);

                gbc.gridx = 0;
                gbc.gridy = 0;
                JLabel R = new JLabel();
                R.setText("RECEIPT");
                panel.add(R,gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                JLabel border = new JLabel();
                border.setText("***************************");
                panel.add(border,gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gW.setText(String.format("Gross Wage: %.2f", grossWage));
                panel.add(gW,gbc);

                gbc.gridx = 0;
                gbc.gridy = 3;
                totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                panel.add(totalCont,gbc);

                gbc.gridx = 0;
                gbc.gridy = 4;
                JLabel line = new JLabel();
                line.setText("--------------------------------");
                panel.add(line,gbc);

                gbc.gridx = 0;
                gbc.gridy = 5;
                taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome2));
                panel.add(taxIncome,gbc);

                gbc.gridx = 0;
                gbc.gridy = 6;
                withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax3));
                panel.add(withTax,gbc);

                gbc.gridx = 0;
                gbc.gridy = 7;
                JLabel line1 = new JLabel();
                line1.setText("--------------------------------");
                panel.add(line1,gbc);

                gbc.gridx = 0;
                gbc.gridy = 8;
                netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome2 - incomeTax3));
                panel.add(netWage,gbc);

                gbc.gridx = 0;
                gbc.gridy = 9;
                JLabel border1 = new JLabel();
                border1.setText("***************************");
                panel.add(border1,gbc);

                receipt.add(panel);
                receipt.getContentPane();
                receipt.setVisible(true);
            }
        }
    }

}




