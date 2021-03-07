package complaints.publiccomplaintss;

public class Issue 
{
	private int isid;
	private String stp1;
	private String stp2;
	private String ph;
	private String fd;
	private String usrpic;
	private String usrid;
	private String usrdate;
	private String usrdstt;
//	private String dlcmpimgg;
	
	public Issue()
	{
		
	}
	
	public Issue(String stp1,String stp2,String ph,String fd,String usrid,String usrpic,String usrdate,String usrdstt)
	{
		super();
		this.stp1= stp1;
		this.stp2 = stp2;
		this.ph =ph;
		this.fd=fd;
		this.usrid=usrid;
		this.usrpic=usrpic;
		this.usrdate= usrdate;
		this.usrdstt= usrdstt;
//		this.dlcmpimgg=dlcmpimgg;
	
	}
	
	public void setid(int isid)
	{
		this.isid = isid;
	}
	public int getisid()
	{
		return isid;
	}
	public void setstp1(String stp1)
	{
		this.stp1 = stp1;
	}
	public String getusrpic()
	{
		return usrpic;
	}
	public void setusrpic(String usrpic)
	{
		this.usrpic = usrpic;
	}
	public String getusrid()
	{
		return usrid;
	}
	public void setusrid(String usrid)
	{
		this.usrid = usrid;
	}
	public String getstp1()
	{
		return stp1;
	}
	public void setstp2(String stp2)
	{
		this.stp2 = stp2;
	}
	public String getstp2()
	{
		return stp2;
	}
	public void setph(String ph)
	{
		this.ph = ph;
	}
	public String getph()
	{
		return ph;
	}
	public void setfd(String fd)
	{
		this.fd=fd;
	}
	public String getfd()
	{
		return fd;
	}
	public void setusrdate(String usrdate)
	{
		this.usrdate=usrdate;
	}
	public String getusrdate()
	{
		return usrdate;
	}
	public void setusrdstt(String usrdstt)
	{
		this.usrdstt=usrdstt;
	}
	public String getusrdstt()
	{
		return usrdstt;
	}
	
//	public void setdlcmpimgg(String dlcmpimgg)
//	{
//		this.dlcmpimgg=dlcmpimgg;
//	}
//	public String dlcmpimgg()
//	{
//		return dlcmpimgg;
	
	public String toString()
	{
		return stp1 + " " + stp2+ " " + ph + " " +fd+ " " + usrid + " " + usrpic + " "+usrdate+ " " + usrdstt ;
	}
	
	

}
