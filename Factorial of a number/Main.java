#include<iostream>
int main(){
  int n,i,f=1;
  std::cin>>n;
  for(i=1;i<n+1;i++){
  f=f*i;
  }
  std::cout<<f;
}