package es3;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        rubrica.addContact("Mario Rossi", "1234567890");
        rubrica.addContact("Luca Bianchi", "0987654321");

        System.out.println("Cerca numero di 'Mario Rossi': " + rubrica.findNumberWithName("Mario Rossi"));
        System.out.println("Cerca nome per numero '0987654321': " + rubrica.findNameWithNumber("0987654321"));

        rubrica.writeContacts();

        rubrica.removeContact("Luca Bianchi");
        System.out.println("Dopo aver rimosso Luca Bianchi:");
        rubrica.writeContacts();
    }
}
