package com.example.myfirsttests

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class EmailValidatorTest {
    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_OnlyUnderlineBeforeDogSymbol_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("_@mail.ru"))
    }

    @Test
    fun emailValidator_SomeDogSymbol_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@@mail.ru"))
    }

    @Test
    fun emailValidator_OnlyTopLevelDomain_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(".ru"))
    }

    @Test
    fun emailValidator_OnlyDogSymbolWithDomain_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@mail"))
    }

    @Test
    fun emailValidator_OnlyName_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name"))
    }

    @Test
    fun emailValidator_UnusedSymbols_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name/mail.ru"))
    }
}
