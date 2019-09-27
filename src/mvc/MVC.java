package mvc;

import com.demo.controller.ControllerLogin;
import com.demo.view.VistaLogin;

public class MVC {

    public static void main(String[] args) {
        ControllerLogin inicio = new ControllerLogin(new VistaLogin());
    }

}
