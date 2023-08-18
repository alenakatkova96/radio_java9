package ru.netology.radio_java9;

public class Radio {

    private int currentStation;
    private int maxStation;
    private int volume;

    public Radio() {
        this.currentStation = 0;
        this.maxStation = 10;
        this.volume = 0;
    }

    public Radio(int maxStation) {
        this.currentStation = 0;
        this.maxStation = maxStation;
        this.volume = 0;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        //if (currentStation >= 0 && currentStation < maxStation) {
        //this.currentStation = currentStation;
        //}
        //}
        if (currentStation < 0) {
            this.currentStation = 9;
        } else if (currentStation > maxStation) {
            this.currentStation = 0;
        } else {
            this.currentStation = currentStation;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation - 1;
        } else {
            currentStation--;
        }
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {
        if (volume <= 0) {
            this.volume = 0;
        } else if (volume >= 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

}

