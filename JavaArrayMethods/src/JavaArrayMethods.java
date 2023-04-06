/*
* Beyza CEVRİM | april 5th 2023
 */

import java.util.Arrays;

public class JavaArrayMethods {

    public static void main(String[] args){

        double score =0;
        int[] array1={3,11,15,13,4,5,7,8,4,5,7,8,2,3,2,3,4,5,7,8,9,11,15,13,4,5,7,8,9,11,15,13,9,11,15,13};
        int[] array2={6,2,3,4,5,1};
        int[] array3={5,7,4,1,5,7,8};
        int[] array4={4,5,1,8,7};
        int[] array5={4,5,1,8,7};
        int[] array6={4,5,4,8,7,4,4,1,8,7,4,4,1,8,4};
        int[] array7={4,9,15,12,6,8,25};
        int[] array8={9,11,15,13,4,5,7,8,3,6};
        int[] array9={1,3,2,5};
        int[] array10={4,5,1,3,2};
        int[][] array11={{4,1,0,5},{5,5,1,3},{7,5,1,0},{1,0,9,4}};
        double[][] array12={{1,2,2},{5,-1,1,},{0,1,0}};
        double[][] array13={{6,5,-6},{7,1,6},{0,0,-1},{1,0,-3}};
        double[][] array14={{4,1.5,0},{5,-6.5,1},{-7,8.5,1},{1,0,9.5}};
        double[][] array15={{6,2.5,-6},{7,1,9},{0,0,-1},{1,0.5,-3}};
        double[][] array16={{4,1.5,0,-5},{5,-6.5,1,-3},{-7,8.5,1,0},{1,0,9.5,4}};
        double[][] array17={{6,2.5,-6,7.5},{7,1,6,9},{0,0,-1,0.5},{1,0.5,-3,1}};
        int [][] array18={{4,1,0},{5,5,1},{-7,8,1},{1,0,9}};


        if(sumOfLargestAndSmallestNumber(array1)==17)
            score +=5;
        if(numberOfDistinctElements(array1)==10)
            score +=5;
        int [] rewarr= reverseArray(array2);
        if(rewarr[0]==1 && rewarr[1]==5 && rewarr[2]==4 && rewarr[3]==3 && rewarr[4]==2 && rewarr[5]==6 )
            score +=5;
        if(indexOfTheSmallestElement(array3)==3)
            score +=5;
        if(areArraysEqual(array4,array5))
            score +=5;
        if(mostRepeatedElement(array6)==4)
            score +=5;
        int [] retinsert= insertElementAtIndex(array7,3,5);
        if(retinsert[3]==5 && retinsert.length==array7.length+1)
            score +=5;
        int [] retremove= removeElementAtIndex(array8,2);
        if(retremove[2]==13 && retremove.length==array8.length-1)
            score +=5;
        if(countIntersectionElements(array9,array10)==4)
            score +=10;
        if(numberOfElementsInUnionOfTwoArrays(array9,array10)==5)
            score +=10;
        int [][] fmbi= multiplyMatrixWithNumber(array18,5);
        if(fmbi[0][0]==20 && fmbi[1][1]==25 && fmbi[1][2]==5 && fmbi[2][0]==-35 && fmbi[3][1]==0 && fmbi[3][2]==45)
            score +=5;
        if(determinantOfMatrix(array12)==9.0)
            score +=7.5;
        double[][] ftrans= transposeOfMatrix(array13);
        if(ftrans[0][0]==6 && ftrans[0][1]==7 && ftrans[1][1]==1 && ftrans[2][2]==-1 && ftrans[2][3]==-3)
            score +=7.5;
        double  [][] fsum= sumOfTwoMatrices(array14,array15);
        if(fsum[0][0]==10 && fsum[0][2]==-6 && fsum[1][1]==-5.5 && fsum[1][2]==10 && fsum[3][1]==0.5 && fsum[3][2]==6.5)
            score +=10;
        double [][] fmult= multiplicationOfTwoMatrices(array16,array17);
        if(fmult[0][0]==29.5 && fmult[0][3]==38.5 && fmult[1][2]==-61 && fmult[1][3]==-23.50 && fmult[2][2]==92 && fmult[3][0]==10)
            score +=10;
        System.out.print("Score-> "+ score);

    }

    public static int sumOfLargestAndSmallestNumber(int[] myarray){
        //return the sum of the largest and smallest elements in the myarray array that comes as a parameter
        if(myarray==null) {
            System.out.println("array is null");
            return 0;
        }
        else{
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j : myarray) {
                if (j < min) min = j;
                if (j > max) max = j;
            }
            return min+max;
        }

    }

    public static int numberOfDistinctElements(int[] myarray) {
        int distinctElementNumber =1;
        if(myarray!=null){
            Arrays.sort(myarray);
            int prevElement= myarray[0];
            for(int number : myarray){
                if(number != prevElement){
                    distinctElementNumber++;
                    prevElement = number;
                }
            }
        }
        else {
            System.out.println("array = null");
            distinctElementNumber=0;
        }

        return distinctElementNumber;
    }

    public static int[] reverseArray(int[] myarray){

        //reverse the myarray string that comes as a parameter
        // if myarray={2,3,5,4} the array to return {4,5,3,2}
        int temp;
        if(myarray == null) return null;
        for(int i=0 ; i<myarray.length/2 ; i++){
            temp = myarray[i];
            myarray[i] = myarray[(myarray.length-1)-i];
            myarray[(myarray.length-1)-i] = temp;
        }
        return myarray;
    }

    public static int indexOfTheSmallestElement(int[] myarray){
        //return the index of the smallest element of the myarray array as a parameter
        // myarray {3,5,7,2,4,2}, smallest element of array is 2 and index of 2 is 3, smallest element
        // if more than one, the first index found will be returned
        int min = Integer.MAX_VALUE;
        int index=0;
        if(myarray != null){
            for(int element : myarray){
                if(element < min){
                    min = element;
                }
            }
            index = Arrays.binarySearch(myarray, min);
        }
        else
            System.out.println("array = null");

        return index;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2){
        //parametre olarak gelen array1 ve array2 dizileri aynı ise  true değilse false döndürün
        // eğer array1={1,2,3,4} ve array2={1,2,3,4] ise array1 ve array2 birbiriyle aynıdır
        // eğer array1={1,2,3,4} ve array2={1,2,4,3] ise array1 ve array2 birbirinden farklıdır.

        return Arrays.equals(array1, array2) ;
    }

    public static int mostRepeatedElement(int[] myarray){
        //return the most repeated element in the myarray array as a parameter
        // if myarray={1,2,2,3,2,4} then the most repeated element is 2.
        int mostFrequent=0, preivousMaxFrequency=0, frequency=0;

        if(myarray !=null){
            for(int element : myarray){
                for(int each : myarray){
                    if(element == each) frequency++;
                }
                if(frequency > preivousMaxFrequency){
                    preivousMaxFrequency = frequency;
                    mostFrequent = element;
                }
                frequency=0;
            }
        }
        else System.out.println("array = null");
        return mostFrequent;
    }

    public static int[] insertElementAtIndex(int[] myarray, int i, int k){
        // Add the k element to the myarray array as a parameter, to the i index, which comes as a parameter, and return the new array
        //if myarray={2,3,5,1,4}, i=2, and k=10 the new array is {2,3,10,5,1,4}, in this case {2,3, return array 10.5,1,4}
        // return myarray={0} if index i is greater than the largest index of the array.
        // return myarray={0} if myarray={2,3,5,1,4} and i=6.

        int[] newArray = (myarray!=null)? new int[myarray.length + 1] : new int[]{0};
        if(myarray != null) {
            for (int index = 0; index <= myarray.length; index++) {
                if (index < i) newArray[index] = myarray[index];
                else if (index == i) newArray[index] = k;
                else newArray[index] = myarray[index - 1];
            }
        }
        else System.out.println("array = null");
        return newArray;
    }

    public static int[] removeElementAtIndex(int[] myarray, int i){
        //removing the element in the index i that comes as a parameter from the myarray array, which comes as a parameter, and return the new array formed
        // if myarray={2,3,5,1,4} and i=2 the new array is {2,3,1,4}
        // return myarray={0} if index i is greater than the largest index of the array.
        // return myarray={0} if myarray={2,3,5,1,4} and i=6.
        int[] newArray = (myarray!=null)?  new int[myarray.length-1] : new int[]{0};
        if(myarray != null){
            for(int index=0 ; index<myarray.length ; index++){
                if(index<i) newArray[index] = myarray[index];
                else if(index>i) newArray[index-1] = myarray[index];
            }
        }
        else System.out.println("array = null");
        return newArray;
    }

    public static int [][] multiplyMatrixWithNumber(int [][] myarray, int i){
        //suppose the myarray array as a parameter is a 2D matrix MxN
        // Multiply all the elements of myarray by the integer i as a parameter and return the resulting MxN array
        if(myarray != null){
            for(int in=0 ; in<myarray.length ; in++){
                for(int j=0 ; j<myarray[in].length ; j++){
                    myarray[in][j] *= i;
                }
            }
        }
        else System.out.println("array = null");

        return myarray;
    }

    public static double determinantOfMatrix(double  [][] myarray){
        //suppose the myarray array as a parameter is a 2D 3x3 matrix
        // A = { 1 5}
        // { 4 2} det(A) = 1*2 - 4*5
        // calculate the determinant of myarray and return the resulting value
        double det = 0;
        if(myarray != null){
            det += ( myarray[0][0] * myarray[1][1] * myarray[2][2] + myarray[1][0] * myarray[2][1] * myarray[0][2] + myarray[2][0] * myarray[0][1] * myarray[1][2]);
            det -= (myarray[0][2] * myarray[1][1] * myarray[2][0] + myarray[0][0] * myarray[2][1] * myarray[1][2] + myarray[1][0] * myarray[0][1] * myarray[2][2]);
        }
        else System.out.println("array = null");
        return det;
    }

    public static double [][] transposeOfMatrix(double [][] myarray){
        // Suppose the myarray array as a parameter is a 2D matrix MxN
        // find the transpose of myarray and return the resulting 2D NxM array
        double[][] newArray = (myarray!=null)? new double[myarray[0].length][myarray.length] : new double[][]{{0},{0}};
        //double temp ;
        if(myarray!=null) {
            for (int i = 0; i < myarray.length; i++) {
                for (int j = 0; j < myarray[i].length; j++) {
                    newArray[j][i] = myarray[i][j];
                }
            }
        }
        return newArray;
    }

    public static double [][] sumOfTwoMatrices(double[][] myarray1, double[][] myarray2){
        // Let's assume that myarray1 and myarray2 are 2D matrices each.
        // find the sum of myarray1 and myarray2 and return the resulting 2D MXN array
        if(myarray1==null || myarray2==null || myarray1.length != myarray2.length) return null;

        double[][] newArray = new double[myarray1.length][myarray1[0].length];
        for(int i=0 ; i<myarray1.length ; i++){
            for(int j=0 ; j<myarray1[i].length ; j++){
                newArray[i][j] = myarray1[i][j] + myarray2[i][j];
            }
        }
        return newArray;
    }

    public static double  [][] multiplicationOfTwoMatrices(double [][] myarray1, double [][] myarray2){
        // Suppose myarray1 and myarray2 are 2D NxN matrices
        // Find the product of the matrices myarray1 and myarray2 and return the resulting NXN array
        if (myarray1 == null || myarray2 == null || myarray1[0].length != myarray2.length) {
            return null;
        }

        int n = myarray1.length;
        int m = myarray2[0].length;
        double[][] newArray = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                double sum = 0;
                for (int k = 0; k < myarray1[0].length; k++) {
                    sum += myarray1[i][k] * myarray2[k][j];
                }
                newArray[i][j] = sum;
            }
        }
        return newArray;
    }

    public static  int countIntersectionElements(int [] array1, int [] array2){
        //Find the number of elements at the intersection of array1 and array2 as parameters
        //if array1={1,3,2,5,9,6} and array2={4,6,8,1,3,2} at the intersection of the two arrays, the resulting elements are {1,3,2,6}
        //return 4 because there are 4 elements at the intersection.
        //return 0 if there is no element at the intersection.
        int index=0;
        boolean belongsToArray2=false;
        double[] newArray =  (array1.length > array2.length)? new double[array1.length] :  new double[array2.length];
        for (double array1Element : array1){
            for (double array2Element : array2){
                if(array1Element == array2Element){
                    belongsToArray2=true;
                    break;
                }
                if(belongsToArray2 && Arrays.binarySearch(newArray, array1Element)<0){
                    newArray[index] = array1Element;
                    Arrays.sort(newArray);
                    index++;
                    belongsToArray2 = false;
                }
            }
        }
        return index+1;
    }

    public static  int numberOfElementsInUnionOfTwoArrays(int [] array1, int [] array2){
        // find the number of elements in the combination of array1 and array2 as parameters
        //array1={1,3,2,5,9,6} and array2={4,6,8,1,3,2} the join {1,2,3,4,5,6,8, 9}
        //return 8 because there are 8 elements in the join.

        int index=0;
        int[] newArray =  new int[array1.length+array2.length];
        for (int j : array1) {
            if (Arrays.binarySearch(newArray, j) < 0) {
                newArray[index] = j;
                index++;
                Arrays.sort(newArray);
            }
        }
        for (int j : array2) {
            if (Arrays.binarySearch(newArray, j) < 0) {
                newArray[index] = j;
                index++;
                Arrays.sort(newArray);
            }
        }
        return index;
    }
}
