package comfoodDeliveryorderService.model;

import javax.persistence.*;

@Entity
@Table(name = "basket")
public class Basket {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "fk_user_id")
    private int fkUserId;

    public Basket() {
    }

    public Basket(int fkUserId, int fkItemId, int quantity) {
        this.fkUserId = fkUserId;

    }

    public int getId() {
        return id;
    }

    public int getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(int fkUserId) {
        this.fkUserId = fkUserId;
    }

}
