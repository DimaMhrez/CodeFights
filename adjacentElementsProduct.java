int adjacentElementsProduct(int[] inputArray) {
double max=-1*185484;
    for(int i=0; i<inputArray.length-1; i++){
    int x = inputArray[i]*inputArray[i+1];
    if (max<x)
        max=x;}
    return (int)max;
}

