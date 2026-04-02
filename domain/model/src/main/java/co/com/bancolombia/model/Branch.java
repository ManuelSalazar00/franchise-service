package co.com.bancolombia.model;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder(toBuilder = true)
public class Branch {
    private final Integer id;
    private final Integer branchId;
    private final String name;
    private final List<Product> products;

    public Branch(Integer id, Integer branchId, String name, List<Product> products) {
        this.id = id;
        this.branchId = branchId;
        this.name = name;
        this.products = products != null ? List.copyOf(products) : List.of();
    }

    public Branch addProduct(Product newProduct) {
        List<Product> updated = new ArrayList<>(this.products);
        updated.add(newProduct);
        return this.toBuilder()
                .products(updated)
                .build();
    }
}
