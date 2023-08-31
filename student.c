//Name -Rishiraj Potdukhe SEA56

#include<stdio.h>

struct Student 
{
	int age;
	char name[30];
};

void getData(struct Student *p){
	printf("Enter name\t");
	scanf("%s",p->name);
	printf("Enter age\t");
	scanf("%d",&p->age);
	}

void display(struct Student p){
    printf("\nName is %s",p.name);
    printf("\nAge is %d",p.age);
}

void search(struct Student s[10]){
    int temp;
    printf("\nWhich record you want to search");
    scanf("%d",&temp);

    display(s[temp]);
}

void modify(struct Student s[10]){
    int pos;
    printf("\nWhich record do you want to modify?");
    scanf("%d",&pos);

    getData(&s[pos]);
    
    printf("The modified record is");
    display(s[pos]);    
}

void insert(struct Student s[10],int * ptr){
    int pos;
    printf("At which position do you want to insert");
    scanf("%d",&pos);

    for (int i = pos; i < ; i++)
    {
        /* code */
    }
    


}

void delete(struct Student s[10],int record){

int pos;
printf("\n enter record  which is to be deleted : ");
scanf("%d",&pos);
for(int i=pos;i<record;i++)
{
    s[i-1]=s[i];
}
record = record - 1;

for (int n = 0; n < record; n++)
    { 
        display(s[n]);
    }
}


void main(){
	struct Student s[10];
	int record;
	printf("Enter number of records");
	scanf("%d",&record);
	
	for(int i = 0;i < record;i++)
	{
		getData(&s[i]);
	}

    for(int i = 0;i < record;i++)
	{
		display(s[i]);
	}

    search(s);
    modify(s);
    insert(s,record);
    delete(s,record);
}
