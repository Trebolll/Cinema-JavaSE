package objects;

import interfaces.IFilm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Film implements IFilm {
    private String name;
    private String genre;
    private String country;
    private String year;


}
