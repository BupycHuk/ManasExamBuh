package javafxapplication.Proxy;

import javafxapplication.Model.AddUserRequest;
import javafxapplication.Model.User;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:03
 * To change this template use File | Settings | File Templates.
 */
public class UserProxy extends Proxy {

    public boolean addUser(AddUserRequest addUserRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addUser/"), addUserRequest, User.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }
    public User[] getUsers() {
        return restTemplate.getForObject(urlService.GetServerUrl("/users/"), User[].class);
    }
}
