package com.careerit.cj.arrays;

import java.time.LocalDate;

public class IpoDetails {

	private LocalDate startDate;
	private String companyName;
	private double issueSize;
	private double issuePrice;
	private double currentPrice;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getIssueSize() {
		return issueSize;
	}
	public void setIssueSize(double issueSize) {
		this.issueSize = issueSize;
	}
	public double getIssuePrice() {
		return issuePrice;
	}
	public void setIssuePrice(double issuePrice) {
		this.issuePrice = issuePrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	@Override
	public String toString() {
		return "IpoDetails [startDate=" + startDate + ", companyName=" + companyName + ", issueSize=" + issueSize
				+ ", issuePrice=" + issuePrice + ", currentPrice=" + currentPrice + "]";
	}
	
	
	
}