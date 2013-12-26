package hello.Model;
/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.12.13
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 */
import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name="balance")
    private DecimalFormat balance;

    protected void Account(){}
    public void Account(DecimalFormat balance) {
        this.balance = balance;

    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    public DecimalFormat getBalance() {
        return balance;
    }

    public void setBalance(DecimalFormat balance) {
        this.balance = balance;
    }
}
