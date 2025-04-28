class solution {
public int getsecondLargest(int[] arr) {
int largest=0, second_largest=0;
for(int i=0; i < arr.length ; i++){
if(arr[i]>largest){
second_largest=largest;
largest=arr[i] ;
}else if(arr[i]>second_largest && arr[i]<largest){
second_largest=arr[i];
}
}
if(second_largest==0){
return -1;
}else{
return second_largest;
      }
    }
}
