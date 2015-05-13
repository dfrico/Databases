package src;

public class Logical_Record {
	
	private String name;
	private String caffea;
	private String varietal;
	private String origin;
	private String roasting;
	private String process;
	private String [] barCodes = new String [15];
	private String [] formats = new String [15];
	private String [] packagings = new String [15];
	private String [] prices = new String [15];
	private String [] min_stocks = new String [15];
	private String [] stocks = new String [15];
	private String [] max_stocks = new String [15];


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCaffea() {
		return caffea;
	}
	
	public void setCaffea(String caffea) {
		this.caffea = caffea;
	}
	
	public String getVarietal() {
		return varietal;
	}
	
	public void setVarietal(String varietal) {
		this.varietal = varietal;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getRoasting() {
		return roasting;
	}
	
	public void setRoasting(String roasting) {
		this.roasting = roasting;
	}
	
	public String getProcess() {
		return process;
	}
	
	public void setProcess(String process) {
		this.process = process;
	}

	public String[] getBarCodes() {
		return barCodes;
	}

	public void setBarCodes(int i, String barCode) {
		if(barCode.charAt(0)!=' ') this.barCodes[i] = barCode;
	}

	public String[] getFormats() {
		return formats;
	}

	public void setFormats(int i, String format) {
		if(format.charAt(0)!=' ') this.formats[i] = format;
	}

	public String[] getPackagings() {
		return packagings;
	}

	public void setPackagings(int i, String packagings) {
		if(packagings.charAt(0)!=' ') this.packagings[i] = packagings;
	}

	public String[] getPrices() {
		return prices;
	}

	public void setPrices(int i, String price) {
		if(price.charAt(0)!=' ') this.prices[i] = price;
	}

	public String[] getMin_stocks() {
		return min_stocks;
	}

	public void setMin_stocks(int i, String min_stock) {
		if(min_stock.charAt(0)!=' ') this.min_stocks[i] = min_stock;
	}

	public String[] getStocks() {
		return stocks;
	}

	public void setStocks(int i, String stock) {
		if(stock.charAt(0)!=' ') this.stocks[i] = stock;
	}

	public String[] getMax_stocks() {
		return max_stocks;
	}

	public void setMax_stocks(int i, String max_stock) {
		if(max_stock.charAt(0)!=' ') this.max_stocks[i] = max_stock;
	}

	public String getAttribute(int i){
		switch (i){
			case 0: return getName();
			case 1: return getCaffea();
			case 2: return getVarietal();
			case 3: return getOrigin();
			case 4: return getRoasting();
			case 5: return getProcess();
			default: return "";
		}
	}

	public void setAttribute(int i, String att){
		switch (i){
			case 0: setName(att); break;
			case 1: setCaffea(att); break;
			case 2: setVarietal(att); break;
			case 3: setOrigin(att); break;
			case 4: setRoasting(att); break;
			case 5: setProcess(att); break;
			default: break;
		}
	}
	
}