package es3;

import java.util.HashMap;
import java.util.Map.Entry;

public class RubricaTelefonica {

    private HashMap<String, String> rubrica;

    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }

    public void addContact(String nome, String telefono) {
        rubrica.put(nome, telefono);
    }

    public void removeContact(String nome) {
        rubrica.remove(nome);
    }

    public String findNameWithNumber(String numero) {
        for (Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numero)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findNumberWithName(String nome) {
        return rubrica.get(nome);
    }

    public void writeContacts() {
        for (Entry<String, String> entry : rubrica.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }
}
