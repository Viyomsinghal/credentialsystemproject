package itsupport;

public class Employee {

	String fnm;
	String lnm;
	String comp;
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public Employee(String fnm, String lnm) {
		super();
		this.fnm = fnm;
		this.lnm = lnm;
	}
	public String getFnm() {
		return fnm;
	}
	public void setFnm(String fnm) {
		this.fnm = fnm;
	}
	public String getLnm() {
		return lnm;
	}
	public void setLnm(String lnm) {
		this.lnm = lnm;
	}
	
	
	
}
