package com.javalec.ex;

public class BMICalculator {
	
	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obseity;
	
	public void bmiCalculation(double weight, double height) {
		
		double h = height * 0.01;
		double result = weight / (h*h);
		
		System.out.println("BMI지수 : " + (int)result);
		
		if(result > obseity) {
			System.out.println("비만입니다.");
		}else if(result > overWeight) {
			System.out.println("과체중 입니다.");
		}else if(result > normal) {
			System.out.println("정상 입니다.");
		}else if(result > lowWeight) {
			System.out.println("저체중 입니다.");
		}
		
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObseity(double obseity) {
		this.obseity = obseity;
	}

	public double getLowWeight() {
		return lowWeight;
	}

	public double getNormal() {
		return normal;
	}

	public double getOverWeight() {
		return overWeight;
	}

	public double getObseity() {
		return obseity;
	}
	
	

}
