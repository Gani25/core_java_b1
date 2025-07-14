package day11.main.Entity;

public class Address {
	
	private String buildingName;
	
	private String city;
	
	private String state;
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
