
import View.frmUser;
import controllers.UserController;

import javax.swing.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // TODO: Cambie el look and feel a el del sistema por defecto.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException err) {

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        frmUser frmUser = new frmUser();
        frmUser.setVisible(true);
        UserController userController = new UserController(frmUser);
    }
}
