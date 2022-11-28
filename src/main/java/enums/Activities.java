package enums;

public enum Activities {
	

	gym("gym"),
	Salon("Salon"),
	Badminton("Bad"),
	Cricket("Cri"),
	BookNow("booknow"),
	Next("next"),
	Pay("pay"),
	Confirmbooking("booking"),
	Done("done");
	
	private final String  activity;
	
private Activities(String _activity) {
	
	activity = this.activity;
}
	
	public String getActivity() {
		return activity.toString();
	}
	
	
}
