package com.greatlearningservice;

public class Mergesort {
    void merge(int a[], int left, int mid, int right) {
        int len1 = mid - left + 1;
        int len2 = right - mid;

        int Left[] = new int[len1];
        int Right[] = new int[len2];

        for (int i = 0; i <len1; i++){
            Left[i] = a[left + i];}
        for (int j = 0; j < len2; j++)
            Right[j] = a[mid + 1 + j];

        int i, j, k;
        i = j = 0;
        k = left;

        while (i < len1 && j < len2) {
            if (Left[i] <= Right[j]) {
                a[k] = Left[i];
                i++;
            } else {
                a[k] = Right[j];
                j++;
            }
            k++;
        }
        while( i<len1){
            a[k] = Left[i];
            i++;
            k++;
        }
        while (j<len2){
            a[k] = Right[j];
            j++;
            k++;
        }
    }
   public void mergeSort(int[] arr,int left,int right){
        if (left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }
}