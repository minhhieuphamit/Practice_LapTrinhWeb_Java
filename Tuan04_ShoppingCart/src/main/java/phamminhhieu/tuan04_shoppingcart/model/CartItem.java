package phamminhhieu.tuan04_shoppingcart.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class CartItem {
    private int productId;
    private String name;
    private double price;
    private double quantity = 1;
}
