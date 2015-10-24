package com.lecture3;

/**
 * Created by ���� on 07.10.2015.
 */
public class Ride {
    int price;
    int day;
    int hour;
    String name;
    String cityFrom;
    String cityTo;
    String carModel;

    public Ride(int price, int day, int hour, String name) {
        this.price = price;
        this.day = day;
        this.hour = hour;
        this.name = name;

        this.cityFrom = "�������";
        this.cityTo = "����";
        this.carModel = "Citroen C4";
    }

    public void changeCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void changePrice(int newPrice) {
        this.price = newPrice;
    }

    public String toString() {
        return String.format(
                "%s-%s, %3d �������, ��� ����: %10s, ���� ����� %d ��� � %2d:00. ���������: %s",
                this.cityFrom, this.cityTo,
                this.price, this.name, this.day, this.hour, this.carModel
        );
    }

}