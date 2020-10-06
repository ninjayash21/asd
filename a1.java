import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;using namespace std;
int main() {
int t;cin>>t;
while(t--){
   int n,k,sum=0;
   cin>>n>>k;
  int arr[n];
  for(int i=0;i<n;i++)
{
    cin>>arr[i];
}
 int p = sizeof(arr)/sizeof(arr[0]);

    sort(arr, arr+p);
for(int i=1;i<n;i++){

    sum+=(k-arr[i])/arr[0];
}
cout<<sum;
 cout<<endl;
   }return 0;
   }