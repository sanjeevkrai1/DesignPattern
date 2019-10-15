package com.design.pattern.builder;

public class Computer {

	private String ram;
	private String hdd;

	private boolean isBluetoothEnabled;
	private boolean isGraphicsCardEnabled;

	public Computer(ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public static class ComputerBuilder {
		private String ram;
		private String hdd;
		private boolean isBluetoothEnabled;
		private boolean isGraphicsCardEnabled;

		public ComputerBuilder(String ram, String hdd) {
			super();
			this.ram = ram;
			this.hdd = hdd;
		}

		public String getHdd() {
			return hdd;
		}

		public void setHdd(String hdd) {
			this.hdd = hdd;
		}

		public String getRam() {
			return ram;
		}

		public void setRam(String ram) {
			this.ram = ram;
		}

		public boolean isBluetoothEnabled() {
			return isBluetoothEnabled;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;

		}

		public boolean isGraphicsCardEnabled() {
			return isGraphicsCardEnabled;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", isBluetoothEnabled=" + isBluetoothEnabled
				+ ", isGraphicsCardEnabled=" + isGraphicsCardEnabled + "]";
	}

}
