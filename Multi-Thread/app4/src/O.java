class M 
{
	//some member
}
class N extends M implements Runnable
{
	public void run(){
	//more member
	for (int i=1000;i<2000 ; i++ )
	{
		System.out.println("N-run"+i);
	}
	}
}
class O
{

	public static void main(String[] args) 
	{
		N n1=new N();// keep using
		Thread t1=new Thread (n1);
		t1.start();
		for (int i=4000 ;i<5000 ; i++ )
		{
			System.out.println("main run"+i);
		}
		
	}
}
/*
N-run1869
main run4833
N-run1870
main run4834
N-run1871
main run4835
N-run1872
main run4836
N-run1873
main run4837
N-run1874
main run4838
N-run1875
main run4839
N-run1876
main run4840
N-run1877
main run4841
N-run1878
main run4842
N-run1879
main run4843
N-run1880
main run4844
N-run1881
main run4845
N-run1882
main run4846
N-run1883
main run4847
N-run1884
main run4848
N-run1885
main run4849
N-run1886
main run4850
N-run1887
main run4851
N-run1888
main run4852
N-run1889
main run4853
N-run1890
main run4854
N-run1891
main run4855
N-run1892
main run4856
N-run1893
main run4857
N-run1894
main run4858
N-run1895
main run4859
N-run1896
main run4860
N-run1897
main run4861
N-run1898
main run4862
N-run1899
main run4863
N-run1900
main run4864
N-run1901
main run4865
N-run1902
main run4866
N-run1903
main run4867
N-run1904
main run4868
main run4869
main run4870
main run4871
main run4872
main run4873
main run4874
main run4875
main run4876
main run4877
main run4878
main run4879
main run4880
main run4881
main run4882
main run4883
main run4884
main run4885
main run4886
N-run1905
main run4887
N-run1906
main run4888
N-run1907
main run4889
N-run1908
main run4890
N-run1909
main run4891
N-run1910
main run4892
N-run1911
main run4893
N-run1912
main run4894
N-run1913
main run4895
N-run1914
main run4896
N-run1915
main run4897
N-run1916
main run4898
N-run1917
main run4899
N-run1918
main run4900
N-run1919
main run4901
N-run1920
main run4902
N-run1921
main run4903
N-run1922
main run4904
N-run1923
main run4905
N-run1924
main run4906
N-run1925
main run4907
N-run1926
main run4908
N-run1927
main run4909
N-run1928
main run4910
N-run1929
main run4911
N-run1930
main run4912
N-run1931
main run4913
N-run1932
main run4914
N-run1933
main run4915
N-run1934
main run4916
N-run1935
main run4917
N-run1936
main run4918
N-run1937
main run4919
N-run1938
main run4920
N-run1939
main run4921
N-run1940
main run4922
N-run1941
main run4923
N-run1942
main run4924
N-run1943
N-run1944
N-run1945
N-run1946
N-run1947
N-run1948
N-run1949
N-run1950
N-run1951
N-run1952
N-run1953
N-run1954
N-run1955
N-run1956
N-run1957
N-run1958
N-run1959
N-run1960
N-run1961
N-run1962
N-run1963
main run4925
N-run1964
main run4926
N-run1965
main run4927
N-run1966
N-run1967
N-run1968
main run4928
N-run1969
main run4929
N-run1970
main run4930
N-run1971
main run4931
N-run1972
main run4932
N-run1973
main run4933
N-run1974
main run4934
N-run1975
main run4935
N-run1976
main run4936
N-run1977
main run4937
N-run1978
main run4938
N-run1979
main run4939
N-run1980
main run4940
N-run1981
main run4941
N-run1982
main run4942
main run4943
main run4944
main run4945
N-run1983
main run4946
N-run1984
main run4947
N-run1985
main run4948
N-run1986
main run4949
N-run1987
main run4950
N-run1988
main run4951
N-run1989
main run4952
N-run1990
main run4953
N-run1991
main run4954
N-run1992
main run4955
N-run1993
main run4956
N-run1994
main run4957
N-run1995
main run4958
N-run1996
main run4959
N-run1997
main run4960
N-run1998
main run4961
N-run1999
main run4962
main run4963
main run4964
main run4965
main run4966
main run4967
main run4968
main run4969
main run4970
main run4971
main run4972
main run4973
main run4974
main run4975
main run4976
main run4977
main run4978
main run4979
main run4980
main run4981
main run4982
main run4983
main run4984
main run4985
main run4986
main run4987
main run4988
main run4989
main run4990
main run4991
main run4992
main run4993
main run4994
main run4995
main run4996
main run4997
main run4998
main run4999

*/