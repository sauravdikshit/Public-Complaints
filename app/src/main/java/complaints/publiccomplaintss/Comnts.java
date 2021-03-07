package complaints.publiccomplaintss;

public class Comnts 
{
	private int cmid;
	private String cmnttext;
	private String blgrname;
	private String blgrpic;
	private String cmntid;
	
	public Comnts()
	{
		
	}
	public Comnts(String cmntid,String cmnttext,String blgrname,String blgrpic)
	{
		super();
		this.cmntid = cmntid;
		this.cmnttext= cmnttext;
		this.blgrname= blgrname;
		this.blgrpic= blgrpic;
		
	}
	public void setcmid(int cmid)
	{
		this.cmid = cmid;
	}
	public int getcmid()
	{
		return cmid;
	}
	public void setcmnttext(String cmnttext)
	{
		this.cmnttext = cmnttext;
	}
	public String getcmnttext()
	{
		return cmnttext;
	}
	public void setblgrname(String blgrname)
	{
		this.blgrname = blgrname;
	}
	public String getblgrname()
	{
		return blgrname;
	}
	public void setblgrpic(String blgrpic)
	{
		this.blgrpic = blgrpic;
	}
	public String getblgrpic()
	{
		return blgrpic;
	}
	public void setcmntid(String cmntid)
	{
		this.cmntid = cmntid;
	}
	public String getcmntid()
	{
		return cmntid;
	}
	public String toString()
	{
		return cmnttext +" "+blgrname + " " +blgrpic +" "+ cmntid;
	}


}
