import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		device(new Television());
		
	}

	private static void device(Television television) throws InterruptedException {
		ControleRemoto cr = new ControleRemoto(television);
		
		while(true) {
			
			System.out.println("--------- Menu ------------");
			System.out.println("[1] Ligar/Desligar:");
			System.out.println("[2] Aumentar o Volume:");
			System.out.println("[3] Diminuir o Volume:");
			System.out.println("[4] Subir Canal:");
			System.out.println("[5] Descer Canal:");
			System.out.println("[6] Fechar:");
			int teta = teclado.nextInt();
			
			switch(teta) {
			
			case 1:
				cr.power();
				break;
			
			case 2:
				cr.volumeUp();
				break;
				
			case 3:
				cr.volumeDown();
				break;
				
			case 4:
				cr.channelUp();
				break;
				
			case 5:
				cr.channelDown();
				break;
				
			case 6:
				return;
				
			default:
				break;
				
			}
			
			
			television.printStatus();
			Thread.sleep(2000);
		}
		
	}
}
