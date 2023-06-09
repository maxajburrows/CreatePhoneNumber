import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatePhoneNumberTest {

    CreatePhoneNumber creator = new CreatePhoneNumber();
    @Test
    public void checkMethods() {
        assertEquals("(123) 456-7890", creator.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        }
    }

