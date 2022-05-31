package ac.za.mycput.Entity;

public class BookReservation {
    private String creationDate;
    private boolean status;

    public BookReservation(Builder builder) {
        this.creationDate = builder.creationDate;
        this.status = builder.status;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookReservation{" +
                "creationDate='" + creationDate + '\'' +
                ", status=" + status +
                '}';
    }

    public static class Builder {
        private String creationDate;
        private boolean status;


        public BookReservation.Builder creationDate(String creationDate){
            this.creationDate = creationDate;
            return this;
        }

        public BookReservation.Builder setStatus(boolean status) {
            this.status = status;
            return this;
        }


        public Builder copy(BookReservation bookReservation) {
            this.creationDate = bookReservation.creationDate;
            this.status = bookReservation.status;

            return this;
        }

        public BookReservation build() {
            return new BookReservation(this);
        }

    }
}


