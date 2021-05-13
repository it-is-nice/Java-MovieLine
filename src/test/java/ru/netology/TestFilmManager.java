package ru.netology;


import org.junit.jupiter.api.Test;
import ru.netology.manager.Film;
import ru.netology.manager.ManagerFilm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestFilmManager {

    @Test
    public void longerLineMoviesThanDefaultLine() {
        ManagerFilm manager = new ManagerFilm(12);
        Film first = new Film(1, "Бладшот", "https://netology.ru/", "Боевик");
        Film second = new Film(2, "Вперед", "https://netology.ru/", "Мультфильм");
        Film third = new Film(3, "Отель Белград", "https://netology.ru/", "Комедия");
        Film fourth = new Film(4, "Джентельмены", "https://netology.ru/", "Боевик");
        Film fifth = new Film(5, "Номер один", "https://netology.ru/", "Комедия");
        Film sixth = new Film(6, "Человек-невидимка", "https://netology.ru/", "Ужасы");
        Film seventh = new Film(7, "Хищник", "https://netology.ru/", "Боевик");
        Film eighth = new Film(8, "Чужой", "https://netology.ru/", "Ужасы");
        Film ninth = new Film(9, "Вилли", "https://netology.ru/", "Мультфильм");
        Film tenth = new Film(10, "Вий", "https://netology.ru/", "Ужасы");
        Film eleventh = new Film(11, "Универ", "https://netology.ru/", "Сериал");
        Film twelve = new Film(12, "Тьма", "https://netology.ru/", "Сериал");

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
    public void shorterLineMoviesThanDefaultLine() {
        ManagerFilm manager = new ManagerFilm(7);
        Film first = new Film(1, "Бладшот", "https://netology.ru/", "Боевик");
        Film second = new Film(2, "Вперед", "https://netology.ru/", "Мультфильм");
        Film third = new Film(3, "Отель Белград", "https://netology.ru/", "Комедия");
        Film fourth = new Film(4, "Джентельмены", "https://netology.ru/", "Боевик");
        Film fifth = new Film(5, "Номер один", "https://netology.ru/", "Комедия");
        Film sixth = new Film(6, "Человек-невидимка", "https://netology.ru/", "Ужасы");
        Film seventh = new Film(7, "Хищник", "https://netology.ru/", "Боевик");
        Film eighth = new Film(8, "Чужой", "https://netology.ru/", "Ужасы");
        Film ninth = new Film(9, "Вилли", "https://netology.ru/", "Мультфильм");
        Film tenth = new Film(10, "Вий", "https://netology.ru/", "Ужасы");
        Film eleventh = new Film(11, "Универ", "https://netology.ru/", "Сериал");
        Film twelve = new Film(12, "Тьма", "https://netology.ru/", "Сериал");

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
        Film[] expected = new Film[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth,};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void LineMoviesDefaultLine() {
        ManagerFilm manager = new ManagerFilm();
        Film first = new Film(1, "Бладшот", "https://netology.ru/", "Боевик");
        Film second = new Film(2, "Вперед", "https://netology.ru/", "Мультфильм");
        Film third = new Film(3, "Отель Белград", "https://netology.ru/", "Комедия");
        Film fourth = new Film(4, "Джентельмены", "https://netology.ru/", "Боевик");
        Film fifth = new Film(5, "Номер один", "https://netology.ru/", "Комедия");
        Film sixth = new Film(6, "Человек-невидимка", "https://netology.ru/", "Ужасы");
        Film seventh = new Film(7, "Хищник", "https://netology.ru/", "Боевик");
        Film eighth = new Film(8, "Чужой", "https://netology.ru/", "Ужасы");
        Film ninth = new Film(9, "Вилли", "https://netology.ru/", "Мультфильм");
        Film tenth = new Film(10, "Вий", "https://netology.ru/", "Ужасы");
        Film eleventh = new Film(11, "Универ", "https://netology.ru/", "Сериал");
        Film twelve = new Film(12, "Тьма", "https://netology.ru/", "Сериал");

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
        Film[] expected = new Film[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldExists() {
        ManagerFilm manager = new ManagerFilm();
        Film first = new Film(1, "Бладшот", "https://netology.ru/", "Боевик");
        Film second = new Film(2, "Вперед", "https://netology.ru/", "Мультфильм");
        Film third = new Film(3, "Отель Белград", "https://netology.ru/", "Комедия");
        Film fourth = new Film(4, "Джентельмены", "https://netology.ru/", "Боевик");
        Film fifth = new Film(5, "Номер один", "https://netology.ru/", "Комедия");
        Film sixth = new Film(6, "Человек-невидимка", "https://netology.ru/", "Ужасы");
        Film seventh = new Film(7, "Хищник", "https://netology.ru/", "Боевик");
        Film eighth = new Film(8, "Чужой", "https://netology.ru/", "Ужасы");
        Film ninth = new Film(9, "Вилли", "https://netology.ru/", "Мультфильм");
        Film tenth = new Film(10, "Вий", "https://netology.ru/", "Ужасы");
        Film eleventh = new Film(11, "Универ", "https://netology.ru/", "Сериал");
        Film twelve = new Film(12, "Тьма", "https://netology.ru/", "Сериал");

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
        Film[] expected = new Film[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third}; //,second,first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldExists2() {
        ManagerFilm manager = new ManagerFilm();

        Film eighth = new Film(1, "Чужой", "https://netology.ru/", "Ужасы");
        Film ninth = new Film(2, "Вилли", "https://netology.ru/", "Мультфильм");
        Film tenth = new Film(3, "Вий", "https://netology.ru/", "Ужасы");
        Film eleventh = new Film(4, "Универ", "https://netology.ru/", "Сериал");
        Film twelve = new Film(5, "Тьма", "https://netology.ru/", "Сериал");


        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);


        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{twelve, eleventh, tenth, ninth, eighth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldExists3() {
        ManagerFilm manager = new ManagerFilm();
        int idToRemove = 4;

        Film eighth = new Film(1, "Чужой", "https://netology.ru/", "Ужасы");
        Film ninth = new Film(2, "Вилли", "https://netology.ru/", "Мультфильм");
        Film tenth = new Film(3, "Вий", "https://netology.ru/", "Ужасы");
        Film eleventh = new Film(4, "Универ", "https://netology.ru/", "Сериал");
        Film twelve = new Film(5, "Тьма", "https://netology.ru/", "Сериал");

        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        manager.removeById(idToRemove);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{twelve, tenth, ninth, eighth};

        assertArrayEquals(expected, actual);
    }
}
