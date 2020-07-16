package EntityFactory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "equipment" )
public class Equipment {

    private String producer;
    private String model;
    private String serial;
    private String isWorking;

    @Id
    @GeneratedValue
    private Integer id;
    public Integer getId() {
        return id;
    }

    public Equipment(String producer, String model, String serial, Boolean isWorking) {
        // this form used by Hibernate
    }

    public Equipment(String producer, String model, String serial, String isWorking) {
        this.producer = producer;
        this.model = model;
        this.serial = serial;
        this.isWorking = isWorking;
    }

}
