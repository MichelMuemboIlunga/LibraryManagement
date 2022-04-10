package ac.za.mycput.Helper;

import java.util.UUID;

public class Helper
{
    public static Long generateID()
    {
        return UUID.randomUUID().getMostSignificantBits();
    }
}
