package hello.Model;

import javax.persistence.*;
import java.util.BitSet;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 07.01.14
 * Time: 14:42
 * To change this template use File | Settings | File Templates.
 */
public class OperationTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="name")
    private String name;
    @Column(name="isMinus")
    private java.util.BitSet isMinus;

    protected OperationTypes(){}
    public OperationTypes(String name, BitSet isMinus) {
        this.name = name;
        this.isMinus = isMinus;

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

    public BitSet getMinus() {
        return isMinus;
    }

    public void setMinus(BitSet minus) {
        isMinus = minus;
    }

}
