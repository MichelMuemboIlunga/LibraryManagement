package ac.za.mycput.Repository.Account;

import ac.za.mycput.Entity.Account;
import ac.za.mycput.Repository.IRepository;
import java.util.Set;

public interface IAccountRepository extends IRepository<Account, Integer> {
    public Set<Account> getAll();
}
