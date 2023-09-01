package ru.netology.radio_java9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {
    @Test
    public void testGetCurrentStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationNegativeValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationInvalid() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(3);
        radio.nextStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testNextStationLoop() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(4);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(2);
        radio.prevStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationLoop() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testGetVolume() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetVolumeWithValidValue() {
        Radio radio = new Radio();
        radio.setVolume(50);
        Assertions.assertEquals(50, radio.getVolume());
    }

    @Test
    public void testSetVolumeWithNegativeValue() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetVolumeWithTooLargeValue() {
        Radio radio = new Radio();
        radio.setVolume(101);
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void testSetVolumeWithLowerBoundaryValue() {
        Radio radio = new Radio();
        radio.setVolume(0);
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetVolumeWithUpperBoundaryValue() {
        Radio radio = new Radio();
        radio.setVolume(100);
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void setVolume_InvalidValue_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(150);
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getVolume());
    }

    @Test
    public void testIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.decreaseVolume();
        Assertions.assertEquals(49, radio.getVolume());
    }

    @Test
    public void testDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }
}

