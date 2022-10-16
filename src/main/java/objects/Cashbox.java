package objects;

import interfaces.ICashbox;
import interfaces.IHall;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cashbox implements ICashbox {

    private int cost = 350;

    private int totalSeats;

    @Override
    public void buyTicket(IHall hall, Veiwer veiwer) {

        if(totalSeats == 0) {
            System.out.println("В зале больше мест нет");
            return;
        }
        hall.addViewer(veiwer);
        totalSeats = totalSeats -1;
        System.out.println(veiwer.getName() + " купил/а билет в зал:№" + hall.getNumber() + ", цена " + getCost() + " рублей");


    }
}
