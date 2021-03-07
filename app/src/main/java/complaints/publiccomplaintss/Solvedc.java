package complaints.publiccomplaintss;

public class Solvedc {
	
	private int slyid;
	private String slysub;
	private String slysubis;
	private String dlupicc;
	private String slyfd;
	private String slusid;
	private String sldate;
	private String dlnmcc;
	private String dlcmpimgcc;
	public Solvedc()
	{
		
	}
	
	public Solvedc(String slysub,String slysubis,String dlupicc,String slyfd,String slusid,String sldate,String dlnmcc,String dlcmpimgcc )
	{
		super();
		this.slysub= slysub;
		this.slysubis = slysubis;
		this.dlupicc= dlupicc;
		this.slyfd=slyfd;
		this.slusid = slusid;
		this.sldate= sldate;
		this.dlnmcc= dlnmcc;
		this.dlcmpimgcc= dlcmpimgcc;
	
	}
	
	public void setslyid(int slyid)
	{
		this.slyid = slyid;
	}
	public int getslyid()
	{
		return slyid;
	}
	public void setslysub(String slysub)
	{
		this.slysub = slysub;
	}
	public String getslysub()
	{
		return slysub;
	}
	public void setslysubis(String slysubis)
	{
		this.slysubis = slysubis;
	}

	public String getslysubis()
	{
		return slysubis;
	}
	public void setdlupicc(String dlupicc)
	{
		this.dlupicc=dlupicc;
	}
	public String getdlupicc()
	{
		return dlupicc;
	}
	public void setslyfd(String slyfd)
	{
		this.slyfd = slyfd;
	}
	public String getslyfd()
	{
		return slyfd;
	}

	public void setslusid(String slusid)
	{
		this.slusid=slusid;
	}
	public String getslusid()
	{
		return slusid;
	}
	public void setsldate(String sldate)
	{
		this.sldate=sldate;
	}
	public String getsldate()
	{
		return sldate;
	}
	
	
	public void setdlnmcc(String dlnmcc)
	{
		this.dlnmcc=dlnmcc;
	}
	public String getdlnmcc()
	{
		return dlnmcc;
	}
	public void setdlcmpimgcc(String dlcmpimgcc)
	{
		this.dlcmpimgcc=dlcmpimgcc;
	}
	public String getdlcmpimgcc()
	{
		return dlcmpimgcc;
	}
	
	public String toString1()
	{
		return slysub + " " + slysubis + " "+dlupicc +" " +slyfd+ " " + slusid + " "+sldate+"  "+dlnmcc+" "+dlcmpimgcc;
	}
	


}
