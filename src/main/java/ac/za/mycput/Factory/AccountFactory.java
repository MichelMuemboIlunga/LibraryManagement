package ac.za.mycput.Factory;

import ac.za.mycput.Entity.Account;

public class AccountFactory {
    public static Account createAccount(int Id, String password, boolean status) {
        return new Account.Builder().setId(Id).setPassword(password).setStatus(status).build();
    }
}
