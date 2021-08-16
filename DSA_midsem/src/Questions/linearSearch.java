package Questions;

public class linearSearch {

    public int search(int[] numbs, int value) {

        for (int i = 0; i < numbs.length; i++) {
            if (i == value) {
                return (numbs[i]);
            }
        }
        return value;
    }

    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[]{25, 13, 58, 44, 50, 68};

        linearSearch run = new linearSearch();
        run.search(numbers, 4);

        removeRandomElement removeRandomElement = new removeRandomElement();
        removeRandomElement.remove(numbers);


    }
}
