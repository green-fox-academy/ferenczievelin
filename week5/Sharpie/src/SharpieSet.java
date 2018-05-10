
import java.util.ArrayList;

public class SharpieSet {
    ArrayList<Sharpie> sharpies;

    SharpieSet() {
        ArrayList<Sharpie> sharpies = new ArrayList<>();
    }

    public int countUsable() {
        ArrayList<Sharpie> usable = new ArrayList<>();
        for (Sharpie currentSharpie : sharpies) {
            if (currentSharpie.inkAmount > 0) {
                usable.add(currentSharpie);
            }
        }
        return usable.size();
    }

    public void removeTrash() {
        for (Sharpie currentSharpie : sharpies) {
            if (currentSharpie.inkAmount == 0) {
                sharpies.remove(currentSharpie);
            }
        }
    }
}
