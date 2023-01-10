package ru.netology.radio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {
    private int id;
    private String name;

    private int currentRadioStation;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;



    public Radio(int size) {
        maxRadioStation = minRadioStation + size;
        maxVolume = minVolume + size;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;

        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
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

    public void Next() {
        int radioStation = currentRadioStation + 1;
        currentRadioStation = radioStation;
        if (currentRadioStation <= maxRadioStation) {
            return;
        }
        currentRadioStation = minRadioStation;

    }

    public void Prev() {
        int radioStation = currentRadioStation - 1;
        currentRadioStation = radioStation;
        if (currentRadioStation >= minRadioStation) {
            return;
        }
        currentRadioStation = maxRadioStation;
    }

    public void VolumeMax() {
        int volume = currentVolume + 1;
        currentVolume = volume;
        if (currentVolume <= maxVolume) {
            return;
        }
        currentVolume = minVolume;
    }

    public void VolumeMin() {
        int volume = currentVolume - 1;
        currentVolume = volume;
        if (currentVolume >= minVolume) {
            return;
        }
        currentVolume = maxVolume;

    }


}



