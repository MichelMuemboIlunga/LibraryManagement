package ac.za.mycput.Factory;


/*
 * Project
 * Author: Honest Mpungu
 * Student number 215072081
 * Date: 10 April 2022
 */


import ac.za.mycput.Entity.BookEdition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookEditionFactoryTest {

        @Test
        void createBookEdition() {
            BookEdition bookEdition = BookEditionFactory.createBookEdition(1,10,"Application","Development 3");
            System.out.println(bookEdition.toString());
            assertNotNull(bookEdition);
        }
    }

