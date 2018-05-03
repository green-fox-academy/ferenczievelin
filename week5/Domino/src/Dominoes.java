import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        List <Domino> sorted = sortDominoes(dominoes);

        System.out.println(dominoes);
        System.out.println(sorted);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
    static List<Domino> sortDominoes (List<Domino>dominoes) {
        List <Domino> sorted = new ArrayList<>();
        int elementsOfSorted = 1;
        sorted.add(dominoes.get(0));
        dominoes.remove(dominoes.get(0));

        for (int i = 0; i <dominoes.size() ; i++) {
            if (dominoes.get(i).getValues()[0] == (sorted.get(elementsOfSorted-1).getValues()[1])) {
                sorted.add(dominoes.get(i));
                dominoes.remove(i);
                elementsOfSorted++;
            }
            else if (dominoes.get(i).getValues()[1] == (sorted.get(elementsOfSorted-1).getValues()[1])) {
                int [] flip = new int[2];
                flip = new int[]{dominoes.get(i).getValues()[1], dominoes.get(i).getValues()[0]};
                
            }
        }
        return sorted;
    }
    
    
}