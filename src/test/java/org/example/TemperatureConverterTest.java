package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

        @Test
        void testCelsiusToFahrenheit() {
            Assertions.assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0));
            Assertions.assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100));
            Assertions.assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37));
        }

        @Test
        void testFahrenheitToCelsius() {
            Assertions.assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32));
            Assertions.assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212));
            Assertions.assertEquals(37, TemperatureConverter.fahrenheitToCelsius(98.6));
            Assertions.assertEquals(37.777, TemperatureConverter.fahrenheitToCelsius(100), 0.01);
        }

        @Test
        void testIsExtremeTemperature() {
            Assertions.assertFalse(TemperatureConverter.isExtremeTemperature(-40));
            Assertions.assertTrue(TemperatureConverter.isExtremeTemperature(-41));
            Assertions.assertFalse(TemperatureConverter.isExtremeTemperature(50));
            Assertions.assertTrue(TemperatureConverter.isExtremeTemperature(51));
            Assertions.assertFalse(TemperatureConverter.isExtremeTemperature(-39));
            Assertions.assertFalse(TemperatureConverter.isExtremeTemperature(49));
        }

        @Test
        void testKelvinToFah() {
            Assertions.assertEquals(59, TemperatureConverter.kelvinToFah(300.1));
        }

}