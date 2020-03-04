
public class Television implements Device{

	private boolean ligada = false;
	private int volume = 20;
	private int canal = 8;
	
	public boolean isEnabled() {
		return ligada;
	}

	public void enable() {
		ligada = true;
		
	}

	public void disable() {
		ligada = false;
		
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int percent) {
		if (percent > 100) {
			this.volume = 100;
		}else {
			if (percent < 0) {
				this.volume = 0;
				
			}else {
				this.volume = percent;
			}
		}
	}

	public int getChannel() {
		return canal;
	}

	public void setChannel(int channel) {
		this.canal = channel;
	}

	public void printStatus() {
		System.out.println("--------------");
		System.out.println("Televisão");
		System.out.println("Status: " + (ligada ? "Ligada" : "Desligada"));
		System.out.println("Volume: " + volume + "%");
		System.out.println("Canal: " + canal);
		System.out.println("--------------");
	}

}
