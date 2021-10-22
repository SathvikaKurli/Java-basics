package Exceptions;

public class TestExceptionPropagation2 {
	void m() {
		throw new java.io.IOException("device error");//checked exception
	}
	void n() {
		m();
	}
	

}
