package com.lecture3;

/**
 * Created by ���� on 07.10.2015.
 */
public class BlaBlaCarApp {

    public static void main(String[] args) {

        Ride[] rides = new Ride[5];
        rides[0] = new Ride(120, 0, 20, "���������");
        rides[1] = new Ride(100, 0, 22, "�����");
        rides[2] = new Ride(110, 1, 8, "������");
        rides[3] = new Ride(115, 1, 12, "���������");
        rides[4] = new Ride(95,  2, 10, "�����");

        rides[2].changeCarModel("Porsche Cayenne");
        rides[2].changePrice(250);

        // ������� �� ����������
        for (int i = 0; i < rides.length; i++) {
            System.out.println(rides[i]);
        }

    }

}