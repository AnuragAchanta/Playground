#include<iostream>
using namespace std;
int main()
{
 int u,ch,k;
  std::cin>>u;
  if(u<=200)
  {
  ch=1;
  }else if(200<u<=400)
  {
  ch=2;
  }else if(400<u<=600)
  {
  ch=3;
  }else if(u>600)
  {
  ch=4;
  }
  switch (ch)
  {
    case 1: k=u*0.5;
      std::cout<<"Rs.";
      std::cout<<k;
      break;
    case 2: k=u*0.65+100;
      std::cout<<"Rs.";
      std::cout<<k;
      break;
    case 3: k=u*0.8+200;
      std::cout<<"Rs.";
      std::cout<<k;
      break;
    case 4: k=u*1.25+425;
      std::cout<<"Rs.";
      std::cout<<k;
      break;
  }
}