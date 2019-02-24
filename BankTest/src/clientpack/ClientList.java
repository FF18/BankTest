package clientpack;

import java.util.ArrayList;

public abstract class ClientList {

    private ArrayList<String> names;
  //creating a parameterized constructor
	public ClientList () {
	    ArrayList<String> names = new ArrayList<String>();
	    names .add("Max");
	    names .add("Ron");
	    names .add("Tom");
	    names .add("Noy");
	  }
	public ArrayList<String> getNames() {
		return names;
	}
	public void setNames(ArrayList<String> names) {
		this.names = names;
	}
}