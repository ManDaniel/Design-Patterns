package Bridge.DesignPattern;

public class TVRemotePause extends RemoteButton {

	public TVRemotePause(EntertainmentDevice newDevice) {
		super(newDevice);

	}

	@Override
	public void buttonNinePressed() {
		System.out.println("Tv was Paused");

	}

}
