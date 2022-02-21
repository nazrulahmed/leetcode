#include<bits/stdc++.h>
using namespace std;

int romanToInt(string s);

int main(){
    string s;
    cin>>s;

    int res = romanToInt(s);
	cout<<res<<endl;
	return 0;
}

int romanToInt(string s){
	int num = 0;

	for (int i = 0; i < s.size(); ++i)

	{
		if(s.at(i)=='M'){
			num+=1000;
		}
		else if(i< s.size()-1 && s.at(i)=='C' && s.at(i+1)=='M'){
			
			num+=900;
			i++;
		}
	   else if(i< s.size()-1 && s.at(i)=='C' && s.at(i+1)=='D'){
			
			num+=400;
			i++;
		}
		else if(s.at(i)=='D'){
			
			num+=500;
		}
		else if(s.at(i)=='C'){
			
			num+=100;
		}
		else if(i< s.size()-1 &&  s.at(i)=='X' &&  s.at(i+1)=='C'){
			
			num+=90;
			i++;
		}
		else if(i< s.size()-1 &&  s.at(i)=='X' && s.at(i+1)=='L' ){
			
			num+=40;
			i++;
		}
		else if( s.at(i)=='L' ){
			
			num+=50;

		}
		else if( s.at(i)=='X' ){
			
			num+=10;
		}
		else if(i<s.size()-1 && s.at(i)=='I' && s.at(i+1)=='X' ){
			i++;
			num+=9;
		}
		else if( s.at(i)=='V' ){
			num+=5;
		}
		else if(i< s.size()-1 && s.at(i)=='I'  && s.at(i+1)=='V'){
			i++;
			num+=4;
		}
		
		else if(s.at(i)=='I'){
			num++;
		}
	}

	return num;
}
