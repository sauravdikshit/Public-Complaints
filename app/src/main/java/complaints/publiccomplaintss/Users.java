package complaints.publiccomplaintss;

public class Users {
	
	private int id;
	private String unm;
	private String ups;
	private String ph;
	private String pn;
	private String sx;
	private String dst;
	private String uside;
	
	public Users()
	{
		
	}
	public Users(String unm,String ups,String ph,String pn,String sx,String dst,String uside)
	{
		super();
		this.unm= unm;
		this.ups = ups;
		this.ph =ph;
		this.pn =pn;
		this.sx = sx;
		this.dst = dst;
		this.uside = uside;
	
	
	}
	public void setid(int id)
	{
		this.id = id;
	}
	public int getid()
	{
		return id;
	}
	public void setunm(String unm)
	{
		this.unm = unm;
	}
	public String getsx()
	{
		return sx;
	}
	public void setsx(String sx)
	{
		this.sx = sx;
	}
	public String getdst()
	{
		return dst;
	}
	public void setdst(String dst)
	{
		this.dst = dst;
	}
	public String getunm()
	{
		return unm;
	}
	public void setups(String ups)
	{
		this.ups = ups;
	}
	public String getups()
	{
		return ups;
	}
	public void setph(String ph)
	{
		this.ph = ph;
	}
	public String getph()
	{
		return ph;
	}
	public void setpn(String pn)
	{
		this.pn = pn;
	}
	public String getpn()
	{
		return pn;
	}
	public void setuside(String uside)
	{
		this.uside = uside;
	}
	public String getuside()
	{
		return uside;
	}
	public String toString()
	{
		return unm  + " " + ups+ " " + ph+ " " +pn + " " + sx + " " + dst+ " " +uside ;
	}

}
