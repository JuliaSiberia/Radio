package org.example.radio;

public class Radio {

    private int numberCurrentStation;
    private int soundVolume;
    private int amountStation;

    public Radio() {
        amountStation = 10;
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < 0) {
            return;
        }
        if (newNumberCurrentStation > amountStation - 1) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    public void next() {
        if (numberCurrentStation == amountStation - 1) {
            numberCurrentStation = 0;
        } else {
            numberCurrentStation = numberCurrentStation + 1;
        }
    }

    public void prev() {
        if (numberCurrentStation == 0) {
            numberCurrentStation = amountStation - 1;
        } else {
            numberCurrentStation = numberCurrentStation - 1;
        }
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

    public void setToMaxVolume() {
        soundVolume = 100;
    }
}