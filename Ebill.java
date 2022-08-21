package interfaceexample;

public class Ebill implements Bill{
	private int billno;
	private int noofunits;
	private int costperunit;
	public Ebill()
	{
		
	}
	public Ebill(int billno,int noofunits,int costperunit)
	{
		this.billno=billno;
		this.noofunits=noofunits;
		this.costperunit=costperunit;
		}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public int getNoofunits() {
		return noofunits;
	}
	public void setNoofunits(int noofunits) {
		this.noofunits = noofunits;
	}
	public int getCostperunit() {
		return costperunit;
	}
	public void setCostperunit(int costperunit) {
		this.costperunit = costperunit;
	}
	public double calculateBill()
	{
		return noofunits*costperunit;
	}
	public void display()
	{
		System.out.println("EBILL=:"+calculateBill());
	}
	@Override
	public String toString() {
		return "Ebill [billno=" + billno + ", noofunits=" + noofunits + ", costperunit=" + costperunit + "]";
	}
	
	
	

}
