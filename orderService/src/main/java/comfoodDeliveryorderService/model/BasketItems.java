package comfoodDeliveryorderService.model;

import javax.persistence.*;

@Entity
@Table(name = "basketitems")
public class BasketItems {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_basket_id", referencedColumnName = "id")
    private Basket basket;

    @Column(name = "fk_item_id")
    private int fkItemId;

    @Column(name = "quantity")
    private int quantity;

    public BasketItems() {
    }

    public BasketItems( Basket basket, int fkItemId, int quantity) {

        this.basket = basket;
        this.fkItemId = fkItemId;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public int getFkItemId() {
        return fkItemId;
    }

    public void setFkItemId(int fkItemId) {
        this.fkItemId = fkItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
