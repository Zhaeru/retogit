package Sesionexperiencial.Arrays;

import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

public class Main {


                public static void main(String[] args) {
                        Main mainEntreno2= new Main();
                        double[] datos = mainEntreno2.pedirDatos();
                        boolean aviso = mainEntreno2.comprobarHipoteca(datos[0], datos[1]);
                        if (aviso){
                                System.out.println("No se puede conceder esta hipoteca");
                        } else {
                                mainEntreno2.mostrarCuadro(datos);
                        }
                }

                private void mostrarCuadro(double[] datos){
                        double hipoteca = datos[0];
                        double anios = datos[1];
                        double interes = datos[2];
                        double total = hipoteca + (hipoteca*(interes/100));
                        double cuotaMes = total/(anios*12);
                        for (int i = 0; i < anios*12; i++) {
                                System.out.printf("Mes %d couta %.2f%n",i,cuotaMes);
                        }
                }

                private boolean comprobarHipoteca(double hipoteca, double anios){
                        return hipoteca>500000 & anios>40;
                }

                private double[] pedirDatos(){
                        Scanner scanner = new Scanner(System.in);
                        int hipoteca=0, anio=0;
                        double interes=0;

                        System.out.println("Indica que cantidad de hipoteca quieres pedir");
                        hipoteca = scanner.nextInt();
                        System.out.println("Indica qa cuantos años la vas a devolver");
                        anio = scanner.nextInt();
                        System.out.println("Indica con que interés lo vas a devolver");
                        interes = scanner.nextInt();
                        return new double[]{hipoteca, anio, interes};
                }


        }


