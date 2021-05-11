package ru.netology.manager;

import ru.netology.domain.Film;

public class ManagerFilm {
    private Film[] items = new Film[0];
    private int quantityTape = 10;

    public void setQuantityTape(int quantityTape) {
        this.quantityTape = quantityTape;
    }

    public void add(Film item) {

        int length = items.length + 1;
        Film[] tmp = new Film[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    //
    public Film[] getAll() {
        if (items.length <= quantityTape) {
            Film[] result = new Film[items.length];
            for (int i = 0; i < items.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        } else {
            Film[] result = new Film[quantityTape];
            for (int i = 0; i < quantityTape; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }


}

