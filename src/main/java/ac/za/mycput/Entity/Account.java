package ac.za.mycput.Entity;

public class Account {
    private int Id;
    private String password;
    private boolean status;

    public Account(Builder builder) {
        this.Id = builder.Id;
        this.password = builder.password;
        this.status = builder.status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Id=" + Id +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }

    public static class Builder {
        private int Id;
        private String password;
        private boolean status;


        public Account.Builder setId(int Id) {
            this.Id = Id;
            return this;
        }

        public Account.Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Account.Builder setStatus(boolean status) {
            this.status = status;
            return this;
        }


        public Builder copy(Account account) {
            this.Id = account.Id;
            this.password = account.password;
            this.status = account.status;

            return this;
        }

        public Account build() {
            return new Account(this);
        }

    }
}

