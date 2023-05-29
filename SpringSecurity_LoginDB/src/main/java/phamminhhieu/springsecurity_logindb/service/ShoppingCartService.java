package phamminhhieu.springsecurity_logindb.service;

import phamminhhieu.springsecurity_logindb.model.CartItem;

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
