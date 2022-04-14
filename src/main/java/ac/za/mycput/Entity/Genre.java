package ac.za.mycput.Entity;

/*
 * Entity for the Genre
 * Project Term One
 * Author: Honest Mpungu
 * Student number 215072081
 * Date: 10 April 2022
 */

public class Genre {
    private int genreId;
    private String type;
    private String description;

    public Genre(Genre.Builder builder) {
        this.genreId = builder.genreId;
        this.type = builder.type;
        this.description = builder.description;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreId +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private int genreId;
        private String type;
        private String description;


        public Genre.Builder setGenreId(int genreId) {
            this.genreId = genreId;
            return this;
        }

        public Genre.Builder setType(String type) {
            this.type = type;
            return this;
        }


        public Genre.Builder copy(Genre genre) {
            this.genreId = genre.genreId;
            this.type = genre.type;
            this.description = genre.description;

            return this;
        }

        public Genre build() {
            return new Genre(this);
        }
    }
}

