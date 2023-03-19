package ui;

import javax.swing.*;

public class LoginUI {

    public LoginUI (){
        JFrame frame = new JFrame();
        JTextField usertf = new JTextField();
        usertf.setBounds(150,100,100 ,30);

        JTextField passtf= new JTextField();
        passtf.setBounds(150 , 200 , 100 , 30);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(150, 300 , 100 ,30);


        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        frame.add(usertf);
        frame.add(passtf);
        frame.add(loginBtn);


             




    }


}
