#include<iostream>
using namespace std;
void rev(int num){
    if(num==0) return;
    int r=num%10;
    cout<<r<<",";
    rev(num/10);
}

int main(){
    int n;
    cin>>n;
    rev(n);
    return 0;
}