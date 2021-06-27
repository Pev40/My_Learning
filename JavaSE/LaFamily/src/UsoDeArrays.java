public class UsoDeArrays {
    public static void main(String[] args) {
        String[] arr = new String[2];
        arr[0] = "Hola";
        arr[1] = "Que tal?";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int paisCiudad[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                paisCiudad[i][j] = i;
            }
        }

    imprimirMatriz(paisCiudad);



    }
    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(matriz[i][j]);
            }
            System.out.println("\n");
        }
    }
}
