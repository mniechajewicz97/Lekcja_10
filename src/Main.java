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

    for (Vehicle vehicle : cars) {
        System.out.println(vehicle.toString());
    }
    System.out.println();

    List<Chargeable> chargeableList = new ArrayList<>();
    chargeableList.add(tesla);
    chargeableList.add(hyundai);
    chargeableList.add(skoda);
    for (Chargeable vehicle : chargeableList) {
        vehicle.charge();
    }
    System.out.println();

    List<Refuelable> refuelableList = new ArrayList<>();
    refuelableList.add(audi);
    refuelableList.add(hyundai);
    refuelableList.add(skoda);
    refuelableList.add(bmw);
    for (Refuelable vehicle : refuelableList) {
        vehicle.refuel();
    }
    //Zadanie 2 — Pracownicy i role (interfejsy jako “zdolności”)
    //Stwórz program z pracownikami.
    //
    //Wymagania:
    //
    //Zrób abstrakcyjną klasę Employee z imieniem i podstawową pensją oraz metodą zwracającą opis pracownika.
    //Zrób 3 typy pracowników dziedziczące po Employee: Developer, Manager, Intern.
    //Zrób interfejs BonusEligible (ma metodę liczącą bonus) i interfejs Reportable (ma metodę zwracającą raport tekstowy).
    //Developer ma być BonusEligible.
    //Manager ma być BonusEligible i Reportable (implementuje oba).
    //Intern ma być tylko Reportable.
    //W main utwórz listę wszystkich pracowników i wypisz opisy, a potem osobno przetestuj bonusy (lista BonusEligible) i raporty (lista Reportable) w pętli.

    System.out.println();

    Developer developer = new Developer("Bożydar Ropniak",20000);
    Intern intern = new Intern("Izydor Wągier",25);
    Manager manager = new Manager("Wacław Waligóra", 25000);

    List<Employee> employees = new ArrayList<>();
    employees.add(developer);
    employees.add(manager);
    employees.add(intern);


    for  (Employee employee : employees) {
        System.out.println(employee.toString());
    }
    List<BonusEligible> bonusList = new ArrayList<>();
    bonusList.add(developer);
    bonusList.add(manager);

    for (BonusEligible employee : bonusList) {
        System.out.println(employee.calculateBonus());
    }
    List <Reportable> reportableList = new ArrayList<>();
    reportableList.add(manager);
    reportableList.add(intern);

    for (Reportable employee : reportableList) {
        employee.report();
    }
    System.out.println();
    System.out.println("Zadanie 3 z interfejsów");
    System.out.println();
//Zadanie 3 — Dokumenty: drukowanie i zapisywanie
//
//
//Stwórz program z dokumentami.
//
//Wymagania:
//
//Zrób abstrakcyjną klasę Document z tytułem oraz metodą, która zwraca treść dokumentu (abstrakcyjna).
//Zrób 3 typy dokumentów dziedziczące po Document: Invoice, Note, Contract.
//Zrób interfejs Printable (metoda print() zwraca tekst do wydruku) i interfejs Savable (metoda save(String fileName)
// – na razie może tylko wypisywać w konsoli, że “zapisano”).
//Invoice ma być Printable i Savable.
//Note ma być tylko Printable.
//Contract ma być tylko Savable.
//W main utwórz listę dokumentów i wypisz ich treść, a potem osobno przetestuj drukowanie (lista Printable) i zapisywanie (lista Savable) w pętli.

Invoice invoice = new Invoice("Travel Invoice");
Contract contract = new Contract("Job Contract");
Note note = new Note("Java Notebook");

List<Document> documentsList = new ArrayList<>();
documentsList.add(invoice);
documentsList.add(contract);
documentsList.add(note);

for (Document document : documentsList) {
    document.documentsDetails();
}
    System.out.println();
List<Savable> savableList = new ArrayList<>();
savableList.add(invoice);
savableList.add(contract);
for (Savable savable : savableList) {
    savable.save();
}
System.out.println();
List<Printable> printableList = new ArrayList<>();
printableList.add(invoice);
printableList.add(note);
for (Printable printable : printableList)
    printable.print();




    }

