package Questions;
import  java.util.Random;

public class removeRandomElement {
    Random get = new Random();

    public int remove(int [] numbs){
        for (int i = 0; i < numbs.length -1; i++){
            int ranNum = get.nextInt(numbs.length);
            if (ranNum > numbs.length) {
                System.out.println("Error");
            }else if (i == ranNum){
                numbs[i] = numbs[i + 1];
            }
        }

        return 0;
    }

}
