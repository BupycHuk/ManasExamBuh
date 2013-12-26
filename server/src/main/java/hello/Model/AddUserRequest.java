package hello.Model;

import java.io.Serializable;

public class AddUserRequest implements Serializable {

    private String name;
    private String email;


    public AddUserRequest()
    {

    }

    public AddUserRequest(String name, String email) {
        //To change body of created methods use File | Settings | File Templates.
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}