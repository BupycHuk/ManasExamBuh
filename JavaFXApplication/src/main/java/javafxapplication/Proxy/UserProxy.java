package javafxapplication.Proxy;

import javafxapplication.Controller.User.ListUserController;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:03
 * To change this template use File | Settings | File Templates.
 */
public class UserProxy extends Proxy {

    public static ListUserController getUsers() {
        return User;
    }
}
