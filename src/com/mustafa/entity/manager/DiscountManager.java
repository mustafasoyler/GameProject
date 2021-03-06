package com.mustafa.entity.manager;

import com.mustafa.entity.Discount;
import com.mustafa.entity.Game;
import com.mustafa.entity.User;
import com.mustafa.entity.service.DiscountService;

public class DiscountManager implements DiscountService {

    @Override
    public void addDiscount(User user, Discount discount, Game games) {
        System.out.println(discount.getDiscountName() + " is added to " + user.getUserName() + " Discount Amount is " + discount.getDiscountAmount() + " : New Total Amount : "  + (games.getGameValue()-(games.getGameValue()*discount.getDiscountAmount()/100)));

    }

    @Override
    public void removeDiscount(User user, Discount discount, Game games) {
        System.out.println(discount.getDiscountName() + " is removed to " + user.getUserName() + " Discount Amount is " + discount.getDiscountAmount() + " : New Total Amount : "  + (games.getGameValue()+(games.getGameValue()*discount.getDiscountAmount()/100)));


    }

    @Override
    public void updateDiscount(User user, Discount discount, Game games) {
        System.out.println(discount.getDiscountName() + " is updated to " + user.getUserName() + " Discount Amount is " + discount.getDiscountAmount() + " : New Total Amount : "  + (games.getGameValue()-(games.getGameValue()*discount.getDiscountAmount()/100)));


    }

    @Override
    public void getAllDiscount(Discount[] discounts) {
        for(Discount discount : discounts) {
            System.out.println("Discount name : " + discount.getDiscountName() + " Discount Amount : " + discount.getDiscountAmount());
        }

    }

}

