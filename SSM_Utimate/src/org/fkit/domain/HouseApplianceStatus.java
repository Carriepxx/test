package org.fkit.domain;

public class HouseApplianceStatus {
	private String ApplianceName;
	private String ApplianceStatus;
	public String getApplianceName() {
		return ApplianceName;
	}
	public void setApplianceName(String applianceName) {
		ApplianceName = applianceName;
	}
	public String getApplianceStatus() {
		return ApplianceStatus;
	}
	public void setApplianceStatus(String applianceStatus) {
		ApplianceStatus = applianceStatus;
	}
	@Override
	public String toString() {
		return "HouseApplianceStatus [ApplianceName=" + ApplianceName + ", ApplianceStatus=" + ApplianceStatus + "]";
	}
}
