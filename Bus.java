package collection3;

public class Bus {
	
	private String travellerName;
	private String busNumber; 																																																																																																																																																																																												;
	private String driverName;
	private long mobileNumber;
	private int noOfSeats;
	
	public Bus(String travellerName, String busNumber, String driverName, long mobileNumber, int noOfSeats) {
		super();
		this.travellerName = travellerName;
		this.busNumber = busNumber;
		this.driverName = driverName;
		this.mobileNumber = mobileNumber;
		this.noOfSeats = noOfSeats;
	}

	public String getTravellerName() {
		return travellerName;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public String getDriverName() {
		return driverName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "Bus [travellerName=" + travellerName + ", busNumber=" + busNumber + ", driverName=" + driverName
				+ ", mobileNumber=" + mobileNumber + ", noOfSeats=" + noOfSeats + "]";
	}
	
	
	
	
	

}
