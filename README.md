# binarry-in

#blog 
so today i learn about the ceiling and the floor concept in binary search. It is as simple if you know the concept of simple binary search
in that the code start with the // Public class Binarry{} in that there is a // public static vooid main(String[] args){}  this is main function of 
a program.after all that we have to create a function it can be  // static int function name(parameters : int[] arr,int target){}
than we have the main algorithem of the code i.e 
// int start= 0;
int end = arr.length-1;
then we apply a while loop
while(start<end){
int mid = start +(end - start)/2;  // this is the formula to find the middle element;
if(target <=arr[mid]){
 end = mid -1;
}
else if(target>arr[mid]){
start = start +1;             // this is only the if condition is used to find the mid
}
else{
target = mid;

at last reurn -1;   // if target value does not match to any value;

so talking about the ceiling 
at place of return -1 you just have to put return start;

for floorinf
at place of return -1 you just have to put return end;

