package comfoodDeliveryorderService.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "foodorder")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "fk_restaurant_id")
    private int fkRestaurantId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_basket_id", referencedColumnName = "id")
    private Basket basket;

    @Column(name = "order_time")
    private LocalTime orderTime;

    @Column(name = "fk_payment_details")
    private int fkPaymentType;

    @Column(name = "pickup_time")
    private LocalTime pickupTime;

    @Column(name = "delivery_time")
    private LocalTime deliveryTime;

    @Column(name = "pickup_otp")
    private int pickupOtp;

    @Column(name = "delivery_otp")
    private int deliveryOtp;

    public Order() {
    }

    public Order(int fkRestaurantId, Basket basket, LocalTime orderTime, int fkPaymentType, LocalTime pickupTime, LocalTime deliveryTime, int pickupOtp, int deliveryOtp) {

        this.fkRestaurantId = fkRestaurantId;
        this.basket = basket;
        this.orderTime = orderTime;
        this.fkPaymentType = fkPaymentType;
        this.pickupTime = pickupTime;
        this.deliveryTime = deliveryTime;
        this.pickupOtp = pickupOtp;
        this.deliveryOtp = deliveryOtp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFkRestaurantId() {
        return fkRestaurantId;
    }

    public void setFkRestaurantId(int fkRestaurantId) {
        this.fkRestaurantId = fkRestaurantId;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    public int getFkPaymentType() {
        return fkPaymentType;
    }

    public void setFkPaymentType(int fkPaymentType) {
        this.fkPaymentType = fkPaymentType;
    }

    public LocalTime getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(LocalTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public LocalTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getPickupOtp() {
        return pickupOtp;
    }

    public void setPickupOtp(int pickupOtp) {
        this.pickupOtp = pickupOtp;
    }

    public int getDeliveryOtp() {
        return deliveryOtp;
    }

    public void setDeliveryOtp(int deliveryOtp) {
        this.deliveryOtp = deliveryOtp;
    }
}
