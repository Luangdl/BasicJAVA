package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

    public static void main(String[] args) {
        String texto = "alex, curso Java, 80, 70, 60";

        String[] valoresArray = texto.split(",");

        System.out.println(valoresArray[0]);
        System.out.println(valoresArray[1]);
        System.out.println(valoresArray[2]);
        System.out.println(valoresArray[3]);
        System.out.println(valoresArray[4]);


        //convertendo um array em uma lista
        List<String> list = Arrays.asList(valoresArray);

        for (String valorString: list) {
            System.out.println(valorString);
        }

        //converter uma lista para Array

        String[] conversaoArray = list.toArray(new String[5]);

        for (int pos = 0; pos < conversaoArray.length; pos ++ ) {
            System.out.println(conversaoArray[pos]);
        }

    }


}
