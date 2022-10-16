package objects;

import interfaces.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cinema implements ICinema {
    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", film=" + film +
                ", hall=" + hall +
                ", cashbox=" + cashbox +
                ", affiche=" + affiche +
                ", veiwer=" + veiwer +
                '}';
    }

    private String name;
    private IFilm film;
    private IHall hall;
    private ICashbox cashbox;
    private IAffiche affiche;
    private Veiwer veiwer;

    @Override
    public String getName() {
      return name;
    }

    @Override
    public void whatMovieIsOnNow() {
        System.out.println("В кинотеатре:" + getName() + ", идет показ фильма:" + getFilm().getName()+", жанр:" + getFilm().getGenre() + ", номер зала:"  + getHall().getNumber() +
                ", мест свободно: " + cashbox.getTotalSeats());

    }
}
