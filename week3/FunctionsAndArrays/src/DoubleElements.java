public class DoubleElements {
    public static void main (String ... args){
        int[] ag = {3, 4, 5, 6, 7};
        for (int i = 0; i < ag.length; i++) {
            ag[i] *= 2;
        }
        for (int i = 0; i <ag.length; i++) {
            System.out.print(ag[i]+ ", ");
        }
    }
}
