package hello.Model.RequestDto;
import java.security.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 07.01.14
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 */
public class AddUserRequest {
    private long id;
    private String name;
    private String email;
    private String password;
    protected Timestamp create_time;
    public AddUserRequest(){

    }
    public AddUserRequest(String name, String email, String password ){

        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
