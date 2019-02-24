package accountpack;

public enum StatusAccount {
	
//account status(allowed, warned, blocked)
//	ALLOWED, WARNED, BLOCKED;
private static	int	ALLOWED;
private static	int WARNED;
private static	int BLOCKED;

public static void Status () {
switch(int) {
case ALLOWED:
	System.out.println(ALLOWED);
	break;
case WARNED:
	System.out.println(WARNED);
	break;
case BLOCKED:
	System.out.println(BLOCKED);
	break;
default:
	break;
}
//public void setStatusAccount() {
//}
//public int getStatusAccount() {
//	return getStatusAccount();
//}

public int getALLOWED() {
	return ALLOWED;
}

public void setALLOWED(int aLLOWED) {
	ALLOWED = aLLOWED;
}

public int getWARNED() {
	return WARNED;
}

public void setWARNED(int wARNED) {
	WARNED = wARNED;
}

public int getBLOCKED() {
	return BLOCKED;
}

public void setBLOCKED(int bLOCKED) {
	BLOCKED = bLOCKED;
}
}