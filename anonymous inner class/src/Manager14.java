package app2;
interface Switch
{
	void on();
	void off();
}
class Fan
{
	private boolean runningStatus;
	public Switch getSwitch()
	{
		return new Switch()
		{
			public void on()
			{
				runningStatus=true;
			}
			public void off()
			{
				runningStatus=false;
			}
		};
	}
	public boolean getRunningStatus()
	{
		return runningStatus;
	}
}	
class Manager14
{
	public static void main(String [] args)
	{
		Fan f1=new Fan();
		Switch s1=f1.getSwitch();
		s1.on();
		System.out.println(f1.getRunningStatus());
		s1.off();
		System.out.println(f1.getRunningStatus());
	}
}