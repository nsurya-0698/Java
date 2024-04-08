package com.learn.java.Threads;



class WorkerA extends Thread{
	
	public void run() {
		for (int i =1 ; i<= 10;i++) {
			System.out.println("Worker A");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class WorkerB extends Thread{
	public void run() {
		for (int i=1; i<= 100; ++i) {
			System.out.println("Worker B");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class WorkerC implements Runnable{
	public void run(){
		for (int i=1; i<=10; ++i) {
			System.out.println("========>worker C");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Muiltiple_threads {
	public static void main(String[] args) {
		WorkerA A = new WorkerA();
		WorkerB B = new WorkerB();
		
		Runnable C = new WorkerC();
		
		Thread thread = new Thread(C);
		
		A.start();
		B.start();
		
		thread.start();
	}
	



}
