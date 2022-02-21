#include<bits/stdc++.h>
using namespace std;


int singleNumber(vector<int>& nums) {
    
    map<string,int> tracks;


    for (int i = 0; i < nums.size(); ++i)
    {
         int val=tracks[to_string(nums.at(i))]+1;
         
         tracks[to_string(nums.at(i))] = val;
    }
    for (int i = 0; i < nums.size(); ++i)
    {
         if(tracks[to_string(nums.at(i))]==1)
             
            return nums.at(i); 
    }


    

    return 0;
 }

int main(){

	vector<int> input{-4,2,1,2,1};
	int num = singleNumber(input);
     cout<<num;
	return 0;

}


