class MyThread extends Thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t1 = new MyThread();
		System.out.println(t1.getName());
		Thread.currentThread().setName("Mr. Prashant");
		System.out.println(Thread.currentThread().getName());
	}
}