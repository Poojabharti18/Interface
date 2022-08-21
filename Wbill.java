package interfaceexample;

public class Wbill implements Bill
	{
	    private int billno;
	    private int nooflitres;
	    private int costperlitre;
	    public Wbill()
	    {
	        
	    }
	    public Wbill(int billno, int nooflitres, int costperlitre) {
	        super();
	        this.billno = billno;
	        this.nooflitres = nooflitres;
	        this.costperlitre = costperlitre;
	    }
	    public int getBillno() {
	        return billno;
	    }
	    public void setBillno(int billno) {
	        this.billno = billno;
	    }
	    public int getNooflitres() {
	        return nooflitres;
	    }
	    public void setNooflitres(int nooflitres) {
	        this.nooflitres = nooflitres;
	    }
	    public int getCostperlitre() {
	        return costperlitre;
	    }
	    public void setCostperlitre(int costperlitre) {
	        this.costperlitre = costperlitre;
	    }
	    @Override
	    public double calculateBill() {
	        // TODO Auto-generated method stub
	        return nooflitres*costperlitre;
	    }
	    @Override
	    public void display() {
	        System.out.println("The Wbill=:"+calculateBill());
	        
	    }
	    @Override
	    public String toString() {
	        return "WBill [billno=" + billno + ", nooflitres=" + nooflitres + ", costperlitre=" + costperlitre + "]";
	    }
}
