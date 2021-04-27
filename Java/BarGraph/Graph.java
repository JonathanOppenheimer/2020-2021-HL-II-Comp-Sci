import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel {
    int[] graphValues = new int[30];
    int[] bubbleSortValues = new int[30];
    int[] linearSortValues = new int[30];

    int linearMax = graphValues.length - 1;
    int maxLength = 0;

    public Graph() {
        setFocusable(true);
        //for loop filling in the array
        for (int i = 0; i < graphValues.length; i++) {
            int temp = (int)(Math.random() * 100);
            graphValues[i] = temp;
            bubbleSortValues[i] = temp;
            linearSortValues[i] = temp;
        }
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, 600, 600);
        for (int i = 0; i < graphValues.length; i++) {
            g2.setColor(Color.RED);
            g2.fillRect((15 * i), 100 - graphValues[i], 10, graphValues[i]);
        }
        for (int i = 0; i < graphValues.length; i++) {
            g2.setColor(Color.RED);
            g2.fillRect((15 * i), 250 - bubbleSortValues[i], 10, bubbleSortValues[i]);
        }
        for (int i = 0; i < graphValues.length; i++) {
            g2.setColor(Color.RED);
            g2.fillRect((15 * i), 400 - linearSortValues[i], 10, linearSortValues[i]);
        }
    }
    public void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < maxLength; i++) {
            for (int j = 1; j < (maxLength - i); j++) {
                if (bubbleSortValues[j - 1] > bubbleSortValues[j]) {
                    temp = bubbleSortValues[j - 1];
                    bubbleSortValues[j - 1] = bubbleSortValues[j];
                    bubbleSortValues[j] = temp;
                }
            }
        }
       if(maxLength < bubbleSortValues.length)
       {
         maxLength++; 
       }
    }
    public void linearSort() {
        int tempMax = 0;
        int tempMaxLocation = 0;
        int tempLastValue = linearSortValues[linearMax];
        for (int i = linearMax; i >= 0; i--) {
            if (linearSortValues[i] > tempMax) {
                tempMax = linearSortValues[i];
                tempMaxLocation = i;
            }
        }
        linearSortValues[linearMax] = tempMax;
        linearSortValues[tempMaxLocation] = tempLastValue;
        if (linearMax > 0) {
            linearMax--;
        }
    }
}