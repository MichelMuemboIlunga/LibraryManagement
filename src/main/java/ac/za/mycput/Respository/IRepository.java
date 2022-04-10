package ac.za.mycput.Respository;

public interface IRepository<C,ID>

{
    C create(C object);
    C read(ID id);
    C update(C object);
    boolean delete(ID id);
}
