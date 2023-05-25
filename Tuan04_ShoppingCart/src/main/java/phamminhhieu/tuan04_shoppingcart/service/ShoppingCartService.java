package phamminhhieu.tuan04_shoppingcart.service;

import phamminhhieu.tuan04_shoppingcart.model.CartItem;

import java.util.Collection;

public interface ShoppingCartService {
    void add(CartItem newItem);
    void remove(int id);
    CartItem update(int productId, int quantity);
    void clear();
    double getAmount();
    int getCount();
    Collection<CartItem> getAll();
}
