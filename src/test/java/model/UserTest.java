package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    @DisplayName("Should hash password correctly")
    public void testHashPassword() {
        User testUser = new User("email@gmail.com", "bobby", "newport", "Bobby",
                "Newport", null);
        Assertions.assertNotNull(testUser);
        Assertions.assertEquals(216, testUser.getPassword());
    }
}
