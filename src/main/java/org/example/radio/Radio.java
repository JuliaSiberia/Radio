package org.example.radio;

public class Radio {

    private int numberCurrentStation;
    private int soundVolume;

    public int getNumberCurrentStation() {
        return numberCurrentStation;
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


}
