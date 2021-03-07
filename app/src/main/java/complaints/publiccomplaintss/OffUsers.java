package complaints.publiccomplaintss;

public class OffUsers 
{
	private int ofid;
	private String ofdst;
	private String ofphn;
	private String ofpass;
	
	public OffUsers()
	{
		
	}
	public OffUsers(String ofdst,String ofphn,String ofpass)
	{
		super();
		this.ofdst = ofdst;
		this.ofphn = ofphn;
		this.ofpass = ofpass;
	}
	public void setofid(int ofid)
	{
		this.ofid = ofid;
	}
	public int getofid()
	{
		return ofid;
	}
	public void setofdst(String ofdst)
	{
		this.ofdst = ofdst;
	}
	public String getofdst()
	{
		return ofdst;
	}
	public void setofphn(String ofphn)
	{
		this.ofphn = ofphn;
	}
	public String getofphn()
	{
		return ofphn;
	}
	public void setofpass(String ofpass)
	{
		this.ofpass = ofpass;
	}
	public String getofpass()
	{
		return ofpass;
	}
	public String toString()
	{
		return ofdst +" " +ofphn + " "+ ofpass;
	}

}
