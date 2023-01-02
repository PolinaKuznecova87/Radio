package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;


    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    //int maxStation = 9;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;

    }

    public int getMinVolume() {
        return minVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public Radio(int minRadioStation, int maxRadioStation, int minVolume, int maxVolume) {
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.currentRadioStation = minRadioStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;

    }

    public Radio() {


    }


    public Radio(int size) {
        maxRadioStation = minRadioStation + size;
        maxVolume = minVolume + size;

    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {

            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;

        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void Next() {
        int radioStation = currentRadioStation + 1;
        currentRadioStation = radioStation;
        // int maxStation = 9;
        //int minStation = 0;
        if (currentRadioStation <= maxRadioStation) {
            return;
        }

        currentRadioStation = minRadioStation;


    }


    public void Prev() {

        int radioStation = currentRadioStation - 1;
        currentRadioStation = radioStation;
        //int maxStation = 9;
        //int minStation = 0;
        if (currentRadioStation >= minRadioStation) {
            return;
        }

        currentRadioStation = maxRadioStation;

    }

    public void setRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;

        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void VolumeMax() {

        int volume = currentVolume + 1;
        currentVolume = volume;

        //int maxVolume = 10;
        //int minVolume = 0;
        if (currentVolume <= maxVolume) {
            return;
        }
        currentVolume = minVolume;

    }


    public void VolumeMin() {

        int volume = currentVolume - 1;
        currentVolume = volume;
        //int maxVolume = 10;
        //int minVolume = 0;
        if (currentVolume >= minVolume) {
            return;
        }

        currentVolume = maxVolume;

    }
}

