import javax.swing.*;

public class Calculator {
    public Calculator(){
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel displayLabel = new JLabel();
        
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
