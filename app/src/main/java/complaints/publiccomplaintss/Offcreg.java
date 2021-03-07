package complaints.publiccomplaintss;

public class Offcreg {
	
	private int oid;
	
	private String oups;

	private String opn;

	private String odst;

	
	public Offcreg()
	{
		
	}
	public Offcreg(String opn,String oups,String odst)
	{
		super();
		this.opn =opn;
	
		this.oups = oups;

		

		this.odst = odst;

	
	
	}
	public void setoid(int oid)
	{
		this.oid = oid;
	}
	public int getoid()
	{
		return oid;
	}
	
	
	
	
	public void setoups(String oups)
	{
		this.oups = oups;
	}
	public String getoups()
	{
		return oups;
	}
	
	public void setopn(String opn)
	{
		this.opn = opn;
	}
	public String getopn()
	{
		return opn;
	}
	public String getodst()
	{
		return odst;
	}
	public void setodst(String odst)
	{
		this.odst = odst;
	}
	
	public String toString()
	{
		return  oups+ " " +opn +  " " + odst ;
	}

}


