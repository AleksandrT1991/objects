package ru.skypro;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        Author tolstoy = new Author("���", "�������");
        System.out.println("����� �����" + " " + tolstoy.getAuthorName());
        Book voinaImir = new Book("����� � ���", tolstoy, 1867);
        System.out.println("��� ���������� ��� = " + voinaImir.getPublishingYear());
        voinaImir.setPublishingYear(2022);
        System.out.println("��� ���������� ���� = " + voinaImir.getPublishingYear());
        System.out.println(voinaImir.getBookName() + " " + voinaImir.getPublishingYear());

        System.out.println();
        Author pushkin = new Author("���������", "������");
        System.out.println("����� �����" + " " + pushkin.getAuthorName());
        Book ruslanIlyudmila = new Book("������ � �������", pushkin, 1820);
        System.out.println(ruslanIlyudmila.getBookName() + " " + ruslanIlyudmila.getPublishingYear());
        System.out.println("��� ���������� ��� = " + ruslanIlyudmila.getPublishingYear());
        ruslanIlyudmila.setPublishingYear(2022);
        System.out.println("��� ���������� ���� = " + ruslanIlyudmila.getPublishingYear());

    }
}
