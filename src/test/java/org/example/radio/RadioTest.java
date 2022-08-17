package org.example.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationAboveLimit() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(11);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowLimit() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(-1);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheNextStationOnTheBorder() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetThePrevStationOnTheBorder() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheNextStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(1);
        radio.next();

        int expected = 2;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetThePrevStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(7);
        radio.prev();

        int expected = 6;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLower() {
        Radio radio = new Radio();

        radio.setToMaxVolume();
        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheVolumeUp() {
        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLowerTheBorder() {
        Radio radio = new Radio();

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheVolumeUpTheBorder() {
        Radio radio = new Radio();

        radio.setToMaxVolume();
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
