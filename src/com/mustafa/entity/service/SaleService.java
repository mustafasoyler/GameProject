package com.mustafa.entity.service;

import com.mustafa.entity.Game;
import com.mustafa.entity.Sale;
import com.mustafa.entity.User;

public interface SaleService {

     void addSale(User user, Game game, Sale sale);
     void removeSale(User user, Game game, Sale sale);
     void returnSale(User user, Game game, Sale sale);
     void getAllSale(Sale[] sales);
}
