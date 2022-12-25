package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentRadioStation() {
        Radio work = new Radio();
        work.currentRadioStation = 2;
        int expected = 2;
        int actual = work.currentRadioStation;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shoujdSetCurrentRadioVolume() {
        Radio work = new Radio();
        work.currentVolume = 5;
        int expected = 5;
        int actual = work.currentVolume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentMaxRadioStation() {
        Radio work = new Radio();
        work.setNext(9);
        int expected = 0;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentАverageRadioStation() {
        Radio work = new Radio();
        work.setNext(4);
        int expected = 5;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentOneRadioStation() {
        Radio work = new Radio();
        work.setNext(1);
        int expected = 2;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMinRadioStation() {
        Radio work = new Radio();
        work.setNext(0);
        int expected = 1;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMaximumRadioStation() {
        Radio work = new Radio();
        work.setPrev(9);
        int expected = 8;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMinimumRadioStation() {
        Radio work = new Radio();
        work.setPrev(1);
        int expected = 0;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMidelRadioStation() {
        Radio work = new Radio();
        work.setPrev(5);
        int expected = 4;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNamberRadioStation() {
        Radio work = new Radio();
        work.setRadioStation(5);
        int expected = 5;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNamberMaxRadioStation() {
        Radio work = new Radio();
        work.setRadioStation(9);
        int expected = 9;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNamberMinRadioStation() {
        Radio work = new Radio();
        work.setRadioStation(0);
        int expected = 0;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMaxVolume() {
        Radio work = new Radio();
        work.setVolumeMax(11);
        int expected = 0;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMinVolume() {
        Radio work = new Radio();
        work.setVolumeMax(0);
        int expected = 1;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMidlVolume() {
        Radio work = new Radio();
        work.setVolumeMax(5);
        int expected = 6;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMinimumVolume() {
        Radio work = new Radio();
        work.setVolumeMin(0);
        int expected = 0;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMediumVolume() {
        Radio work = new Radio();
        work.setVolumeMin(5);
        int expected = 4;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMaximumVolume() {
        Radio work = new Radio();
        work.setVolumeMin(11);
        int expected = 0;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
