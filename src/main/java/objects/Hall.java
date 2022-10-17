package objects;

import interfaces.IHall;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hall implements IHall {
    private ArrayList<Veiwer> veiwers = new ArrayList<>();

    private int number;

    @Override
    public void addViewer(Veiwer veiwer) {
              veiwers.add(veiwer);
        }

}





