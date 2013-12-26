package hello.Model;

import javax.persistence.*;
@Entity
public class Tizme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="tizmeName")
    private String tizmeName;

    protected Tizme() {}

    public Tizme(String tizmeName)
    {
        this.tizmeName = tizmeName;

    }


    public String getTizmeName() {
        return tizmeName;
    }

    public void setTizmeName(String tizmeName) {
        this.tizmeName = tizmeName;
    }
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tizme")
    private Tizme tizme;

    public Tizme getTizme() {
        return tizme;
    }

    public void setTizme(Tizme tizme) {
        this.tizme = tizme;
    }
}
