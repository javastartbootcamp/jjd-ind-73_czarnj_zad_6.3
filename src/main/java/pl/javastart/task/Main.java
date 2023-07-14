package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Array2dController controller = new Array2dController();
        int[][] array = controller.createArray();
        controller.showFormattedArray(array);
    }
}
