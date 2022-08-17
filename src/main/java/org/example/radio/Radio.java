package org.example.radio;

public class Radio {

    private int numberCurrentStation;
    private int soundVolume;

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
        if (newNumberCurrentStation > 9) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    public void next() {
        if (numberCurrentStation == 9) {
            numberCurrentStation = 0;
        } else {
            numberCurrentStation = numberCurrentStation + 1;
        }
    }

    public void prev() {
        if (numberCurrentStation == 0) {
            numberCurrentStation = 9;
        } else {
            numberCurrentStation = numberCurrentStation - 1;
        }
    }

    public void increaseVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

    public void setToMaxVolume() {
        soundVolume = 10;
    }
}