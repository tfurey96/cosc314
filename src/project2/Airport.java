package project2;

import java.util.*;

public class Airport {
	public String airportName;
	public int airportNum;

	public Airport(String airportName, int airportNum) {
		this.airportName = airportName;
		this.airportNum = airportNum;

	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public int getAirportNum() {
		return airportNum;
	}

	public void setAirportNum(int airportNum) {
		this.airportNum = airportNum;
	}

}
