
import View.frmUser;
import controllers.UserController;

public class Main {

    public static void main(String[] args) {
        frmUser frmUser = new frmUser();
        frmUser.setVisible(true);
        UserController userController = new UserController(frmUser);
    }
}
