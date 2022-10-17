package interfaces;

import objects.Veiwer;

public interface ICashbox {

    int getCost();

    int getTotalSeats();

    int getTotalCash();


    void buyTicket(IHall hall, Veiwer veiwer);




}

