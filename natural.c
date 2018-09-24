#include <stdio.h>
int main()
{
    int k, i, G = 0;
    
    scanf("%d",&k);

    for(i=1; i <= k ; ++i)
    {
        G += i;  
    }

    printf(" %d",G);

    return 0;
}
