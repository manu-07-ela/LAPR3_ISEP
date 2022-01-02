#include <stdio.h>
#include <stdlib.h>

#include "zeroArray.h"
#include "asm.h"

int main(){

    char *fileName = "containers.csv";

    FILE *containerFile = fopen(fileName, "r");
    
    if (!containerFile){ // Verifica se o ficheiro existe
        printf("No file found\n"); 
        exit(-1); 
    } 

    int maxX, maxY, maxZ;
    fscanf(containerFile, "%d,%d,%d", &maxX, &maxY, &maxZ);
    int shipAllocation[maxX][maxY][maxZ];

    zeroArray(maxX, maxY, maxZ, shipAllocation);

    while(!feof(containerFile)){ //leitura de cada linha do ficheiro
        int x, y, z, containerID;
        fscanf(containerFile, "%d,%d,%d,%d", &containerID, &x, &y, &z);
        shipAllocation[x][y][z] = containerID;
    }

    fclose(containerFile);

    int *pointerArray = shipAllocation;
    int totalSlots = maxX*maxY*maxZ;
    long resultado = checkArray(pointerArray, totalSlots);

    int *numPointer = &resultado;

    //printf("Resultado %ld\n", resultado);
    printf("Resultado %ld\n", *numPointer);
    numPointer++;
    printf("Resultado %ld\n", *numPointer);
    
    
    return 0;
}