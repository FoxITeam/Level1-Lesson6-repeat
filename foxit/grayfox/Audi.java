package ru.foxit.grayfox;

import ru.foxygame.tralyalya.Car;

public class Audi extends Machine{

    // По умолчанию в классах наследниках при вызове конструктора так же вызывается конструктор суперкласса или родительского класса
    // super(); запись вызывается не явно! Но если мы переопределили конструктор, то конструктор по умолчанию, который записан без параметров
    // его как бы не видно, он удаляется и теперь в классе только 1 конструктор, П о этой причине теперь класс ауди должен вызвать
    // конструктор супер класса, а потом может сделать что то свое!
    // Но свое пока нам не нужно делать, по этому мы вызываем super и передаем туда параметры модель, цвет и год.
    // А this.model = model; this.color = color; this.year = year; нам уже не нужно!
    // То есть если мы хотим наследоваться от конструктора родителя и мы наследуемся от главного класса, используем super();
    // Superom ты передаешь аргументы в супер класс!
    // Убираем все this, так как у нас нету в этом классе переменных, мы уже наследуемся от того констуктора.
    // И геттеры и сеттеры нам тоже не нужны, потому что у нас есть главный класс где есть и сеттеры и геттеры публичные.
    // Вызывается super в случае, если у нас не дефолдный конструктор, а если дефолдный, то супер не нужен. Всегда вызываем супер, если наследуемся от
    // не стандартного конструктора.
    //
    public Audi(String model, String color, int year) {
        super(model, color, year);
//        this.model = model;
//        this.color = color;
//        this.year = year;
    }

    public void speedDrive(){
        System.out.println("Быстро ехать!");
    }

//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
}
