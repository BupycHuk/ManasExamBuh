package hello.Model;

import javax.persistence.*;
import java.text.DecimalFormat;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 07.01.14
 * Time: 14:38
 * To change this template use File | Settings | File Templates.
 */
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name="balance")
    private java.text.DecimalFormat balance;

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
