package br.com.estudos.thread;

import java.time.LocalDateTime;
import java.util.concurrent.locks.LockSupport;
import java.time.LocalDateTime;
import java.util.concurrent.locks.LockSupport;

public class TarefaDemorada implements Runnable{

    @Override
    public void run() {
        System.out.println("Tarefa demorada iniciada às "+LocalDateTime.now());
        LockSupport.parkNanos(10000000000L);
        System.out.println("Tarefa demorada concluída às "+LocalDateTime.now());
    }
}