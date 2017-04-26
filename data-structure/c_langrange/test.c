#include<stdio.h>

int main()
{
	static int a[10];
	int b[10];
	int i,j;
	for(i = 0; i < 10; i ++)
	printf("a[%d]=%d\n",i,a[i]);
	
	printf("\n");	
	
	for(j = 0; j < 10; j ++)
	printf("b[%d]=%d\n",j,b[j]);
	
	printf("\n");	
	
	return 0;

}
