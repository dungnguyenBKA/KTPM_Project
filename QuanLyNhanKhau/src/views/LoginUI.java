package views;

import controllers.LoginController;
import views.test.TestFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Dung
 */
public class LoginUI extends JFrame {

    private final LoginController controller = new LoginController();

    public LoginUI() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("QUẢN LÝ THÔNG TIN COVID-19 CNPM 20202");
        setKeyEnterToLogin(txbUserName);
        setKeyEnterToLogin(txbPasswd);
    }

    private void setKeyEnterToLogin(JTextField jtf) {
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    login();
                }
            }
        });
    }

    private void goToMain() {
        try {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setResizable(false);
            mainFrame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void goToTest() {
        try {
            TestFrame test = new TestFrame();
            test.setLocationRelativeTo(null);
            test.setResizable(false);
            test.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private void login() {
        String userName = txbUserName.getText();
        String password = String.valueOf(txbPasswd.getPassword());
//        goToTest();
        try {
            if (controller.login(userName, password)) {
                dispose();
                goToMain();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Kiểm tra lại thông tin đăng nhập !", "Có lỗi xảy ra", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            dispose();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!! Vui lòng kiểm tra lại!", "Warning!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initComponents() {
        JPanel jpnLogin = new JPanel();
        txbUserName = new JTextField();
        txbPasswd = new JPasswordField();
        JButton btnLogin = new JButton();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JPanel jPanel2 = new JPanel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jpnLogin.setBackground(new Color(102, 102, 102));

        txbUserName.setFont(new Font("Arial", Font.BOLD, 14));
        txbUserName.setName("txtUserName");

        txbPasswd.setFont(new Font("Arial", Font.BOLD, 14));
        txbPasswd.setName("txtPasswd"); 

        btnLogin.setBackground(Color.WHITE);
        btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
        btnLogin.setText("Login");
        btnLogin.addActionListener(this::btnLoginActionPerformed);

        jLabel1.setFont(new Font("Arial", Font.BOLD, 13));
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setText("User Name:");

        jLabel2.setFont(new Font("Arial", Font.BOLD, 13));
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setText("Password:");

        jLabel3.setFont(new Font("Arial", Font.BOLD, 24));
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setText("LOGIN");

        jPanel2.setBackground(Color.PINK);

        jLabel4.setFont(new Font("Arial", Font.BOLD, 10));
        jLabel4.setForeground(Color.WHITE);
        jLabel4.setText("Team K63 KTPM 20202");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(52, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addContainerGap())
        );

        GroupLayout jpnLoginLayout = new GroupLayout(jpnLogin);
        jpnLogin.setLayout(jpnLoginLayout);
        jpnLoginLayout.setHorizontalGroup(
                jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jpnLoginLayout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                                                .addGroup(jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txbUserName)
                                                                        .addComponent(txbPasswd, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap(56, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jpnLoginLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46))))
        );
        jpnLoginLayout.setVerticalGroup(
                jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(txbUserName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel2))
                                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addComponent(txbPasswd, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txbUserName.getAccessibleContext().setAccessibleName("txtPasswod");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jpnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jpnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnLoginActionPerformed(ActionEvent evt) {
        this.login();
    }

    private JPasswordField txbPasswd;
    private JTextField txbUserName;
}
