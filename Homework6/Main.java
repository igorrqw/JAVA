
//  1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//     2. Создать множество ноутбуков.
//     Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//     отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//     “Введите цифру, соответствующую необходимому критерию:
//     1 - ОЗУ
//     2 - Объем ЖД
//     3 - Операционная система
//     4 - Цвет …
//     Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//     Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

package Homework6;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop msiModern = new Laptop("C12M-239RU", 14, "FullHD", 
        true, 256, "8", "Windows", "black"); 
        Brand brandMSI = new Brand("MSI", "China");
        msiModern.addBrand(brandMSI);

        Laptop asusVivo = new Laptop("X415FA-EB013", 14, "FullHD", 
        true, 256, "8", "Windows", "grey"); 
        Brand brandAsus = new Brand("ASUS", "China");
        asusVivo.addBrand(brandAsus);

        Laptop bookHuawey = new Laptop("D16 RLEF-X", 17, "FullHD", 
        true, 512, "8", "Windows", "grey"); 
        Brand brandHuawei = new Brand("HUAWEI", "China");
        bookHuawey.addBrand(brandHuawei);

        Laptop lenovaThinkPad = new Laptop("ThinkPad T16 Gen", 17, "FullHD", 
        true, 512, "4", "Windows", "black"); 
        Brand brandLenova = new Brand("Lenova", "China");
        lenovaThinkPad.addBrand(brandLenova);

        Laptop macBookPro= new Laptop("MacBook Pro", 16, "4k", 
        true, 1024, "16", "IOS", "grey"); 
        Brand brandApple = new Brand("Apple", "USA");
        macBookPro.addBrand(brandApple);

        Laptop macBookAir= new Laptop("MacBook Air", 14, "2k", 
        true, 256, "16", "IOS", "grey"); 
        Brand brandApple1 = new Brand("Apple", "USA");
        macBookAir.addBrand(brandApple1);

        Laptop Spirit = new Laptop("Spirit", 16, "FullHD", 
        true, 256, "16", "Linux", "black"); 
        Brand brandItel = new Brand("Itel", "China");
        Spirit.addBrand(brandItel);  

        Laptop bookT1 = new Laptop("T1", 16, "FullHD", 
        true, 1024, "16", "Linux", "green"); 
        Brand brandTecno = new Brand("TECNO", "HongKong");
        bookT1.addBrand(brandTecno);  

        Laptop pavilion = new Laptop("Pavilion 15t-eg100", 16, "FullHD", 
        true, 512, "4", "Windows", "black"); 
        Brand brandHP = new Brand("HP", "China");
        pavilion.addBrand(brandHP);       

// Создание множества
        Set <Laptop> laptop = new HashSet<>();
        laptop.add(msiModern);      
        laptop.add(asusVivo);
        laptop.add(bookHuawey);
        laptop.add(lenovaThinkPad);
        laptop.add(macBookPro);
        laptop.add(macBookAir);
        laptop.add(Spirit);
        laptop.add(bookT1);
        laptop.add(pavilion);

        // создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();

// вызод метода фильтрации по заданным пользователем критериям
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}