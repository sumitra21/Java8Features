package com.java.dp.creational.builder;

public class BuilderDP {

	public static void main(String[] args) {
		Computer cop = new Computer.ComputerBuilder("CPU-core","4GB").build();
		System.out.println(cop);
		
		Computer cop1 = new Computer.ComputerBuilder("CPU-core","4GB").build();
		System.out.println(cop1);
		
		Computer cop2 = new Computer.ComputerBuilder("CPU-core","4GB","128GB","Gorilla","Qualcomm").build();
		System.out.println(cop2);
	}

}

class Computer{
	
	private String cpu;
	private String ram;
	private String harddisk;
	private String display;
	private String processer;
	
	public Computer(ComputerBuilder computerBuilder) {
		this.cpu = computerBuilder.cpu;
		this.ram = computerBuilder.ram;
		this.display = computerBuilder.display;
		this.processer = computerBuilder.processer;
		this.harddisk = computerBuilder.harddisk;
	}


	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", harddisk=" + harddisk + ", display=" + display
				+ ", processer=" + processer + "]";
	}

	public static class ComputerBuilder{
		
		private String cpu;
		private String ram;
		private String harddisk;
		private String display;
		private String processer;
		
		public ComputerBuilder(String cpu, String ram){
			this.cpu = cpu;
			this.ram = ram;
		}
		
		public ComputerBuilder(String cpu, String ram, String harddisk){
			this.cpu = cpu;
			this.ram = ram;
			this.harddisk = harddisk;
		}
		
		public ComputerBuilder(String cpu){
			this.cpu = cpu;
		}
		
		public ComputerBuilder(String cpu, String ram, String harddisk, String display){
			this.cpu = cpu;
			this.ram = ram;
			this.harddisk = harddisk;
			this.display = display;
		}
		
		public ComputerBuilder(String cpu, String ram, String harddisk, String display, String processer){
			this.cpu = cpu;
			this.ram = ram;
			this.harddisk = harddisk;
			this.display = display;
			this.processer = processer;
		}
		
		public Computer build() {
			Computer c = new Computer(this);
			return c;
		}
	}
}