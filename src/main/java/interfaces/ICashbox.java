package interfaces;

import objects.Veiwer;

public interface ICashbox {

    int getCost();

    int getTotalSeats();

    void buyTicket(IHall hall, Veiwer veiwer);




}

