package ru.netology;



import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import ru.netology.manager.ManagerFilm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerFilmTest {

  @Test
  public void shouldShowAllMovies() {
    ManagerFilm manager = new ManagerFilm();
    manager.setQuantityTape(12);
    Film first = new Film(1, "M1", "https://netology.ru/", "Драма");
    Film second = new Film(2, "M2", "https://netology.ru/", "Драма");
    Film third = new Film(3, "M3", "https://netology.ru/", "Драма");
    Film fourth = new Film(4, "M4", "https://netology.ru/", "Боевик");
    Film fifth = new Film(5, "M5", "https://netology.ru/", "Комедия");
    Film sixth = new Film(6, "M6", "https://netology.ru/", "Ужасы");
    Film seventh = new Film(7, "M7", "https://netology.ru/", "Боевик");
    Film eighth = new Film(8, "M8", "https://netology.ru/", "Ужасы");
    Film ninth = new Film(9, "M9", "https://netology.ru/", "Мультфильм");
    Film tenth = new Film(10, "M10", "https://netology.ru/", "Ужасы");
    Film eleventh = new Film(11, "M11", "https://netology.ru/", "Ужасы");
    Film twelve = new Film(12, "M12", "https://netology.ru/", "Ужасы");

    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(tenth);
    manager.add(eleventh);
    manager.add(twelve);



    Film[] actual = manager.getAll();
    Film[] expected = new Film[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
    assertArrayEquals(expected, actual);

  }
  @Test
  public void shouldShowLast10Movies() {

    ManagerFilm manager = new ManagerFilm();


    Film first = new Film(1, "M1", "https://netology.ru/", "Драма");
    Film second = new Film(2, "M2", "https://netology.ru/", "Драма");
    Film third = new Film(3, "M3", "https://netology.ru/", "Драма");
    Film fourth = new Film(4, "M4", "https://netology.ru/", "Боевик");
    Film fifth = new Film(5, "M5", "https://netology.ru/", "Комедия");
    Film sixth = new Film(6, "M6", "https://netology.ru/", "Ужасы");
    Film seventh = new Film(7, "M7", "https://netology.ru/", "Боевик");
    Film eighth = new Film(8, "M8", "https://netology.ru/", "Ужасы");
    Film ninth = new Film(9, "M9", "https://netology.ru/", "Мультфильм");
    Film tenth = new Film(10, "M10", "https://netology.ru/", "Ужасы");
    Film eleventh = new Film(11, "M11", "https://netology.ru/", "Ужасы");
    Film twelve = new Film(12, "M12", "https://netology.ru/", "Ужасы");

    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(tenth);
    manager.add(eleventh);
    manager.add(twelve);

    Film[] actual = manager.getAll();
    Film[] expected = new Film[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth,
            fifth, fourth, third}; //,second,first};

    assertArrayEquals(expected, actual);
  }

  //если фильмов меньше чем лимит ленты выводим что есть
  @Test
  public void shoudShow4Movies() {
    ManagerFilm manager = new ManagerFilm();
    manager.setQuantityTape(4);

    Film eighth = new Film(8, "M8", "https://netology.ru/", "Ужасы");
    Film ninth = new Film(9, "M9", "https://netology.ru/", "Мультфильм");
    Film tenth = new Film(10, "M10", "https://netology.ru/", "Ужасы");
    Film eleventh = new Film(11, "M11", "https://netology.ru/", "Ужасы");
    Film twelve = new Film(12, "M12", "https://netology.ru/", "Ужасы");


    manager.add(eighth);
    manager.add(ninth);
    manager.add(tenth);
    manager.add(eleventh);
    manager.add(twelve);



    Film[] actual = manager.getAll();
    Film[] expected = new Film[]{twelve, eleventh, tenth, ninth};

    assertArrayEquals(expected, actual);
  }

}
