package com.counter;
import javax.swing.*;
import java.awt.event.*;
public class WordandLineCounter extends JFrame implements ActionListener{
    JButton button;
    JTextArea area;
    JLabel wordlabel, linelabel;
    int wordcount, linecount;
    WordandLineCounter(){
        this.setTitle("Word Counter");
        this.setSize(500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        area = new JTextArea();
        area.setBounds(50,20,400,300);
        this.add(area);

        button = new JButton("Count");
        button.addActionListener(this);
        button.setBounds(180,350,100,30);
        this.add(button);

        linelabel = new JLabel("Lines: " + linecount);     
        linelabel.setBounds(100,400,100,20);
        this.add(linelabel);

        wordlabel = new JLabel("Words: " + wordcount);
        wordlabel.setBounds(100,420,100,20);
        this.add(wordlabel);


        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            String text = area.getText();
            String[] words = text.split("\\s+");

            wordcount = words.length;
            if(area.getText().isEmpty()){
                wordcount = 0;
            }
            linecount = area.getLineCount();
            linelabel.setText("Lines: " + linecount);
            wordlabel.setText("Words: " + wordcount);
        }
    }

}
