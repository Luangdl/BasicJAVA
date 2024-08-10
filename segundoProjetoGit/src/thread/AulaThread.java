package thread;

import javax.swing.*;

public class AulaThread {

    public static void main(String[] args) throws InterruptedException {

        Thread threadEmail = new Thread(thread1);
        threadEmail.start();


    }
    
    private static Runnable thread1 = new Runnable() {    //utilizando o runnable eé possivel instanciar o obejto e utilizalo

        @Override
        public void run() {
                //Codigo da rotina sendo executado em paralelo:

            for (int pos = 0; pos < 10; pos ++) {

                System.out.println("Executando alguma rotina");

                try {
                    Thread.sleep(2000); //Dá um tempo
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //Executa o codigo com um tempo de parada:

            }
        }
    };

}
