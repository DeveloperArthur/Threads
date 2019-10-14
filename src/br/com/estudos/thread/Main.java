package br.com.estudos.thread;

public class Main {
    
    public static void main(String[] args) {
        Tarefas tarefa1 = new Tarefas();
        TarefaDemorada tarefaDemorada1 = new TarefaDemorada();
        
        Thread thread1 = new Thread(tarefa1);
        Thread thread2 = new Thread(tarefaDemorada1);
        
        thread1.start();
        thread2.start();
    }
    
}