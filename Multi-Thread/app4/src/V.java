class S
{
	synchronized void test() // synchronized 
	                          // one thread executing, one is waiting in syncronized method. and after completing this, other thread is executing.
	                         //here more time consuming bcz one is waiting but here is 100% data accuracy.
							 // if test() is synchronized then two threads simultaneously can not enter in the test().
							 // both threads are calling object of s1. if object is creating then only object class is creating
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.println("from S.test:" + i);
		}
	}
}
class T extends Thread 
{
	S s1;
	T(S s1)
	{
		this.s1 = s1;
	}
	public void run()
	{
		System.out.println("T-begin");
		s1.test();
		System.out.println("T-end");
	}
}
class U extends Thread 
{
	S s1;
	U(S s1)
	{
		this.s1 = s1;
	}
	public void run()
	{
		System.out.println("U-begin");
		s1.test();
		System.out.println("U-end");
	}
}
// overrided run() method
class V
{
	public static void main(String[] args) 
	{
		S obj1 = new S(); // make one object to S
		S obj2 = new S(); // taken two objects as example..... data not corrupting....... two objects so different different attributes for each objects.... simultaneously output
		T t1 = new T(obj1);// supplying to obj
		U u1 = new U(obj2);// supplying to obj
		// one object is sharing to two threads 
		t1.start();
		u1.start();
		System.out.println("done");
	}
}

/* it is advisable to make one object shareable to multiple threads. multiple threads can not work with object simultaneosly. any one thread work at one time
 and other waits then others work then first wait. 



from S.test:854
from S.test:850
from S.test:855
from S.test:851
from S.test:856
from S.test:852
from S.test:857
from S.test:853
from S.test:858
from S.test:854
from S.test:859
from S.test:855
from S.test:860
from S.test:856
from S.test:861
from S.test:857
from S.test:862
from S.test:858
from S.test:863
from S.test:859
from S.test:864
from S.test:860
from S.test:865
from S.test:861
from S.test:866
from S.test:862
from S.test:867
from S.test:863
from S.test:864
from S.test:865
from S.test:866
from S.test:867
from S.test:868
from S.test:869
from S.test:870
from S.test:871
from S.test:872
from S.test:873
from S.test:874
from S.test:875
from S.test:876
from S.test:877
from S.test:878
from S.test:868
from S.test:879
from S.test:869
from S.test:880
from S.test:870
from S.test:881
from S.test:871
from S.test:882
from S.test:872
from S.test:883
from S.test:873
from S.test:884
from S.test:874
from S.test:885
from S.test:875
from S.test:886
from S.test:876
from S.test:887
from S.test:877
from S.test:888
from S.test:878
from S.test:889
from S.test:879
from S.test:890
from S.test:880
from S.test:891
from S.test:881
from S.test:892
from S.test:882
from S.test:893
from S.test:883
from S.test:894
from S.test:884
from S.test:895
from S.test:885
from S.test:896
from S.test:886
from S.test:897
from S.test:887
from S.test:898
from S.test:888
from S.test:899
from S.test:889
from S.test:900
from S.test:890
from S.test:901
from S.test:891
from S.test:902
from S.test:892
from S.test:903
from S.test:893
from S.test:904
from S.test:894
from S.test:905
from S.test:895
from S.test:906
from S.test:896
from S.test:907
from S.test:908
from S.test:909
from S.test:910
from S.test:911
from S.test:912
from S.test:913
from S.test:914
from S.test:915
from S.test:897
from S.test:916
from S.test:898
from S.test:917
from S.test:899
from S.test:918
from S.test:900
from S.test:919
from S.test:901
from S.test:920
from S.test:902
from S.test:921
from S.test:903
from S.test:922
from S.test:904
from S.test:923
from S.test:905
from S.test:924
from S.test:906
from S.test:925
from S.test:907
from S.test:926
from S.test:908
from S.test:927
from S.test:909
from S.test:928
from S.test:910
from S.test:929
from S.test:911
from S.test:930
from S.test:912
from S.test:931
from S.test:913
from S.test:932
from S.test:914
from S.test:933
from S.test:915
from S.test:934
from S.test:916
from S.test:935
from S.test:917
from S.test:936
from S.test:918
from S.test:937
from S.test:919
from S.test:938
from S.test:920
from S.test:939
from S.test:921
from S.test:940
from S.test:922
from S.test:941
from S.test:923
from S.test:942
from S.test:924
from S.test:943
from S.test:925
from S.test:944
from S.test:926
from S.test:945
from S.test:927
from S.test:946
from S.test:928
from S.test:947
from S.test:929
from S.test:948
from S.test:930
from S.test:949
from S.test:950
from S.test:951
from S.test:952
from S.test:953
from S.test:954
from S.test:955
from S.test:956
from S.test:957
from S.test:958
from S.test:959
from S.test:960
from S.test:961
from S.test:962
from S.test:963
from S.test:931
from S.test:964
from S.test:932
from S.test:965
from S.test:933
from S.test:966
from S.test:934
from S.test:967
from S.test:935
from S.test:968
from S.test:936
from S.test:969
from S.test:937
from S.test:970
from S.test:938
from S.test:971
from S.test:939
from S.test:972
from S.test:940
from S.test:973
from S.test:941
from S.test:974
from S.test:942
from S.test:975
from S.test:943
from S.test:976
from S.test:944
from S.test:945
from S.test:946
from S.test:947
from S.test:948
from S.test:949
from S.test:950
from S.test:951
from S.test:952
from S.test:953
from S.test:977
from S.test:954
from S.test:978
from S.test:979
from S.test:980
from S.test:981
from S.test:982
from S.test:983
from S.test:984
from S.test:985
from S.test:986
from S.test:955
from S.test:987
from S.test:956
from S.test:988
from S.test:957
from S.test:989
from S.test:958
from S.test:990
from S.test:959
from S.test:991
from S.test:960
from S.test:992
from S.test:961
from S.test:993
from S.test:962
from S.test:963
from S.test:964
from S.test:965
from S.test:966
from S.test:967
from S.test:968
from S.test:969
from S.test:970
from S.test:971
from S.test:972
from S.test:973
from S.test:974
from S.test:975
from S.test:976
from S.test:977
from S.test:994
from S.test:978
from S.test:995
from S.test:979
from S.test:996
from S.test:980
from S.test:997
from S.test:981
from S.test:998
from S.test:982
from S.test:999
from S.test:983
T-end
from S.test:984
from S.test:985
from S.test:986
from S.test:987
from S.test:988
from S.test:989
from S.test:990
from S.test:991
from S.test:992
from S.test:993
from S.test:994
from S.test:995
from S.test:996
from S.test:997
from S.test:998
from S.test:999
U-end

*/