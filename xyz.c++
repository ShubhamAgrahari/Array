#include <bits/stdc++.h>
using namespace std;

inline void scanint(int *x){
	register char c = getchar_unlocked();
	*x = 0;
	while(c < 48 || c > 57){
		c = getchar_unlocked();
	}
	while(c < 58 && c > 47){
		*x = *x*10+c-48;
		c = getchar_unlocked();
	}
}

int main(void){
	int t;
	scanint(&t);
	printf("%d\n",t);
}