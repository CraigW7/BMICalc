package com.gmail.cwinter788.bmicalc;

public class BmiCalc {

	public static void main(String[] args) {
		// BMI = Weight(Kg) / (Height(M) x Height(M))
		double Height = 0;
		int Weight = 0;
		double BMI = 0;
		
		Height = Double.parseDouble(args[0]);
		Weight = Integer.parseInt(args[1]);
		
		BMI = Weight / (Height * Height);
		
		System.out.print("Height: ");
		System.out.println(Height);
		System.out.print("Weight: ");
		System.out.println(Weight);
		System.out.print("BMI: ");
		System.out.println(BMI);

	}

}
