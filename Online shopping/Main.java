#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  
  fa=fa-(fa*fd/100)+fs;
  sa=sa-(sa*sd/100)+ss;
  aa=aa-(aa*ad/100)+as;
  std::cout<<"In Flipkart Rs.";
  std::cout<<fa<<"\n";
  std::cout<<"In Snapdeal Rs.";
  std::cout<<sa<<"\n";
  std::cout<<"In Amazon Rs.";
  std::cout<<aa<<"\n";
  if(fa<sa&&fa<aa)
  {
  std::cout<<"He will prefer Flipkart";
  }else if(sa<fa&&sa<aa)
  {
  std::cout<<"He will prefer Snapdeal";
  }else if(aa<fa&&aa<sa){
  std::cout<<"He will prefer Amazon";
  }else if(fa==sa||fa==aa)
  {
  std::cout<<"He will prefer Flipkart";
  }
}