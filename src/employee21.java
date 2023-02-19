import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;

public class employee21 implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel, panel1, panel2;
    JButton enter = new JButton("Enter");
    GridBagConstraints gbc = new GridBagConstraints();
    JTextField field, field1;
    JLabel name, doB, employeeNum,pay;
    JWindow receipt;
    String path = "C:\\Users\\Admin\\Downloads\\motorPh.xlsx";
    FileInputStream read = new FileInputStream(path);
    XSSFWorkbook wb = new XSSFWorkbook(read);
    XSSFSheet sheet =wb.getSheet("Employee Details");
    Cell numb = sheet.getRow(21).getCell(0);
    Cell dob = sheet.getRow(21).getCell(3);
    Cell fName = sheet.getRow(21).getCell(2);
    Cell lName = sheet.getRow(21).getCell(1);
    Cell try1 = sheet.getRow(21).getCell(13);
    double n2 = Double.parseDouble(String.valueOf(try1));
    double n2A = (n2/21)/8;
    int hours, minutes;
    employee21() throws IOException {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 170);
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
        field = new JTextField("Enter Hours");
        field.setBackground(Color.white);
        field.setForeground(Color.black);
        field.setCaretColor(Color.black);
        frame.add(field,gbc);

        gbc.gridy = 4;
        gbc.gridx = 1;
        field1 = new JTextField("Enter Minutes");
        field1.setBackground(Color.white);
        field1.setForeground(Color.black);
        field1.setCaretColor(Color.black);
        frame.add(field1,gbc);

        gbc.gridy = 4;
        gbc.gridx = 2;
        pay = new JLabel(("Hourly Rate: ₱" + n2A));
        pay.setForeground(Color.black);
        frame.add(pay,gbc);

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

        employeeNum = new JLabel("Employee #: " + numb + " |");
        panel1.add(employeeNum,gbc);

        doB = new JLabel("DoB: " + dob);
        panel.add(doB,gbc);

        name = new JLabel("Name: "+fName +" " + lName +" |");
        panel2.add(name);

        frame.getContentPane();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ((field.getText().equals("Enter Hours")) && (field1.getText().equals("Enter Minutes"))) {
            field.setText("Enter Hours");
            field1.setText("Enter Minutes");
        } else if ((field.getText().equals("")) && (field1.getText().equals(""))){
            field.setText("Enter Hours");
            field1.setText("Enter Minutes");
        } else if ((field.getText().equals("")) && (field1.getText().equals("Enter Minutes"))){
            field.setText("Enter Hours");
            field1.setText("Enter Minutes");
        } else if ((field.getText().equals("Enter Hours")) && (field1.getText().equals(""))){
            field.setText("Enter Hours");
            field1.setText("Enter Minutes");
        } else {
            try{
                hours = Integer.parseInt(field.getText());
            } catch (NumberFormatException ex){
                field.setText("Enter Hours");
            }
            try{
                minutes = Integer.parseInt(field1.getText());
            } catch (NumberFormatException ex){
                field1.setText("Enter Minutes");
            }
            double sss = 135;
            double totalTime = (hours * 60) + minutes;
            double totalTimeHours = totalTime / 60;
            double totalTimeWeek = totalTimeHours * 5;
            double grossWage = n2A * totalTimeWeek * 4;
            int pagIbig = 100;
            double philHealth, philHealth1, philHealth2;
            double taxableIncome, taxableIncome1, taxableIncome2;
            double add;
            double incomeTax, incomeTax1, incomeTax2, incomeTax3;

            philHealth = 300;
            philHealth1 = (grossWage * 0.03) / (2);
            philHealth2 = 1800;

            if ((grossWage >= 3250.00) && (grossWage <= 3750.00)) {
                sss = 157.50;
            } else if ((grossWage >= 3750.01) && (grossWage <= 4250.00)) {
                sss = 180.00;
            } else if ((grossWage >= 4250.01) && (grossWage <= 4750.00)) {
                sss = 202.50;
            } else if ((grossWage >= 4750.01) && (grossWage <= 5250.00)) {
                sss = 225.00;
            } else if ((grossWage >= 5250.01) && (grossWage <= 5750.00)) {
                sss = 247.50;
            } else if ((grossWage >= 5750.01) && (grossWage <= 6250.00)) {
                sss = 270.00;
            } else if ((grossWage >= 6250.01) && (grossWage <= 6750.00)) {
                sss = 292.50;
            } else if ((grossWage >= 6750.01) && (grossWage <= 7250.00)) {
                sss = 315.00;
            } else if ((grossWage >= 7250.01) && (grossWage <= 7750.00)) {
                sss = 337.50;
            } else if ((grossWage >= 7750.01) && (grossWage <= 8250.00)) {
                sss = 360.00;
            } else if ((grossWage >= 8250.01) && (grossWage <= 8750.00)) {
                sss = 382.50;
            } else if ((grossWage >= 8750.01) && (grossWage <= 9250.00)) {
                sss = 405.00;
            } else if ((grossWage >= 9250.01) && (grossWage <= 9750.00)) {
                sss = 427.50;
            } else if ((grossWage >= 9750.01) && (grossWage <= 10250.00)) {
                sss = 450.00;
            } else if ((grossWage >= 10250.01) && (grossWage <= 10750.00)) {
                sss = 472.50;
            } else if ((grossWage >= 10750.01) && (grossWage <= 11250.00)) {
                sss = 495.00;
            } else if ((grossWage >= 11250.01) && (grossWage <= 11750.00)) {
                sss = 517.50;
            } else if ((grossWage >= 11750.01) && (grossWage <= 12250.00)) {
                sss = 540.00;
            } else if ((grossWage >= 12250.01) && (grossWage <= 12750.00)) {
                sss = 562.50;
            } else if ((grossWage >= 12750.01) && (grossWage <= 13250.00)) {
                sss = 585.00;
            } else if ((grossWage >= 13250.01) && (grossWage <= 13750.00)) {
                sss = 607.50;
            } else if ((grossWage >= 13750.01) && (grossWage <= 14250.00)) {
                sss = 630.00;
            } else if ((grossWage >= 14250.01) && (grossWage <= 14750.00)) {
                sss = 652.50;
            } else if ((grossWage >= 14750.01) && (grossWage <= 15250.00)) {
                sss = 675.00;
            } else if ((grossWage >= 15250.01) && (grossWage <= 15750.00)) {
                sss = 697.50;
            } else if ((grossWage >= 15750.01) && (grossWage <= 16250.00)) {
                sss = 720.00;
            } else if ((grossWage >= 16250.01) && (grossWage <= 16750.00)) {
                sss = 742.50;
            } else if ((grossWage >= 16750.01) && (grossWage <= 17250.00)) {
                sss = 765.00;
            } else if ((grossWage >= 17250.01) && (grossWage <= 17750.00)) {
                sss = 787.50;
            } else if ((grossWage >= 17750.01) && (grossWage <= 18250.00)) {
                sss = 810.00;
            } else if ((grossWage >= 18250.01) && (grossWage <= 18750.00)) {
                sss = 832.50;
            } else if ((grossWage >= 18750.01) && (grossWage <= 19250.00)) {
                sss = 855.00;
            } else if ((grossWage >= 19250.01) && (grossWage <= 19750.00)) {
                sss = 877.50;
            } else if ((grossWage >= 19750.01) && (grossWage <= 20250.00)) {
                sss = 900.00;
            } else if ((grossWage >= 20250.01) && (grossWage <= 20750.00)) {
                sss = 922.50;
            } else if ((grossWage >= 20750.01) && (grossWage <= 21250.00)) {
                sss = 945.00;
            } else if ((grossWage >= 21250.01) && (grossWage <= 21750.00)) {
                sss = 967.50;
            } else if ((grossWage >= 21750.01) && (grossWage <= 22250.00)) {
                sss = 990.00;
            } else if ((grossWage >= 22250.01) && (grossWage <= 22750.00)) {
                sss = 1012.50;
            } else if ((grossWage >= 22750.01) && (grossWage <= 23250.00)) {
                sss = 1035.00;
            } else if ((grossWage >= 23250.01) && (grossWage <= 23750.00)) {
                sss = 1057.50;
            } else if ((grossWage >= 23750.01) && (grossWage <= 24250.00)) {
                sss = 1080.00;
            } else if ((grossWage >= 24250.01) && (grossWage <= 24750.00)) {
                sss = 1102.50;
            } else if (grossWage >= 24750.01) {
                sss = 1125.00;
            }

            if (grossWage <= 10000) {
                taxableIncome = grossWage - philHealth - sss - pagIbig;
                add = philHealth + sss + pagIbig;
                JLabel gW = new JLabel();
                JLabel totalCont = new JLabel();
                JLabel taxIncome = new JLabel();

                receipt = new JWindow();
                receipt.setSize(300, 200);
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
                panel.add(R, gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                JLabel border = new JLabel();
                border.setText("***************************");
                panel.add(border, gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gW.setText(String.format("Gross Wage: %.2f", grossWage));
                panel.add(gW, gbc);

                gbc.gridx = 0;
                gbc.gridy = 3;
                totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                panel.add(totalCont, gbc);

                gbc.gridx = 0;
                gbc.gridy = 4;
                JLabel line = new JLabel();
                line.setText("--------------------------------");
                panel.add(line, gbc);

                gbc.gridx = 0;
                gbc.gridy = 5;
                taxIncome.setText(String.format("Net Wage | No Withholding Tax: %.2f%n", taxableIncome));
                panel.add(taxIncome, gbc);

                gbc.gridx = 0;
                gbc.gridy = 6;
                JLabel border1 = new JLabel();
                border1.setText("***************************");
                panel.add(border1, gbc);

                receipt.add(panel);
                receipt.getContentPane();
                receipt.setVisible(true);
            } else if ((grossWage >= 10000.01) && (grossWage <= 59999.99)) {
                taxableIncome1 = grossWage - philHealth1 - sss - pagIbig;
                add = philHealth1 + sss + pagIbig;
                JLabel gW = new JLabel();
                JLabel totalCont = new JLabel();
                JLabel taxIncome = new JLabel();
                JLabel withTax = new JLabel();
                JLabel netWage = new JLabel();
                incomeTax = (taxableIncome1 - 20833) * 0.20;
                incomeTax1 = (taxableIncome1 - 33333) * 0.25 + (2500);
                if ((taxableIncome1 >= 20833.00) && (taxableIncome1 <= 33333)) {
                    receipt = new JWindow();
                    receipt.setSize(190, 200);
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
                    panel.add(R, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    JLabel border = new JLabel();
                    border.setText("***************************");
                    panel.add(border, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 2;
                    gW.setText(String.format("Gross Wage: %.2f", grossWage));
                    panel.add(gW, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 3;
                    totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                    panel.add(totalCont, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 4;
                    JLabel line = new JLabel();
                    line.setText("--------------------------------");
                    panel.add(line, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 5;
                    taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome1));
                    panel.add(taxIncome, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 6;
                    withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax));
                    panel.add(withTax, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 7;
                    JLabel line1 = new JLabel();
                    line1.setText("--------------------------------");
                    panel.add(line1, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 8;
                    netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome1 - incomeTax));
                    panel.add(netWage, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 9;
                    JLabel border1 = new JLabel();
                    border1.setText("***************************");
                    panel.add(border1, gbc);

                    receipt.add(panel);
                    receipt.getContentPane();
                    receipt.setVisible(true);
                } else if ((taxableIncome1 >= 33333.00) && (taxableIncome1 <= 59999.99)) {
                    receipt = new JWindow();
                    receipt.setSize(190, 200);
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
                    panel.add(R, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    JLabel border = new JLabel();
                    border.setText("***************************");
                    panel.add(border, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 2;
                    gW.setText(String.format("Gross Wage: %.2f", grossWage));
                    panel.add(gW, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 3;
                    totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                    panel.add(totalCont, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 4;
                    JLabel line = new JLabel();
                    line.setText("--------------------------------");
                    panel.add(line, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 5;
                    taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome1));
                    panel.add(taxIncome, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 6;
                    withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax1));
                    panel.add(withTax, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 7;
                    JLabel line1 = new JLabel();
                    line1.setText("--------------------------------");
                    panel.add(line1, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 8;
                    netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome1 - incomeTax1));
                    panel.add(netWage, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 9;
                    JLabel border1 = new JLabel();
                    border1.setText("***************************");
                    panel.add(border1, gbc);

                    receipt.add(panel);
                    receipt.getContentPane();
                    receipt.setVisible(true);

                } else if (taxableIncome1 <= 20832.99) {
                    receipt = new JWindow();
                    receipt.setSize(300, 200);
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
                    panel.add(R, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    JLabel border = new JLabel();
                    border.setText("***************************");
                    panel.add(border, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 2;
                    gW.setText(String.format("Gross Wage: %.2f", grossWage));
                    panel.add(gW, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 3;
                    totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                    panel.add(totalCont, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 4;
                    JLabel line = new JLabel();
                    line.setText("--------------------------------");
                    panel.add(line, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 5;
                    taxIncome.setText(String.format("Net Wage | No Withholding Tax: %.2f%n", taxableIncome1));
                    panel.add(taxIncome, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 6;
                    JLabel border1 = new JLabel();
                    border1.setText("***************************");
                    panel.add(border1, gbc);

                    receipt.add(panel);
                    receipt.getContentPane();
                    receipt.setVisible(true);
                }
            } else if (grossWage >= 60000.00) {
                taxableIncome2 = grossWage - philHealth2 - sss - pagIbig;
                add = philHealth2 + sss + pagIbig;
                JLabel gW = new JLabel();
                JLabel totalCont = new JLabel();
                JLabel taxIncome = new JLabel();
                JLabel withTax = new JLabel();
                JLabel netWage = new JLabel();
                incomeTax = (taxableIncome2 - 33333.00) * 0.25 + (2500);
                incomeTax1 = (taxableIncome2 - 66667.00) * 0.30 + (10833);
                incomeTax2 = (taxableIncome2 - 166667.00) * 0.32 + (40833.33);
                incomeTax3 = (taxableIncome2 - 666667.00) * 0.35 + (200833.33);

                if (taxableIncome2 <= 66667.00) {

                    receipt = new JWindow();
                    receipt.setSize(190, 200);
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
                    panel.add(R, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    JLabel border = new JLabel();
                    border.setText("***************************");
                    panel.add(border, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 2;
                    gW.setText(String.format("Gross Wage: %.2f", grossWage));
                    panel.add(gW, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 3;
                    totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                    panel.add(totalCont, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 4;
                    JLabel line = new JLabel();
                    line.setText("--------------------------------");
                    panel.add(line, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 5;
                    taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome2));
                    panel.add(taxIncome, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 6;
                    withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax));
                    panel.add(withTax, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 7;
                    JLabel line1 = new JLabel();
                    line1.setText("--------------------------------");
                    panel.add(line1, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 8;
                    netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome2 - incomeTax));
                    panel.add(netWage, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 9;
                    JLabel border1 = new JLabel();
                    border1.setText("***************************");
                    panel.add(border1, gbc);

                    receipt.add(panel);
                    receipt.getContentPane();
                    receipt.setVisible(true);
                } else if ((taxableIncome2 >= 66667.01) && (taxableIncome2 <= 166667.00)) {

                    receipt = new JWindow();
                    receipt.setSize(190, 200);
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
                    panel.add(R, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    JLabel border = new JLabel();
                    border.setText("***************************");
                    panel.add(border, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 2;
                    gW.setText(String.format("Gross Wage: %.2f", grossWage));
                    panel.add(gW, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 3;
                    totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                    panel.add(totalCont, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 4;
                    JLabel line = new JLabel();
                    line.setText("--------------------------------");
                    panel.add(line, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 5;
                    taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome2));
                    panel.add(taxIncome, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 6;
                    withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax1));
                    panel.add(withTax, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 7;
                    JLabel line1 = new JLabel();
                    line1.setText("--------------------------------");
                    panel.add(line1, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 8;
                    netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome2 - incomeTax1));
                    panel.add(netWage, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 9;
                    JLabel border1 = new JLabel();
                    border1.setText("***************************");
                    panel.add(border1, gbc);

                    receipt.add(panel);
                    receipt.getContentPane();
                    receipt.setVisible(true);
                } else if ((taxableIncome2 >= 166667.01) && (taxableIncome2 <= 666667.00)) {

                    receipt = new JWindow();
                    receipt.setSize(190, 200);
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
                    panel.add(R, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    JLabel border = new JLabel();
                    border.setText("***************************");
                    panel.add(border, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 2;
                    gW.setText(String.format("Gross Wage: %.2f", grossWage));
                    panel.add(gW, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 3;
                    totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                    panel.add(totalCont, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 4;
                    JLabel line = new JLabel();
                    line.setText("--------------------------------");
                    panel.add(line, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 5;
                    taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome2));
                    panel.add(taxIncome, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 6;
                    withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax2));
                    panel.add(withTax, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 7;
                    JLabel line1 = new JLabel();
                    line1.setText("--------------------------------");
                    panel.add(line1, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 8;
                    netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome2 - incomeTax2));
                    panel.add(netWage, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 9;
                    JLabel border1 = new JLabel();
                    border1.setText("***************************");
                    panel.add(border1, gbc);

                    receipt.add(panel);
                    receipt.getContentPane();
                    receipt.setVisible(true);
                } else if (taxableIncome2 >= 666667.01) {

                    receipt = new JWindow();
                    receipt.setSize(190, 200);
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
                    panel.add(R, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    JLabel border = new JLabel();
                    border.setText("***************************");
                    panel.add(border, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 2;
                    gW.setText(String.format("Gross Wage: %.2f", grossWage));
                    panel.add(gW, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 3;
                    totalCont.setText(String.format("-Total Contribution: %.2f%n", add));
                    panel.add(totalCont, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 4;
                    JLabel line = new JLabel();
                    line.setText("--------------------------------");
                    panel.add(line, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 5;
                    taxIncome.setText(String.format("Taxable Income: %.2f%n", taxableIncome2));
                    panel.add(taxIncome, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 6;
                    withTax.setText(String.format("-Withholding Tax: %.2f%n", incomeTax3));
                    panel.add(withTax, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 7;
                    JLabel line1 = new JLabel();
                    line1.setText("--------------------------------");
                    panel.add(line1, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 8;
                    netWage.setText(String.format("Net Wage: %.2f%n", taxableIncome2 - incomeTax3));
                    panel.add(netWage, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 9;
                    JLabel border1 = new JLabel();
                    border1.setText("***************************");
                    panel.add(border1, gbc);

                    receipt.add(panel);
                    receipt.getContentPane();
                    receipt.setVisible(true);
                }
            }
        }

    }
}

