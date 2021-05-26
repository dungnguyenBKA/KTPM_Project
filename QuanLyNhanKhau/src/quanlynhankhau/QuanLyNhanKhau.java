package quanlynhankhau;

import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.UIManager;
import views.LoginUI;
import views.MainFrame;

/**
 *
 * @author Dung
 */
public class QuanLyNhanKhau {

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
