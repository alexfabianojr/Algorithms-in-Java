package algorithms.workout;

public class BubbleSort {
    public static void main(String[] args) {
        var valores = new int[]{21, 11, 44, 2, 12, 2, 9, 10, 15, 1, 100};
        asc(valores);
        desc(valores);
    }

    private static void desc(int[] valores) {
        /**
         * {3, 4, 5}
         * pego o 3 na posição inicial e procuro alguém maior que ele a partir da posição inicial + 1
         * Caso encontre eu armazeno o 3 na variavel temporaria, coloco o maior na posição do 3
         * e o 3 na posição antiga do outro (j) e continua o loop [...]
         * */
        for (int i = 0; i < valores.length; i++) {
            var temp = 0;
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[j] > valores[i]) {
                    temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
        print(valores, "desc");
    }

    private static void print(int[] valores, String ordem) {
        System.out.println(ordem);
        for (int valor : valores) {
            System.out.println(valor);
        }
        System.out.println("----");
    }

    private static void asc(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            var temp = 0;
            for (int j = i + 0; j < valores.length; j++) {
                if (valores[j] < valores[i]) {
                    temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
        print(valores, "asc");
    }
}
