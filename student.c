#include<stdio.h>
using namespace std;

struct Student 
{
	int age;
	int name[30];
}

	void getData(struct Student *p){
		printf("Enter name");
		scanf("%c",p->name);
		printf("Enter age");
		scanf("%d",&p->age);
	} 

void main(){
	struct Student s[10];
	int record;
	printf("Enter number of records");
	scanf("%d",&record);
	
	for(int i = 0;i < record;i++)
	{
		
	
	}
}
