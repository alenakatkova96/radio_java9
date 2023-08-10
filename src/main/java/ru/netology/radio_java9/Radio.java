package ru.netology.radio_java9;

public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        //if (currentStation >= 0 && currentStation <= 9) {
        //this.currentStation = currentStation;
        //}
        //}
        if (currentStation < 0) {
            this.currentStation = 9;
        } else if (currentStation > 9) {
            this.currentStation = 0;
        } else {
            this.currentStation = currentStation;
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

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
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

