#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int MAX_LENGTH = 100;
    char ch;
    char str[MAX_LENGTH];
    char sentence[MAX_LENGTH];
    
    scanf("%c", &ch);
    scanf("%s", str);
    scanf("\n");
    scanf("%[^\n]%*c", &sentence);
    
    printf("%c\n", ch);
    printf("%s\n", str);
    printf("%s\n", sentence);    
    
    return 0;
}
