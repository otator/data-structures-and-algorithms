# Challenge_01 Summary
reverse an array 

## Challenge Description
reverseArray(int[] arr) method that takes in an array and reverse its element and return reversed array.

## Approach & Efficiency
iterating backward over the array, and pushing the original array elemenst to a new array.

time complexety: **O(n)**

## Solution
<img src="./assets/array-reverse.png" width ="600px">


# Challenge_02 Summary
insert a number in the middle of an array 

## Challenge Description
insertShiftArray(int[] arr, int n) method that takes in an array and a number and and insert the number in the array at the miidle

## Approach & Efficiency
iterate over the first half of the array and then add the items to a new array.

insert the number in the new array

iterate over the second half of the array and add its items to the new array and return that array.

time complexety: **O(n)**

## Solution
<img src="./assets/array-shift.jpg" width ="600px">


# Challenge_03 Summary
<!-- Short summary or background information -->
search for a value using binary search algorithm

## Challenge Description
<!-- Description of the challenge -->
`binarySearch(int[] arr, int value)` method that takes in sorted array and a value and search for the value in the array using binary search algorithm 

and if the value found, its index will be retuned and if the value is not in the array, the method will return -1


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
binary search algorith time complexity is **O(log2(n))**

## Solution
<!-- Embedded whiteboard image -->
<img src="./assets/array-binary-search.png" width ="600px">

 # Singly Linked List
<!-- Short summary or background information -->
linked list unlike arrays itis the basic dynamic way to store data with the limit of the memory

## Challenge
<!-- Description of the challenge -->
create a dynamic list using classes. three methods **insert()**, **includes()**, and **toString()**. had been created.


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- big o for `insert(int <n>)` is O(1)
- big o for `toString()` and `includes(int <n>)` is O(n);

## API
<!-- Description of each method publicly available to your Linked List -->
* `insert(int<n>)` takes in a integer number and insert it in the beggingin of the list at index 0.
* `includes(int <n>)`takes in an integer and return true if the number found in the list, else it will return false.
* `toString()` the printout the lineked list elements as: **{4} -> {20} -> {4} -> {5} ->  NULL**

