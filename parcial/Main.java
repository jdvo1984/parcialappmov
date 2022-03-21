package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner InputData = new Scanner(System.in);
        int ped=0;
        int hamburguesa=0, perro=0, salchipapas=0, chorizo=0;
        int cp;
        double vrn, dto, dto2, sub, sub2, prop, vrt;
        System.out.println("ingrese numero de presonas");
        cp = InputData.nextInt();
        for (int i=1; i<=cp; i++) {
            System.out.println("ingrese pedido persona " + i + "\n Hamburguesa (1)\n Perro (2)\n Salchipapas (3)\n Chorizo (4)");
            ped = InputData.nextInt();

            if (ped == 1) {
                hamburguesa = hamburguesa + 1;
            } else if (ped == 2) {
                perro = perro + 1;
            } else if (ped == 3) {
                salchipapas = salchipapas + 1;
            } else {
                chorizo = chorizo + 1;
            }
        }

            vrn = (hamburguesa * 10000) + (perro * 8000) + (salchipapas * 6000) + (chorizo * 7000);
            if (vrn > 20000) {
                dto = (vrn*10)/100;
            } else {
                dto = 0;

            }
            sub = vrn - dto;
            System.out.println("desea incluir la propina?  Si(1)     No(2)");
            prop = InputData.nextInt();
            if (prop == 1) {
                prop = (sub*10)/100;
            } else {
                prop = 0;
            }
            sub2 = sub + prop;
            if (hamburguesa >= 2 || perro >= 2 || salchipapas >= 2 || chorizo >= 2) {
                dto2 = (sub2*5)/100;
            } else {
                dto2=0;
            }
            vrt = sub2-dto2;
            if (vrt>20000){
            System.out.println("su total a pagar es de $: " + vrt + " recuerda que se te realiza un descuento de el 10% por commpras superiores a $20000");
        }
            else {
                System.out.println("su total a pagar es de $: " + vrt);
            }
    }
}


