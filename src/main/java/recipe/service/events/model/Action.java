package recipe.service.events.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Action implements Serializable {

    private static final long serialVersionUID = 144444545654L;

    private String message;
    @Id
    @Column(unique = true)
    private Integer id;
    private Date date;

    public Action() {
    }

    public Action(String message, Integer id, Date date) {
        this.message = message;
        this.id = id;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
