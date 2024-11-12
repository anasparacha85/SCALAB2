package javaLabs;

public class Anasscalab4quest1 extends Thread {
	public void run() {
		System.out.println("task one");
	}
	public static void main(String [] args) {
		Anasscalab4quest1 t1=new Anasscalab4quest1();
		Anasscalab4quest1 t2=new Anasscalab4quest1();
		Anasscalab4quest1 t3=new Anasscalab4quest1();
		t1.start();
		t2.start();
		t3.start();
	}

}
