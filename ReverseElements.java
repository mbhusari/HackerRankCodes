import java.util.Scanner;

public class ReverseElements {

    public static void main(String[] args) {
        int totalElement;
        int[] elementsArry;
        Scanner in = new Scanner(System.in);

        totalElement = in.nextInt();
        elementsArry = new int[totalElement];

        int index = 0;
        while(index != totalElement){
            elementsArry[index] = in.nextInt();
            index++;
        }
        int lastIndex = elementsArry.length-1;

        while(lastIndex != -1){
            System.out.print(elementsArry[lastIndex]+" ");
            lastIndex--;
        }

    }
}
