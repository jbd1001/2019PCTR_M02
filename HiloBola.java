public class HiloBola implements Runnable {
	
	private Board billar;
	private Ball bola;
	
	public HiloBola(Ball bola, Board billar) {
		this.bola = bola;
		this.billar=billar;
	}

	@Override
	public void run() {
		
		try {
			while (!Thread.currentThread().isInterrupted()) {
			bola.move();
			billar.repaint();
			Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			System.err.println("El hilo se ha parado");
			
		}
		
	}
	
}
