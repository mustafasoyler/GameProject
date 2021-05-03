package com.mustafa.entity.manager;

import com.mustafa.entity.Game;
import com.mustafa.entity.Sale;
import com.mustafa.entity.User;
import com.mustafa.entity.service.SaleService;

public class SaleManager implements SaleService {

    @Override
    public void addSale(User user, Game game, Sale sale) {
        System.out.println(user.getUserName() + " is bought " + game.getGameName() + " Total : " +(game.getGameValue()*sale.getSaleAmount()) + "TL by using "  + sale.getPaymentMethod() + ", Amount : " + sale.getSaleAmount());

    }

    @Override
    public void removeSale(User user, Game game, Sale sale) {
        System.out.println(user.getUserName() + " is removed " + game.getGameName() + " Total : " +(game.getGameValue()*sale.getSaleAmount()) + "TL by using "  + sale.getPaymentMethod() + ", Amount : " + sale.getSaleAmount());

    }

    @Override
    public void returnSale(User user, Game game, Sale sale) {
        System.out.println(user.getUserName() + " is returned " + game.getGameName() + " Total : " +(game.getGameValue()*sale.getSaleAmount()) + "TL by using "  + sale.getPaymentMethod() + ", Amount : " + sale.getSaleAmount());

    }

    @Override
    public void getAllSale(Sale[] sales) {
        for(Sale sale : sales) {
            System.out.println("Id : " + sale.getId() + " Sale Type : " + sale.getSaleType());
        }

    }





}

