package org.fkit.domain;

public class HouseApplianceControl {
	private String ApplianceName;
	private Integer ApplianceStatus;
	public String getApplianceName() {
		return ApplianceName;
	}
	public void setApplianceName(String applianceName) {
		ApplianceName = applianceName;
	}
	public Integer getApplianceStatus() {
		return ApplianceStatus;
	}
	public void setApplianceStatus(Integer applianceStatus) {
		ApplianceStatus = applianceStatus;
	}
	@Override
	public String toString() {
		return "HouseApplianceControl [ApplianceName=" + ApplianceName + ", ApplianceStatus=" + ApplianceStatus + "]";
	}
	
	
}
