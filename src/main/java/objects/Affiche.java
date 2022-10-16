package objects;

import interfaces.IAffiche;
import interfaces.IFilm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Affiche implements IAffiche {
    @Override
    public String toString() {
        return "Affiche{" +
                "film=" + film +
                ", totalFilm=" + totalFilm +
                '}';
    }

    private IFilm film;
    private ArrayList<IFilm> totalFilm = new ArrayList<>();

    @Override
    public IFilm film() {
        return film;
    }

    @Override
    public void addFilm(IFilm film) {
      totalFilm.add(film);
    }

    @Override
    public void seeAffiche() {
        for (IFilm films:totalFilm){
            System.out.println( films.getName());
        }
    }
}
