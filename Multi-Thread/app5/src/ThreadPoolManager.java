import java.util.Vector;
class ThreadPoolManager
{
	private Vector<ModelThread> pool = new Vector<ModelThread>();
	public void init()
	{
		ModelThread mt = null;
		for(int i =0; i < 10; i++)
		{
			mt = new ModelThread();
			mt.start();
			pool.add(mt);
		}
	}
	public ModelThread getThread()
	{
		ModelThread mt = null;
		if(pool.size() > 0)
		{
			mt = pool.remove(0);
		}
		else
		{
			mt = new ModelThread();
			mt.start();
		}
		return mt;
	}
	public void setThread(ModelThread mt)
	{
		if(mt != null)
		{
			if(pool.size() < 10)
			{
				pool.add(mt);
			}
		}
		else
		{
			mt.stop();
		}
	}
	public void release()
	{
		ModelThread mt = null;
		for(int i = 0; i < pool.size();)
		{
			mt = pool.remove(0);
			mt.stop();
		}
	}
}