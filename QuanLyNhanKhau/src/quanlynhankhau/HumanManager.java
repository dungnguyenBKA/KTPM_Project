package quanlynhankhau;

import views.LoginUI;

import javax.swing.*;
import java.util.Calendar;

/**
 *
 * @author Dung
 */
public class HumanManager {

    public static Calendar calendar = Calendar.getInstance();
    
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true);

    }
    
}
