package ac.za.mycput.Factory;

/*
 * Project term One
 * Author: Honest Mpungu
 * Student number 215072081
 * Date: 10 April 2022
 */

import ac.za.mycput.Entity.Genre;

public class GenreFactory {
    public static Genre create(int genreId, String type, String description) {
        return new Genre.Builder().setGenreId(genreId).setType(type).build();
    }
}

