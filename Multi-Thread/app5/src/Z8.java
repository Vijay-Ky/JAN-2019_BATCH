//Thread Pool
class Z8
{
	public static void main(String[] args) 
	{
		ThreadPoolManager tpm = new ThreadPoolManager();
		tpm.init();

		User1 u1 = new User1(tpm);
		u1.start();

		User2 u2 = new User2(tpm);
		u2.start();

		User3 u3 = new User3(tpm);
		u3.start();
		Util.sleep(900000);
		u1.stop();
		u2.stop();
		u3.stop();
		tpm.release();
	}
}
