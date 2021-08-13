package FactoryMethod;

public class Main {
	public static void main(String[] args) {
		GameFactory hardFactory = new HardFactory();
		GameFactory softFactory = new SoftFactory();
		Product hardware = hardFactory.create();
		Product software = softFactory.create();
	}
}
