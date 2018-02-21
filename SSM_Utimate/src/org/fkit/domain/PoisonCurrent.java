package org.fkit.domain;

public class PoisonCurrent {
	private String gas;
	private Float current_data;
	public String getGas() {
		return gas;
	}
	public void setGas(String gas) {
		this.gas = gas;
	}
	public Float getCurrent_data() {
		return current_data;
	}
	public void setCurrent_data(Float current_data) {
		this.current_data = current_data;
	}
	@Override
	public String toString() {
		return "PoisonCurrent [gas=" + gas + ", current_data=" + current_data + "]";
	}
	
	
	
}
