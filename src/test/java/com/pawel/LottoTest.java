package com.pawel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LottoTest {

    private Lotto lotto;

    @BeforeEach
    void setup() {
        lotto = new Lotto();
    }

    @Test
    void shouldDrawNumbers() {
        //given
        int x = 6;
        int min = 1;
        int max = 49;
        //when
        Set<Integer> actual = lotto.losuj(x, min, max);
        //then
        assertThat(actual)
                .hasSize(x)
                .allSatisfy(value -> {
                    assertThat(value).isGreaterThanOrEqualTo(min);
                    assertThat(value).isLessThanOrEqualTo(max);
                })
                .filteredOn(value -> value >= min && value <= max);
    }
}
