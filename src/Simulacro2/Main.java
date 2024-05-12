package Simulacro2;

public class Main {

    public static void main(String[] args) {
        Main main=new Main();

        double[] temperatura = {4, 6, 2, 12, 14, 20, 12, 24, 50, 12, 20, 12};
        double[] probabilidadesLluvias = {0.3, 0.7, 0.4, 0.3, 0.5, 0.2, 0.3, 0.8, 0.4, 0.6, 0.5, 0.4};


        System.out.println("El mes mas lluvioso ha sido "+main.calendario(main.masLluvioso(probabilidadesLluvias)));

    }
        public int masLluvioso ( double[] lluvias){
            int mes = 0;
            for (int i = 1; i < lluvias.length; i++) {
                if (lluvias[i] > lluvias[mes]) {
                    mes = i;
                }

            }
            return mes;


        }
        public double mediaTemperatura ( double[] temperatura){

            double mediatemp = 0;
            for (int i = 0; i < temperatura.length; i++) {

                mediatemp = mediatemp + temperatura[i];
            }
            return mediatemp / temperatura.length;
        }

        public String calendario ( int numero ){
            String mes = "";
            switch (numero) {
                case 0:
                    mes = "Enero";
                    break;
                case 1:
                    mes = "Febrero";
                    break;
                case 3:
                    mes = "Marzo";
                    break;
                case 4:
                    mes = "Abril";
                    break;
                case 5:
                    mes = "Mayo";
                    break;
                case 6:
                    mes = "Junio";
                    break;
                case 7:
                    mes = "Julio";
                    break;
                case 8:
                    mes = "Agosto";
                    break;
                case 9:
                    mes = "Septiembre";
                    break;
                case 10:
                    mes = "Octubre";
                    break;
                case 11:
                    mes = "Noviembre";
                    break;
                case 12:
                    mes = "Diciembre";
                    break;

            }
            return mes;
        }


    }

