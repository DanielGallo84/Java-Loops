
package loops;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<String> loop(int n) {
        List<String> tabla = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            String linea = n + " x " + i + " = " + resultado;
            tabla.add(linea);
        }
        return tabla;
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> tabla = loop(n);
        for (String linea : tabla) {
            System.out.println(linea);
        }
    }
}
