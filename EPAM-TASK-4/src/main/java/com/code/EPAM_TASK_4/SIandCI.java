package com.code.EPAM_TASK_4;
public class SIandCI {
		public double simpleInterest(double principal,double rate,double time) {
			return (principal*rate*time)/100;
		}
		public double compoundInterest(double principal,double rate,double time) {
			return principal*(Math.pow(1+rate/100, time)-1);
		}
}
