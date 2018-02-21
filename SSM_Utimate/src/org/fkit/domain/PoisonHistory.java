package org.fkit.domain;

public class PoisonHistory {
	private String gas;
	private Float HistoryData;
	public String getGas() {
		return gas;
	}
	public void setGas(String gas) {
		this.gas = gas;
	}
	public Float getHistoryData() {
		return HistoryData;
	}
	public void setHistoryData(Float historyData) {
		HistoryData = historyData;
	}
	@Override
	public String toString() {
		return "PoisonHistory [gas=" + gas + ", HistoryData=" + HistoryData + "]";
	}
	
	
}
