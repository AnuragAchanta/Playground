#include<iostream>
using namespace std;
int main()
{
  int year;
  std::cin>>year;
  if(year%4==0)
  {
  if(year%100)
  {
    std::cout<<year;
    std::cout<<" is a leap year";
  }else{
  std::cout<<year;
    std::cout<<" is not a leap year";
  
  }
  }else{
  std::cout<<year;
    std::cout<<" is not a leap year";
  
  }
}