package ru.netology.radio_java9;

public class Radio {

    private int numberOfStations;
    private int currentStation;
    private int volume;
    private int maxStationId;

    public Radio() {
        this.currentStation = 0;
        this.numberOfStations = 10;
        this.maxStationId = this.numberOfStations - 1;
        this.volume = 0;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.currentStation = 0;
        this.volume = 0;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int numberOfStations) {
        //if (currentStation >= 0 && currentStation < numberOfStations) {
        //this.currentStation = currentStation;
        //}
        //}
        if (numberOfStations < 0) {
            this.currentStation = maxStationId;
        } else if (numberOfStations > maxStationId) {
            this.currentStation = 0;
        } else {
            this.currentStation = numberOfStations;
        }
    }

    public void nextStation() {
        if (currentStation ==  numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
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

