package hello.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;
    protected User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }



    @OneToMany (mappedBy = "user", orphanRemoval = true, cascade={CascadeType.ALL}, targetEntity = User.class)
    @JsonIgnore(value = true)
    private List<User> UserList;

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
