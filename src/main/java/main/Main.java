package main;

import objects.*;

public class Main {
    public static void main(String[] args) {



        Affiche affiche = new Affiche();

        Cashbox cashbox = new Cashbox();

        Hall hall1 = new Hall();
        hall1.setNumber(1);
        cashbox.setTotalSeats(4);


        Film film1 = new Film("Облачный атлас","Фантастика","США","2013");
        Film film2 = new Film("Форест Гамп","Драма","США","1994");
        Film film3 = new Film("Аннигиляция","Фантастика","США","2016");
        Film film4 = new Film("Побудь в моей шкуре","Фантастика","США","2018");
        Film film5 = new Film("Джон Картер","Фантастика","США","2014");

        Veiwer veiwer = new Veiwer("Cофья");
        Veiwer veiwer1 = new Veiwer("Ксюша");
        Veiwer veiwer2 = new Veiwer("Илюша");
        Veiwer veiwer3 = new Veiwer("Mарина");
        Veiwer veiwer4 = new Veiwer("Mарина");


        affiche.addFilm(film1);
        affiche.addFilm(film2);
        affiche.addFilm(film3);
        affiche.addFilm(film4);
        affiche.addFilm(film5);

        Cinema cinema = new Cinema();
        cinema.setFilm(film1);
        cinema.setHall(hall1);
        cinema.setName("Седьмое небо");
        cinema.setCashbox(cashbox);
        cinema.setAffiche(affiche);

        cashbox.buyTicket(hall1,veiwer);
        cashbox.buyTicket(hall1,veiwer1);
        cashbox.buyTicket(hall1,veiwer3);
        cashbox.buyTicket(hall1,veiwer4);
        cashbox.buyTicket(hall1,veiwer2);
        cashbox.buyTicket(hall1,veiwer2);




        cinema.whatMovieIsOnNow();
        System.out.println(cashbox.getTotalCash());
        affiche.seeAffiche();







    }
}
