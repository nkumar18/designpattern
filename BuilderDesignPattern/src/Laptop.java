
public class Laptop {
//mandatory attributes

    private String ram;
	private String hdd;
	private String cpu;
//optinal attributes
	private boolean graphicsEnable;
	
	private Laptop(Laptopbuilder builder) {
		this.cpu=builder.cpu;
		this.ram=builder.ram;
		this.hdd=builder.hdd;
		this.graphicsEnable=builder.graphicsEnable;
		
	}
	
	
	
	static class Laptopbuilder{
		//mandatory attributes

	    private String ram;
		private String hdd;
		private String cpu;
	//optinal attributes
		private boolean graphicsEnable;
		
		
		
		public Laptopbuilder(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}



		public boolean isGraphicsEnable() {
			return graphicsEnable;
		}



		public Laptopbuilder setGraphicsEnable(boolean graphicsEnable) {
			this.graphicsEnable = graphicsEnable;
			return this;
			
		}



		Laptop build(){
			return new Laptop(this);
		}
	}



	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", graphicsEnable=" + graphicsEnable + "]";
	}
	
	
	
}
