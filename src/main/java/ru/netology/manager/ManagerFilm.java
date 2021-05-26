package ru.netology.manager;
import ru.netology.domain.Film;

public class ManagerFilm {
    private Film[] items = new Film[0];
    private int quantityTape = 10;


    public ManagerFilm(int quantityTape) {
        this.quantityTape = quantityTape;
    }

    public ManagerFilm() {
    }


    public void add(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Film[] getAll() {
        int temp;
        if (items.length <= quantityTape) {
            temp = items.length;
        } else {
            temp = quantityTape;
        }

        Film[] result = new Film[temp];
        for (int i = 0; i < temp; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        Film[] tmp = new Film[length];
        int index = 0;
        for (Film item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
}

