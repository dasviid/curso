

public class OperadoresIncrementales {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i; // preincremento, primero se aumenta la variable i= i+1, y depues se lo guarda en la variable j
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++; // postincremento, primero le asigno el valor de i a j, y depsues le sumo 1 a i
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 3;
        System.out.println("inicial de i = " + i);
        j = --i;    //predecremento, primero le resto 1 a i y despues se lo asigno a j
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 4;
        System.out.println("inicial de i = " + i);
        j = i--;   //postdecremento, primero le asigno i a j y despues le resto uno a i
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }
}
