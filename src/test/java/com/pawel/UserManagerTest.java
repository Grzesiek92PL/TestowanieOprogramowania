package com.pawel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    private UserManager userManager;

    @BeforeEach
    void setup() {
        userManager = new UserManager(loadUser());
    }

    @Test
    void getUsersInOrder() {
        //given
        //when
        List<User> actual = userManager.getUsers();
        //then
        assertThat(actual)
                .extracting("isAdmin")
                .containsExactly(true, true, false, false, true);
    }

    @Test
    void getAdminsInOrder() {
        //given
        //when
        List<User> actual = userManager.getAdmins();
        //then
        assertThat(actual)
                .hasSize(3)
                .extracting("isAdmin")
                .containsExactly(true, true, true);
    }

    @Test
    void getMaxScore() {
        //given
        //when
        int expected = 700;
        int actual = userManager.getMaxScore();
        //then
        assertThat(actual).isEqualTo(expected);

    }

    private List<User> loadUser() {
        return Arrays.asList(
                new User(1, true, 100),
                new User(2, true, 10),
                new User(3, false, 0),
                new User(4, false, 700),
                new User(5, true, 1)
        );
    }
}







