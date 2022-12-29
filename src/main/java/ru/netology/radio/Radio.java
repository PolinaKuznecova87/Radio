package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    int maxStation = 9;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {

            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;

        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void Next() {
        int radioStation = currentRadioStation + 1;
        currentRadioStation = radioStation;
        int maxStation = 9;
        int minStation = 0;
        if (currentRadioStation <= maxStation) {
            return;
        }

        currentRadioStation = minStation;


    }


    public void Prev() {

        int radioStation = currentRadioStation - 1;
        currentRadioStation = radioStation;
        int maxStation = 9;
        int minStation = 0;
        if (currentRadioStation >= minStation) {
            return;
        }

        currentRadioStation = maxStation;

    }

    public void setRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;

        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void VolumeMax() {

        int volume = currentVolume + 1;
        currentVolume = volume;

        int maxVolume = 10;
        int minVolume = 0;
        if (currentVolume <= maxVolume) {
            return;
        }
        currentVolume = minVolume;

    }


    public void VolumeMin() {

        int volume = currentVolume - 1;
        currentVolume = volume;
        int maxVolume = 10;
        int minVolume = 0;
        if (currentVolume >= minVolume) {
            return;
        }

        currentVolume = maxVolume;

    }
}

