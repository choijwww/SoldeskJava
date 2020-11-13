package project;

public class TransportPublic extends Transport{
	
	protected String model;
	public TransportPublic(String model, String destination,  int accompany) {
		super(destination,  accompany);
	
		this.model = model;
		// TODO Auto-generated constructor stub
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}
