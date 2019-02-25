package accountpack;

public class StatusAccount {
	public enum StatusA {ALLOWED, WARNED, BLOCKED}

	void StatusA () {
	int Status = 0;
	switch(Status) {
	case 1:
		System.out.println(StatusA.ALLOWED);
		break;
	case 2:
		System.out.println(StatusA.WARNED);
		break;
	case 3:
		System.out.println(StatusA.BLOCKED);
		break;
	default:
		break;
		}

	}
	
}
