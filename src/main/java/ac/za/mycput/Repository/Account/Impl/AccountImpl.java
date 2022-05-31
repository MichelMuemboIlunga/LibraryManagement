package ac.za.mycput.Repository.Account.Impl;

import ac.za.mycput.Entity.Account;
import ac.za.mycput.Repository.Account.IAccountRepository;
import java.util.HashSet;
import java.util.Set;

public class AccountImpl implements IAccountRepository {

    private static ac.za.mycput.Repository.Account.Impl.AccountImpl repos = null;
    private Set<Account> accountDb;

    public AccountImpl() {
        accountDb = new HashSet<Account>();
    }

    public static ac.za.mycput.Repository.Account.Impl.AccountImpl getRepos() {
        if (repos == null) {
            repos = new ac.za.mycput.Repository.Account.Impl.AccountImpl();
        }
        return repos;
    }

    @Override
    public Account create(Account account) {
        boolean success = accountDb.add(account);
        if(!success)
            return null;
        return account;
    }



    @Override
    public Account read(Integer id) {
        Account account = accountDb.stream().filter(x-> x.getId() == id).findAny().orElse(null);
        return account;
    }

    @Override
    public Account update(Account account) {
        Account account1 = read(account.getId());
        if(account1 != null){
            accountDb.remove(account1);
            accountDb.add(account);
            return account;
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        Account accountRemove = read(id);
        if (accountRemove == null)
            return false;
        accountDb.remove(id);

        return true;
    }


    @Override
    public Set<Account> getAll() {
        return accountDb;
    }

}

