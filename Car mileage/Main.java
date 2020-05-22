#include<iostream>
using namespace std;
int main()
{
 float mil,n;
  int l,d;
  std::cin>>mil>>l>>d;
  n=mil*l;
  if(d>n){
  std::cout<<"Cannot reach";
  }else{
  std::cout<<"Can reach";
  }
}