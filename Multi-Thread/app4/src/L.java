class J implements Runnable //Runnable is a interface which is available to java  
{
	public void run()// here we have to mwke the run class which we can start..
	{
		for (int i=0;i<1000 ;i++ )
		{
			System.out.println("from run:"+i);
		}
	}
}
class K implements Runnable //Runnable is a interface which is available to java  
{
	public void run()// here we have to mwke the run class which we can start..
	{
		for (int i=1000;i<2000 ;i++ )
		{
			System.out.println("from run:"+i);
		}
	}
}
class L
{

	public static void main(String[] args) 
	{
		J j1=new J();
		Thread t1=new Thread(j1);// here we make the object of the Thread then we supply the object of the class to the runnable interface
		t1.start();// here we call the start the run method of h1
		System.out.println("------");
		K k1=new K();
		Thread t2=new Thread(k1);
		t2.start();

		for (int i=1000;i<3000 ;i++ )
		{
			System.out.println("from main:"+i);
		}
		
	}
}
// runnable attribute is assign to object of the class
/*
from main:2702
from main:2703
from main:2704
from main:2705
from main:2706
from main:2707
from main:2708
from main:2709
from main:2710
from main:2711
from main:2712
from main:2713
from main:2714
from main:2715
from main:2716
from main:2717
from main:2718
from main:2719
from main:2720
from main:2721
from main:2722
from main:2723
from main:2724
from main:2725
from main:2726
from main:2727
from main:2728
from main:2729
from main:2730
from main:2731
from main:2732
from main:2733
from main:2734
from main:2735
from main:2736
from main:2737
from main:2738
from main:2739
from main:2740
from main:2741
from main:2742
from main:2743
from main:2744
from main:2745
from main:2746
from main:2747
from main:2748
from main:2749
from main:2750
from main:2751
from main:2752
from main:2753
from main:2754
from main:2755
from main:2756
from main:2757
from main:2758
from main:2759
from main:2760
from main:2761
from main:2762
from main:2763
from main:2764
from main:2765
from main:2766
from main:2767
from main:2768
from main:2769
from main:2770
from main:2771
from main:2772
from main:2773
from main:2774
from main:2775
from main:2776
from main:2777
from main:2778
from main:2779
from main:2780
from main:2781
from main:2782
from main:2783
from main:2784
from main:2785
from main:2786
from main:2787
from main:2788
from main:2789
from main:2790
from main:2791
from main:2792
from main:2793
from main:2794
from main:2795
from main:2796
from main:2797
from main:2798
from main:2799
from main:2800
from main:2801
from main:2802
from main:2803
from main:2804
from main:2805
from main:2806
from main:2807
from main:2808
from main:2809
from main:2810
from main:2811
from main:2812
from main:2813
from main:2814
from main:2815
from main:2816
from main:2817
from main:2818
from main:2819
from main:2820
from main:2821
from main:2822
from main:2823
from main:2824
from main:2825
from main:2826
from main:2827
from main:2828
from main:2829
from main:2830
from main:2831
from main:2832
from main:2833
from main:2834
from main:2835
from main:2836
from main:2837
from main:2838
from main:2839
from main:2840
from main:2841
from main:2842
from main:2843
from main:2844
from main:2845
from main:2846
from main:2847
from main:2848
from main:2849
from main:2850
from main:2851
from main:2852
from main:2853
from main:2854
from main:2855
from main:2856
from main:2857
from main:2858
from main:2859
from main:2860
from main:2861
from main:2862
from main:2863
from main:2864
from main:2865
from main:2866
from main:2867
from main:2868
from main:2869
from main:2870
from main:2871
from main:2872
from main:2873
from main:2874
from main:2875
from main:2876
from main:2877
from main:2878
from main:2879
from main:2880
from main:2881
from main:2882
from main:2883
from main:2884
from main:2885
from main:2886
from main:2887
from main:2888
from main:2889
from main:2890
from main:2891
from main:2892
from main:2893
from main:2894
from main:2895
from main:2896
from main:2897
from main:2898
from main:2899
from main:2900
from main:2901
from main:2902
from main:2903
from main:2904
from main:2905
from main:2906
from main:2907
from main:2908
from main:2909
from main:2910
from main:2911
from main:2912
from main:2913
from main:2914
from main:2915
from main:2916
from main:2917
from main:2918
from main:2919
from main:2920
from main:2921
from main:2922
from main:2923
from main:2924
from main:2925
from main:2926
from main:2927
from main:2928
from main:2929
from main:2930
from main:2931
from main:2932
from main:2933
from main:2934
from main:2935
from main:2936
from main:2937
from main:2938
from main:2939
from main:2940
from main:2941
from main:2942
from main:2943
from main:2944
from main:2945
from main:2946
from main:2947
from main:2948
from main:2949
from main:2950
from main:2951
from main:2952
from main:2953
from main:2954
from main:2955
from main:2956
from main:2957
from main:2958
from main:2959
from main:2960
from main:2961
from main:2962
from main:2963
from main:2964
from main:2965
from main:2966
from main:2967
from main:2968
from main:2969
from main:2970
from main:2971
from main:2972
from main:2973
from main:2974
from main:2975
from main:2976
from main:2977
from main:2978
from main:2979
from main:2980
from main:2981
from main:2982
from main:2983
from main:2984
from main:2985
from main:2986
from main:2987
from main:2988
from main:2989
from main:2990
from main:2991
from main:2992
from main:2993
from main:2994
from main:2995
from main:2996
from main:2997
from main:2998
from main:2999

*/