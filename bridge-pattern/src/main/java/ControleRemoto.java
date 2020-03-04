
public class ControleRemoto implements Remote {

	protected Device device;
	
	public ControleRemoto() {
		
	}
	
public ControleRemoto(Device device) {
		this.device = device;
	}

	public void power() {
		if (device.isEnabled()) {
			device.disable();
		}else {
			device.enable();
		}
	}

	public void volumeDown() {
		device.setVolume(device.getVolume() - 5);
		
	}// TODO Auto-generated method stub

	public void volumeUp() {
		device.setVolume(device.getVolume() + 5);
		
	}

	public void channelDown() {
		device.setChannel((device.getChannel() - 1));
		
	}

	public void channelUp() {
		device.setChannel((device.getChannel() + 1));
		
	}

}
