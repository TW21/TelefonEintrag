import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Telefonliste

{
    private ArrayList<TelefonEintrag> phoneBook;

    public int size(){
        return phoneBook.size();
    }

    public Telefonliste()
    {
        this.phoneBook = new ArrayList<>();
    }

    public void clear(){
        phoneBook.clear();
    }

    public void addEntry(String name, String number) {

        TelefonEintrag neuerEintrag = new TelefonEintrag(name,number);
        phoneBook.add(neuerEintrag);


    }
    public void removeEntry(String name, String number) {

        phoneBook.removeIf(pb -> pb.getNumber().equals(number) && pb.getName().equals(name));


    }
    public boolean modifyEntry(String name, String number, String newName, String newNumber) {

        TelefonEintrag gefunden = phoneBook.stream()
                .filter(suchEintrag -> suchEintrag.getName().equals(name) && suchEintrag.getNumber().equals(number))
                .findFirst()
                .orElse(null);
        if (gefunden == null) {
            return false;
        }else {
            gefunden.setNumber(newNumber);
            gefunden.setName(newName);
            return true;
        }

    }
    public String searchByName(String name) {
       TelefonEintrag gefunden = phoneBook.stream()
                .filter(suchName -> suchName.getName().equals(name))
                .findFirst()
                .orElse(null);
       if (gefunden == null) {
           return null;
       }else {
           return gefunden.toString();
       }


    }

    public String searchNameByNumber(String number) {
        TelefonEintrag gefunden = phoneBook.stream()
                .filter(suchNummer -> suchNummer.getNumber().equals(number))
                .findFirst()
                .orElse(null);
        if (gefunden == null) {
            return null;
        }else {
            return gefunden.toString();
        }

    }

}
