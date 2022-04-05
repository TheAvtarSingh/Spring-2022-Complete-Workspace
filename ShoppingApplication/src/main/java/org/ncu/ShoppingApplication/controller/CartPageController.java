package org.ncu.ShoppingApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("cart")
@RequestMapping("/CartPageController")
public class CartPageController {

    @RequestMapping("cart")
    public String cart(@SessionAttribute("cart") ShoppingCart cart, Model model){
        model.addAttribute("cart", cart);
        return "cart";
    }
    @ModelAttribute("cart")
    public ShoppingCart shoppingCart(){
    	return new ShoppingCart();
    }
    
}