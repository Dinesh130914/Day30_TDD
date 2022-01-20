package com.bl.invoice;

public class InvoiceGen {

	static int CostPerTime = 1;
	static double CostPerKiloMeter = 10;
	static int MinFare = 5;

	public static void main(String[] args) {
		double dis = 5.0;
		int time = 3;
		double totalfare = dis * CostPerKiloMeter + time * CostPerTime;
		
		if(totalfare<MinFare) 
		{
			System.out.println(MinFare);
		}
		System.out.println("Total Amount :"+totalfare);
	}
}
