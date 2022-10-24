package poo;

public class Coche {
    //Atributos
    String marca;
    String color;
    String Km;

    // creo un metodo
    public static void main(String[] args) {
    Coche coche1 = new Coche();
    Coche coche2 = new Coche ();

    //le doy valores a los atributos Coche1
    coche1.marca="Mercedez";
    coche1.color="Rojo";
    coche1.Km="75Km";

     //le doy valores a los atributos Coche2
     coche2.marca="Audi TT";
     coche2.color="Negro";
     coche2.Km="129Km";

    //Imprimo valores de atributos coche 1
        System.out.println("Primer Opcion: ");
        System.out.println("La marca del primer auto es "+coche1.marca);
        System.out.println("El color del primer auto es "+coche1.color);
        System.out.println("Los Km que tiene el primer auto es "+coche1.Km);
     //Imprimo valores de atributos coche 2
        System.out.println("Segunda Opcion: ");
        System.out.println("La marca del segundo auto es "+coche2.marca);
        System.out.println("El color del segundo auto es "+coche2.color);
        System.out.println("El color del primer auto es "+coche2.Km);
    }
}
//programacion orientada a objetos
//un atributo son las caracteristicas de un objeto
//un metodo son las acciones de un objeto
//una clase es un conjunto de objetos con caracteristicas familiares
//