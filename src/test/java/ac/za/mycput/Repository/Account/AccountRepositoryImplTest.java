package ac.za.mycput.Repository.Account;

import ac.za.mycput.Entity.Account;
import ac.za.mycput.Factory.AccountFactory;
import ac.za.mycput.Repository.Account.Impl.AccountImpl;
import org.junit.Test;
import org.junit.Assert;

public class AccountRepositoryImplTest {

    private static AccountImpl repos= AccountImpl.getRepos();
    private  static Account account = AccountFactory.createAccount(1,"Test",true);

    @Test
    void create() {
        Account created = repos.create(account);
        Assert.assertEquals(account.getId(),created.getId());
        System.out.println("created " + created);
    }

    @Test
    void read() {
        Account read = repos.read(account.getId());
        System.out.println("read: "+ read);
    }

    @Test
    void update() {
        Account updated = new Account.Builder().copy(account).setId(2).setPassword("password").setStatus(true).build();
        System.out.println("updated:" + updated);
    }

    @Test
    void delete() {
        boolean success = repos.delete(account.getId());
        System.out.println("deleted " + success);

    }
    @Test
    void getAll() {
        System.out.println(repos.getAll());

    }
}
