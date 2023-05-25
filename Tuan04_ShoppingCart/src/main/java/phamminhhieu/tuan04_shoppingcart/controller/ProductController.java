package phamminhhieu.tuan04_shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import phamminhhieu.tuan04_shoppingcart.model.Product;
import phamminhhieu.tuan04_shoppingcart.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/view")
    public String viewProduct(Model model) {
        model.addAttribute("listProducts", productService.getAll());
        return "view_ProductList";
    }

    @GetMapping("/create")
    public String showNewProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "new_product";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/product/view";
    }

    @GetMapping("/updateProduct/{id}")
    public String showFormUpdate(@PathVariable("id") int id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "update_product";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id, Model model) {
        productService.deleteProductById(id);
        return "redirect:/product/view";
    }
}
