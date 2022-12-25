package ru.netology.radio;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNext(int newCurrentRadioStation) {


        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 9) {


            currentRadioStation = newCurrentRadioStation + 1;
        }
    }

    public void setPrev(int newCurrentRadioStation) {

        if (newCurrentRadioStation <= 0) {
            return;
        }
        if (newCurrentRadioStation <= 9) {


            currentRadioStation = newCurrentRadioStation - 1;
        }
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

    public void setVolumeMax(int newCurrentVolume) {


        if (newCurrentVolume > 10) {

            return;

        }
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;

        }
    }

    public void setVolumeMin(int newCurrentVolume) {


        if (newCurrentVolume <= 0) {

            return;

        }
        if (newCurrentVolume <= 10) {
            currentVolume = newCurrentVolume - 1;

        }
    }
}

