package br.com.estudos.thread;

import java.time.LocalDateTime;
import java.util.concurrent.locks.LockSupport;

public class Tarefas implements Runnable{

    @Override
    public void run() {
        System.out.println("Iniciando uma thread às ..."+LocalDateTime.now());
        LockSupport.parkNanos(3000000000L);
        System.out.println("Finalizando a thread de 3s às "+LocalDateTime.now());
    }
}