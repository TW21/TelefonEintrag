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

        TelefonEintrag neuerEintrag = new TelefonEintrag(newName,newNumber);

        phoneBook.replaceAll(neuerEintrag);




    }
    public String searchByName(String name) {

    }

    public String searchNameByNumber(String number) {


    }

}
