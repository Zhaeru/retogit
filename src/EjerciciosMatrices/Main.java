package EjerciciosMatrices;

public class Main {


    public static void main(String[] args) {


        int[][] matriz1 =  {{1, 2, 3},
                            {2, 5, 6},
                            {3, 6, 9}};

        int[][] matriz2 =  {{1, 2, 3},
                            {2, 5, 6},
                            {3, 6, 9}};
        boolean simetria = true;

        if (matriz1.length == matriz2.length) {
            for (int i = 0; i < matriz1.length; i++) {
                if (simetria) {
                    for (int j = 0; j < matriz1[i].length; j++) {
                        if (matriz1[j].length == matriz2[j].length) {
                            if (matriz1[i][j] != matriz2[i][j]) {
                                simetria = false;
                                break;
                            }
                        } else {
                            simetria = false;
                            break;
                        }
                    }
                } else {

                    break;
                }
            }

        } else {
            simetria = false;


        }System.out.println(simetria);


    }
}
