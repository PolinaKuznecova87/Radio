package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldNextMax() {
        Radio work = new Radio();
        work.setCurrentRadioStation(9);
        work.Next();
        int expected = 0;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMin() {
        Radio work = new Radio();
        work.setCurrentRadioStation(0);
        work.Next();
        int expected = 1;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMidium() {
        Radio work = new Radio();
        work.setCurrentRadioStation(5);
        work.Next();
        int expected = 6;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMax() {
        Radio work = new Radio();
        work.setCurrentRadioStation(9);
        work.Prev();
        int expected = 8;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMin() {
        Radio work = new Radio();
        work.setCurrentRadioStation(0);
        work.Prev();

        int expected = 9;
        int actual = work.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMedium() {
        Radio work = new Radio();
        work.setCurrentRadioStation(5);
        work.Prev();
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
    public void shouldCurrentMaxVolume() {
        Radio work = new Radio();
        work.setCurrentVolume(10);
        work.VolumeMax();
        int expected = 0;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMinVolume() {
        Radio work = new Radio();
        work.setCurrentVolume(0);
        work.VolumeMax();
        int expected = 1;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMidlVolume() {
        Radio work = new Radio();
        work.setCurrentVolume(5);
        work.VolumeMax();
        int expected = 6;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMinimumVolume() {
        Radio work = new Radio();
        work.setCurrentVolume(0);
        work.VolumeMin();
        int expected = 10;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMediumVolume() {
        Radio work = new Radio();
        work.setCurrentVolume(5);
        work.VolumeMin();
        int expected = 4;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMaximumVolume() {
        Radio work = new Radio();
        work.setCurrentVolume(10);
        work.VolumeMin();
        int expected = 9;
        int actual = work.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
