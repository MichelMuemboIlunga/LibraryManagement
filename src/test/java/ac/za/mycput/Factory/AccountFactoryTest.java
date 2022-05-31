package ac.za.mycput.Factory;

import org.junit.Test;
import ac.za.mycput.Entity.Account;

import static org.junit.Assert.assertNotNull;

public class AccountFactoryTest {

    @Test
    void createAccount() {
        Account account = AccountFactory.createAccount(1, "Testing", true);
        System.out.println(account.toString());
        assertNotNull(account);
    }
}