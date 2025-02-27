import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton zeroButton;
    JButton dotButton;
    JButton equalButton;

    JButton multiplyButton , divisionButton,plusButton,minusButton,clearButton;

    boolean isOperatorClicked=false;
    String oldValue,newValue;
    float oldValueF,result;
    float operatorVariable=0;

    public Calculator(){
        //Calculator Body
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(400,200);


        //Calculator Display
        displayLabel = new JLabel();
        displayLabel.setBounds(30,50,540,40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        //Calculator Buttons

        //First Row
        sevenButton =new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton =new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.setFont(new Font("Arial",Font.PLAIN,40));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton =new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.setFont(new Font("Arial",Font.PLAIN,40));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        //Second Row
        fourButton =new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.setFont(new Font("Arial",Font.PLAIN,40));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton =new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton =new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.setFont(new Font("Arial",Font.PLAIN,40));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        //Third Row
        oneButton =new JButton("1");
        oneButton.setBounds(30,330,80,80);
        oneButton.setFont(new Font("Arial",Font.PLAIN,40));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton =new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.setFont(new Font("Arial",Font.PLAIN,40));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton =new JButton("3");
        threeButton.setBounds(230,330,80,80);
        threeButton.setFont(new Font("Arial",Font.PLAIN,40));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        //Fourth Row
        dotButton =new JButton(".");
        dotButton.setBounds(30,430,80,80);
        dotButton.setFont(new Font("Arial",Font.PLAIN,40));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton =new JButton("0");
        zeroButton.setBounds(130,430,80,80);
        zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton =new JButton("=");
        equalButton.setBounds(230,430,80,80);
        equalButton.setFont(new Font("Arial",Font.PLAIN,40));
        equalButton.addActionListener(this);
        jf.add(equalButton);


        //Operators
        divisionButton =new JButton("÷");
        divisionButton.setBounds(330,130,80,80);
        divisionButton.setFont(new Font("Arial",Font.PLAIN,40));
        divisionButton.addActionListener(this);
        jf.add(divisionButton);

        multiplyButton =new JButton("x");
        multiplyButton.setBounds(330,230,80,80);
        multiplyButton.setFont(new Font("Arial",Font.PLAIN,40));
        multiplyButton.addActionListener(this);
        jf.add(multiplyButton);

        minusButton =new JButton("-");
        minusButton.setBounds(330,330,80,80);
        minusButton.setFont(new Font("Arial",Font.PLAIN,40));
        minusButton.addActionListener(this);
        jf.add(minusButton);

        plusButton =new JButton("+");
        plusButton.setBounds(330,430,80,80);
        plusButton.setFont(new Font("Arial",Font.PLAIN,40));
        plusButton.addActionListener(this);
        jf.add(plusButton);

        clearButton =new JButton("+");
        clearButton.setBounds(330,430,80,80);
        clearButton.setFont(new Font("Arial",Font.PLAIN,40));
        clearButton.addActionListener(this);
        jf.add(clearButton);



        //Making it appear
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==oneButton){
            if (isOperatorClicked==true){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }else if (actionEvent.getSource()==twoButton){
            if (isOperatorClicked==true){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }else if (actionEvent.getSource()==threeButton){
            if (isOperatorClicked==true){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        } else if (actionEvent.getSource()==fourButton) {
            if (isOperatorClicked==true){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"4");
            }
        } else if (actionEvent.getSource()==fiveButton) {
            if (isOperatorClicked==true){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"5");
            }
        } else if (actionEvent.getSource()==sixButton) {
            if (isOperatorClicked==true){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"6");
            }
        } else if (actionEvent.getSource()==sevenButton) {
            if (isOperatorClicked==true){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"7");
            }
        } else if (actionEvent.getSource()==eightButton) {
            if(isOperatorClicked==true){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
        } else if(actionEvent.getSource()==nineButton) {
            if (isOperatorClicked==true){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"9");
            }
        } else if(actionEvent.getSource()==zeroButton) {
            if (isOperatorClicked==true){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"0");
            }
        } else if (actionEvent.getSource()==dotButton) {
            if (isOperatorClicked==true){
                displayLabel.setText("0.");
                isOperatorClicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+".");
            }
        } else if (actionEvent.getSource()==plusButton) {
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            oldValueF=Float.parseFloat(oldValue);
            float result = addition(oldValueF);
            displayLabel.setText(result+"");
        } else if (actionEvent.getSource()==minusButton) {
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            oldValueF=Float.parseFloat(oldValue);
            float result = subtraction(oldValueF);
            displayLabel.setText(result+"");
        } else if (actionEvent.getSource()==divisionButton) {
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            oldValueF=Float.parseFloat(oldValue);
            result = division(oldValueF);
            displayLabel.setText(result+"");
        } else if (actionEvent.getSource()==multiplyButton) {
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            oldValueF=Float.parseFloat(oldValue);
            result = multiplication(oldValueF);
            displayLabel.setText(result+"");
        } else if (actionEvent.getSource()==equalButton) {
            displayLabel.setText(result+"");
        } else if (actionEvent.getSource()==clearButton) {
            displayLabel.setText("");
        }
    }


    //addition
    float addition(float number){
        if (operatorVariable==0){
            operatorVariable=oldValueF;
            return operatorVariable;
        }else {
            operatorVariable=operatorVariable+oldValueF;
            return operatorVariable;
        }

    }

    //subtraction
    float subtraction(float number){
        if (operatorVariable==0){
            operatorVariable=oldValueF;
            return operatorVariable;
        }else {
            operatorVariable=operatorVariable-oldValueF;
            return operatorVariable;
        }

    }

    //multiplication
    float multiplication(float number){
        if (operatorVariable==0){
            operatorVariable=oldValueF;
            return operatorVariable;
        }else {
            operatorVariable=operatorVariable*oldValueF;
            return operatorVariable;
        }

    }

    //division
    float division(float number){
        if (operatorVariable==0){
            operatorVariable=oldValueF;
            return operatorVariable;
        }else {
            operatorVariable=operatorVariable/oldValueF;
            return operatorVariable;
        }

    }
}
