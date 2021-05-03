package com.mustafa.entity;

import com.mustafa.entity.manager.*;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1,"musti","Mustafa", "Söyler","55555",23,"Male");
        User user2 = new User(2,"ali","Ali", "Akıl","53555",13,"Male");
        User user3 = new User(3,"ahmet","Ahmet", "Zeka","35555",33,"Male");

        User[] users = {user1, user2, user3};

        UserManager userManager = new UserManager();
        userManager.addUser(user1);
        userManager.removeUser(user2);
        userManager.updateUser(user3);
        userManager.getAll(users);

        System.out.println("-----------AUTHENTICATION-----------------");

        Authentication user1Value = new Authentication("Mustafa","Söyler","55555",23,"Male");
        Authentication user2Value = new Authentication("Ali","Akıl","53555",13,"Male");
        Authentication user3Value = new Authentication("Ahmet","Zeka","35555",33,"Male");

        AuthenticationManager authentication = new AuthenticationManager();
        authentication.Authentication(user1,user1Value);
        authentication.Authentication(user2,user2Value);
        authentication.Authentication(user3,user3Value);

        System.out.println("---------GAMES-------------------");

        Game games1 = new Game(1, "Outlast", "Korku", 32.99);
        Game games2 = new Game(2, "R6", "FPS", 139.99);
        Game games3 = new Game(3, "Europa Universalis 4", "Strateji", 55);

        Game[] games = {games1, games2, games3};

        GameManager gamesManager = new GameManager();
        gamesManager.addGame(games1);
        gamesManager.removeGame(games2);
        gamesManager.updateGame(games3);
        gamesManager.getAllGame(games);

        System.out.println("-------------SALES---------------");

        Sale sales1 = new Sale(1,"Code", "Credit Card", 1);
        Sale sales2 = new Sale(2,"Account", "Cash", 2);
        Sale sales3 = new Sale(3,"Gift", "Transfer", 3);

        Sale[] sales = {sales1, sales2, sales3};

        SaleManager salesManager = new SaleManager();
        salesManager.addSale(user2, games2, sales2);
        salesManager.removeSale(user1, games3, sales1);
        salesManager.returnSale(user3, games1, sales3);
        salesManager.getAllSale(sales);

        System.out.println("------------DISCOUNTS----------------");

        Discount discount1 = new Discount(1,"Kış İndirimi", 15);
        Discount discount2 = new Discount(2,"Yaz İndirimi", 30);
        Discount discount3 = new Discount(3,"Sonbahar İndirimi", 20);

        Discount[] discounts = {discount1, discount2, discount3};

        DiscountManager discountManager = new DiscountManager();
        discountManager.addDiscount(user3, discount2, games1);
        discountManager.addDiscount(user2, discount1, games3);
        discountManager.addDiscount(user1, discount3, games2);
        discountManager.getAllDiscount(discounts);


    }

}



