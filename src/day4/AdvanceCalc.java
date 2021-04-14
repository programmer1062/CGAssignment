package day4;

public class AdvanceCalc {
	int add(int[] arr) {
		int res=0;
		for(int a:arr) {
			res+=a;
		}
		return res;
	}
	int sub(int[] arr) {
		int res=0;
		for(int a:arr) {
			res-=a;
		}
		return res;
	}
	double mul(double[] arr) {
		double res=1;
		for(double a:arr) {
			res*=a;
		}
		return res;
	}
	double div(double n1,double n2) {
		return n1 * n2;
	}
}
