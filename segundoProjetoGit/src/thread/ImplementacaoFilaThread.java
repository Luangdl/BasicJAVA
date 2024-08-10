package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha =
                            new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread) {
        pilha_filha.add(objetoFilaThread);
    }

    @Override
    public void run() {

        System.out.println("Fila rodando");

        while (true) {

            Iterator iteracao = pilha_filha.iterator();

            synchronized (iteracao) { // Bloquear o acesso a esta lista por outro processo

                while (iteracao.hasNext()) { //Enquanto conter dados na fila irá processar

                    ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

                    //processar lista desejada

                    System.out.println("-------------------------");

                    System.out.println(processar.getEmail());
                    System.out.println(processar.getNome());

                    iteracao.remove();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }

            try {
                Thread.sleep(1000);//Processou toda lista dar um tempo para limpeza de memoria
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
