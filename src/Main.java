void main() {

Bird kawka = new Bird("Kawka",2025, 10);
kawka.makeSound();
//Nie mozemy stowrzyc instancjintej klasy bo jest abstrakcyjna co broni nas przed blednymi instancjami ktore nie maja sensu
//Animal animal = new Animal("dupa", 2025);
    //klasa abstrakcyjna
    //zawiera metody i pola ktore klasy potomne rownie zmusza zawierac, nie musi miec impl. metody
    //moze ja zaimplementowac klasa dziedziczaca

    Pigeon pigeon = new Pigeon();
    Duck duck = new Duck();

    duck.fly();
    duck.swim();

    pigeon.fly();


    //Hashcode i Equals

    String asd1 = "test"; //23123123
    String asd2 = "test";

    System.out.println(asd1 == asd2);
    System.out.println(asd1 == new String("test")); //6432545





    }

