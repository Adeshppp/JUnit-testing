package com.TDD.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest =  new PhoneNumberValidator();

    @BeforeEach
    void setUp(){
        underTest = new PhoneNumberValidator();
    }

    @ParameterizedTest
    @CsvSource({"+10000000000,true","+10000000434343000,false","10000000434343000,false"})
//    @CsvSource({"+20000000000,true"}) //failing test
    void itShouldValidatePhoneNumber(String phoneNumber, Boolean expected){
        // Given
//        String phoneNumber = "+10000000000";

        // When
        boolean isValid = underTest.test(phoneNumber);

        // Then
        assertThat(isValid).isEqualTo(expected);
    }


}
