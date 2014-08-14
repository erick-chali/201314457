#include <stdio.h>

int main()
{
    int limit;
    
    printf("201314457 Erick Gustavo Chali Ulin\n");
    printf("*****Programa 1*****\n");
    printf("Ingrese un numero\n");
    scanf("%i", &limit);
    printf("El listado de los numeros impares de 1 a %d\n",limit);
    for(int x=1 ; x<=limit ; ++x){
        if((x%2)!=0){
            printf("El %d es impar.\n",x);
        }
    }
    return 0;
}
