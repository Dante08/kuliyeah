*/source code menghitung tegangan arus listrik
source code by Muhammad Bella BN
*/

#include<iostream>
using namespace std;
void tegangan ()
{
	float i,r,v;
	cout<<"Besar Arus i = ";cin>>i;
	cout<<"Besar Hambatan R = ";cin>>r;
	v=i*r;
	cout<<"Besarnya Tegangan V = "<<v<<" volt"<<endl;
}

float i2()
{
	float r2,v2;
	cout<<"Besar Tegangan V = ";cin>>v2;
	cout<<"Besar Hambatan R = ";cin>>r2;
	return(v2/r2);
}
float r3()
{
	float v3,i3;
	cout<<"Besar Tegangan V = ";cin>>v3;
	cout<<"Besarnya Arus I = ";cin>>i3;
	return (v3/i3);
}

main()
{
int pil;char jawab = 'Y';
while (jawab=='Y'|| jawab == 'y')
{
	cout<<"Menghitung Besarnya Arus, Tegangan dan Hambatan"<<endl;
	cout<<"1.Hitung Tegangan"<<endl;
	cout<<"2.Hitung Arus"<<endl;
	cout<<"3.Hitung Hambatan"<<endl;

	cout<<"pilih : ";
	cin>>pil;
	if (pil==1)
	tegangan();
	if (pil==2)
	cout<<"Besarnya Arus I = "<<i2()<<" Ampere"<<endl;
	if (pil==3)
	cout<<"Besarnya Hambatan R = "<<r3()<<" Ohm"<<endl;

	cout<<"Hitung lagi?";
	cin>>jawab;
}
	return 0;
}

