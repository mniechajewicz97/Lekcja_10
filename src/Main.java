void main() {

    Bird kawka = new Bird("Kawka", 2025, 10);
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
    Gasoline audi = new Gasoline("Audi", 2006);
    Gasoline bmw = new Gasoline("BMW", 2002);
    Electric tesla = new Electric("Tesla", 2025);
    Hybrid hyundai = new Hybrid("Hyundai", 2025);
    Hybrid skoda = new Hybrid("Skoda", 2020);
    List<Vehicle> cars = new ArrayList<>();

    cars.add(audi);
    cars.add(tesla);
    cars.add(hyundai);
    cars.add(bmw);
    cars.add(skoda);

    for (Vehicle vehicle : cars) {
        System.out.println(vehicle);
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

    Developer developer = new Developer("Bożydar Ropniak", 20000);
    Intern intern = new Intern("Izydor Wągier", 25);
    Manager manager = new Manager("Wacław Waligóra", 25000);

    List<Employee> employees = new ArrayList<>();
    employees.add(developer);
    employees.add(manager);
    employees.add(intern);


    for (Employee employee : employees) {
        System.out.println(employee);
    }
    List<BonusEligible> bonusList = new ArrayList<>();
    bonusList.add(developer);
    bonusList.add(manager);

    for (BonusEligible employee : bonusList) {
        System.out.println(employee.calculateBonus());
    }
    List<Reportable> reportableList = new ArrayList<>();
    reportableList.add(manager);
    reportableList.add(intern);

    for (Reportable employee : reportableList) {
        System.out.println(employee.report());
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
        savable.save("Plik");
    }
    System.out.println();
    List<Printable> printableList = new ArrayList<>();
    printableList.add(invoice);
    printableList.add(note);
    for (Printable printable : printableList) {
        printable.print();
}
    System.out.println();
    System.out.println("Zadanie 4 z inerfejsów");
    System.out.println();
//Zadanie 4 — Pliki: czytanie, pisanie, kompresja
//
//
//Stwórz program z plikami.
//
//Wymagania:
//
//Zrób abstrakcyjną klasę FileResource z nazwą pliku i metodą zwracającą opis.
//Zrób 3 typy plików dziedziczące po FileResource: TextFile, ReadOnlyFile, ZipArchive.
//Zrób interfejs Readable (metoda read()), Writable (metoda write(String text)), Compressible (metoda compress()).
//TextFile ma implementować Readable, Writable i Compressible (wszystkie trzy).
//ReadOnlyFile ma implementować tylko Readable.
//ZipArchive ma implementować Readable i Compressible.
//W main utwórz listę wszystkich plików i wypisz opisy, a potem osobno przetestuj czytanie (lista Readable),
// pisanie (lista Writable) i kompresję (lista Compressible) w pętli.

    TextFile textFile = new TextFile("TextFile");
    ReadOnlyFile readOnlyFile = new ReadOnlyFile("Reader");
    ZipArchive zipArchive = new ZipArchive("ZipArchive");

    List<FileResource> fileResourceList = new ArrayList<>();
    fileResourceList.add(textFile);
    fileResourceList.add(readOnlyFile);
    fileResourceList.add(zipArchive);

    for (FileResource fileResource : fileResourceList) {
        System.out.println(fileResource);
    }

    System.out.println();
    List<Readable> readableList = new ArrayList<>();
    readableList.add(readOnlyFile);
    readableList.add(zipArchive);
    readableList.add(textFile);

    for (Readable readable : readableList) {
        System.out.println(readable.read());
    }
    System.out.println();

    List<Writable> writableList = new ArrayList<>();
    writableList.add(textFile);
    for (Writable writable : writableList) {
        System.out.println(writable.write("I can write like a dog"));

    }
    System.out.println();

    List<Compressible> compressibleList = new ArrayList<>();
    compressibleList.add(textFile);
    compressibleList.add(zipArchive);
    for (Compressible compressible : compressibleList) {
        compressible.compress();
    }
    System.out.println();
    //Hashcode i Equals
    //2 sposoby
    // == albo .equals()
    // == porownuje referencje obiektu czyli mozna powiedziec ze sprawdza gdzie ten element jest w pamieci po HashCode
    // equals pozwala nam porownac wartosc (pola obiektu)
    System.out.println("\n");
    System.out.println("HASH CODE I EQUALS");
    String asd1 = "test";
    String asd2 = "test";
    System.out.println(asd1 == asd2);
    String asd3 = new String("test");
    System.out.println(asd1 == asd3);
    System.out.println(asd1.equals(asd3));


    Developer emp1 = new Developer("asd", 1);
    Developer emp2 = new Developer("asd", 1);

    System.out.println(emp1 == emp2); // false bo rozne obiekty i rozna referencja

    System.out.println(emp1.equals(emp2)); // true bo nadpisalismy i java wie jak je porownac
    System.out.println(emp1.hashCode() == emp2.hashCode()); // bedzie true bo nadpisalismy hashCode

    System.out.println(emp1.hashCode() + " emp1");
    System.out.println(emp2.hashCode() + " emp2");
    //ZAWSZE NADPISUJE EQUALS I HASHCODE RAZEM
    //JAK 2 OBIEKTY SA EQUALS TO MAJA TEN SAM HASHCODE ALE JAK 2 OBIEKTY MAJA TEN SAM HASHCODE TO NIE MUSZA BYC EQUALS (HASH COLISION)

}

