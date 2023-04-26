package com.TDD.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest =  new PhoneNumberValidator();

    @BeforeEach
    void setUp(){
        underTest = new PhoneNumberValidator();
    }

    @Test
    void itShouldValidatePhoneNumber(){
        // Given
        String phoneNumber = "+10000000000";

        // When
        boolean isValid = underTest.test(phoneNumber);

        // Then
        assertThat(isValid).isTrue();
    }

    @Test
    @DisplayName("Should fail when legth is Bigger than 13")
    void itShouldValidatePhoneNumberWhenIncorrectAndHasLengthBiggerThan13(){
        // Given
        String phoneNumber = "+10000000434343000";

        // When
        boolean isValid = underTest.test(phoneNumber);

        // Then
        assertThat(isValid).isFalse();
    }

    @Test
    @DisplayName("Should fail when does not start with +")
    void itShouldValidatePhoneNumberWhenDoesNotStartWithPlusSign(){
        // Given
        String phoneNumber = "10000000434343000";

        // When
        boolean isValid = underTest.test(phoneNumber);

        // Then
        assertThat(isValid).isFalse();
    }

}
