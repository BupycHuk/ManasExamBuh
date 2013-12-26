package hello.Model;

import javax.persistence.*;
import java.util.BitSet;

@Entity
public class OperationTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="name")
    private String name;
    @Column(name="isMinus")
    private BitSet isMinus;

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
