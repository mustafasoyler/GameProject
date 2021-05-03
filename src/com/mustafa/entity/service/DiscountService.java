package com.mustafa.entity.service;

import com.mustafa.entity.Discount;
import com.mustafa.entity.Game;
import com.mustafa.entity.User;

public interface DiscountService {

     void addDiscount(User user, Discount discount, Game games);
     void removeDiscount(User user, Discount discount, Game games);
     void updateDiscount(User user, Discount discount, Game games);
     void getAllDiscount(Discount[] discounts);
}
