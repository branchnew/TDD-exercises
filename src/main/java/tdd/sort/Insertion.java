package tdd.sort;

class Insertion {

    int[] sort(int[] array) {
        int x, j;

        for (int i = 1; i < array.length; i++) {
            x = array[i];
            for (j = i-1; j >= 0 && array[j] > x; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = x;
        }
        return array;
    }
}