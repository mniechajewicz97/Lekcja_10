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
//zad 1 Stwórz program z pojazdami.
//
//Wymagania:
//
//Zrób klasę bazową Vehicle (abstrakcyjną) z nazwą/marką i metodą, która zwraca opis pojazdu.
//Zrób 3 pojazdy dziedziczące po Vehicle: elektryczny, spalinowy i hybrydowy.
//Zrób interfejs Chargeable (ładowanie) i interfejs Refuelable (tankowanie).
//Pojazd elektryczny ma umieć ładować.
//Pojazd spalinowy ma umieć tankować.
//Pojazd hybrydowy ma umieć ładować i tankować.
//W main utwórz listę wszystkich pojazdów i wypisz ich opisy,
// a potem osobno przetestuj ładowanie (lista Chargeable) i tankowanie (lista Refuelable) w pętli.

    System.out.println("----------------------------------");
    System.out.println("Zadanie 1 z interfejsów");
    System.out.println();
    Gasoline audi = new Gasoline("Audi",2006);
    Gasoline bmw = new Gasoline("BMW",2002);
    Electric tesla = new Electric("Tesla",2025);
    Hybrid hyundai = new Hybrid("Hyundai",2025);
    Hybrid skoda = new Hybrid("Skoda",2020);
    List<Vehicle> cars = new ArrayList<>();

    cars.add(audi);
    cars.add(tesla);
    cars.add(hyundai);
    cars.add(bmw);
    cars.add(skoda);

    for (Vehicle vehicle : cars)
        System.out.println(vehicle.toString());
    System.out.println();

    List<Vehicle> chargeableList = new ArrayList<>();
    chargeableList.add(tesla);
    chargeableList.add(hyundai);
    chargeableList.add(skoda);
    for (Vehicle vehicle : chargeableList)
        vehicle.charge();
    System.out.println();

    List<Vehicle> refuelableList = new ArrayList<>();
    refuelableList.add(audi);
    refuelableList.add(hyundai);
    refuelableList.add(skoda);
    refuelableList.add(bmw);
    for (Vehicle vehicle : refuelableList)
        vehicle.refuel();








    }

