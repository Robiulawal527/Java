package oopTheory.GUI;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * BasicGui
 */
public class BasicGui implements ActionListener {


    public BasicGui(){
        GUIapp();
    }


    public void GUIapp(){

    JFrame frame = new JFrame("Simple GUI");
    String inputText;
    JLabel outputLabel = new JLabel("output: " + inputText);
    JTextField inpuField = new JTextField(10);
    JButton performButton = new JButton("Perform");


    performButton.addActionListener((ActionListener) this);


    frame.setLayout(new FlowLayout());

    frame.add(performButton);
    frame.add(inpuField);
    frame.add(outputLabel);


    frame.setSize(600,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

   }


   public static void main(String[] args) {
    new BasicGui();
   }


@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}


    
}