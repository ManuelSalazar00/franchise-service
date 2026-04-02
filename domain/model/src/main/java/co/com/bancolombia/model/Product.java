package co.com.bancolombia.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class Product {

    private final Integer id;
    private final Branch branch;
    private final String name;
    private final Double price;
    private final int stock;

    public Product(Integer id, Branch branch, String name, Double price, int stock) {
        this.id = id;
        this.branch = branch;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product updateStock(Integer amount) {
        if (!canCheckOut(amount)) {
            throw new IllegalArgumentException("No hay suficiente stock para realizar la operación");
        }
        return this.toBuilder()
                .stock(this.stock - amount)
                .build();
    }

    public boolean canCheckOut(Integer amount) {
        return amount != null && amount >= 0 && amount <= this.stock;
    }
}
