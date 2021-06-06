package views.test;

import javax.swing.*;
import java.awt.*;

 public class TestFrame extends JFrame {
    public TestFrame() {
        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        getContentPane().setLayout(layout);
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");

        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(jb1).addComponent(jb2)
                .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jb3).addComponent(jb4)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup().addComponent(jb1).addComponent(jb2).addComponent(jb3).addComponent(jb4)
        );
        setSize(300, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
