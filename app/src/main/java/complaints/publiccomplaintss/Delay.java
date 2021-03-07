package complaints.publiccomplaintss;

public class Delay {
	
	private int dlyid;
	private String dlysub;
	private String dlysubis;
	private String dlupic;
	private String dlyfd;
	private String dlusid;
	private String dldate;
	private String dlnm;
	private String dlcmpimg;
	

	
	public Delay()
	{
		
	}
	
	public Delay(String dlysub,String dlysubis,String dlupic,String dlyfd,String dlusid,String dldate,String dlnm,String dlcmpimg)
	{
		super();
		this.dlysub= dlysub;
		this.dlysubis = dlysubis;
		this.dlupic = dlupic;
		this.dlyfd=dlyfd;
		this.dlusid=dlusid;
		this.dldate= dldate;
		this.dlnm = dlnm;
		this.dlcmpimg = dlcmpimg;
	
	}
	
	public void setdlyid(int dlyid)
	{
		this.dlyid = dlyid;
	}
	public int getdlyid()
	{
		return dlyid;
	}
	public void setdlysub(String dlysub)
	{
		this.dlysub = dlysub;
	}
	public String getdlysub()
	{
		return dlysub;
	}
	public void setdlysubis(String dlysubis)
	{
		this.dlysubis = dlysubis;
	}
//	public String getusrid1()
//	{
//		return usrid1;
//	}
//	public void setusrid1(String usrid1)
//	{
//		this.usrid1 = usrid1;
//	}
	public String getdlysubis()
	{
		return dlysubis;
	}
	public void setdlupic(String dlupic)
	{
		this.dlupic = dlupic;
	}
	public String getdlupic()
	{
		return dlupic;
	}
	public void setdlyfd(String dlyfd)
	{
		this.dlyfd = dlyfd;
	}
	public String getdlyfd()
	{
		return dlyfd;
	}
//	public void setph1(String ph1)
//	{
//		this.ph1 = ph1;
//	}
//	public String getph1()
//	{
//		return ph1;
//	}
	public void setdlusid(String dlusid)
	{
		this.dlusid=dlusid;
	}
	public String getdlusid()
	{
		return dlusid;
	}
	public void setdldate(String dldate)
	{
		this.dldate=dldate;
	}
	public String getdldate()
	{
		return dldate;
	}
	public void setdlnm(String dlnm)
	{
		this.dlnm=dlnm;
	}
	public String getdlnm()
	{
		return dlnm;
	}
	public void setdlcmpimg(String dlcmpimg)
	{
		this.dlcmpimg =dlcmpimg;
	}
	public String getdlcmpimg()
	{
		return dlcmpimg;
	}
	public String toString1()
	{
		return dlysub + " " + dlysubis + " "+dlupic+" " +dlyfd+ " " + dlusid + " "+dldate ;
	}
	

}
