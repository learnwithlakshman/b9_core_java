package com.careerit.cj.arrays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class StockDataManager {

	public static void main(String[] args) throws IOException {
		IpoDetails[] ipoDetails = loadDataFrom("seed_data/ipodata.csv");
	}

	private static IpoDetails[] loadDataFrom(String fileName) throws IOException {

		List<String> lines = Files.readAllLines(Paths.get(fileName));
		lines = lines.subList(1, lines.size());
		IpoDetails[] dataArr = new IpoDetails[lines.size()];
		int count = 0;
		for (String line : lines) {
			String[] arr = line.split(",");

			LocalDate date = LocalDate.parse(arr[0]);
			String companyName = arr[1];
			double issueSize = Double.parseDouble(arr[2]);
			double issuePrice = Double.parseDouble(arr[8]);
			double currentPrice = Double.parseDouble(arr[11]);
			IpoDetails ipoDetails = new IpoDetails();
			ipoDetails.setCompanyName(companyName);
			ipoDetails.setStartDate(date);
			ipoDetails.setCurrentPrice(currentPrice);
			ipoDetails.setIssueSize(issueSize);
			ipoDetails.setIssuePrice(issuePrice);
			dataArr[count++] = ipoDetails;
		}

		return dataArr;
	}
}
