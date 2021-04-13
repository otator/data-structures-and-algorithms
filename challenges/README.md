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



# Challenge Summary
Linked List Insertion is a challenge where we had to insert values in the beginning and at the end, before and after an element.

## Challenge Description
<!-- Description of the challenge -->
this challenge was about inserting new values at many positions depends on the following methods:
* `append(int <value>)` method that takes in a _value_ and append it at the end of the linked list.
* `insertBefore(int <value>, int <newValue>)` method that inserts _newValue_ immediately before the first _value_.
* `insertAfter(int<value>, int <newValue>)` method that inserts _newValue_ immediately after the first _value_
* `delete(int <value>)` method that deletes _value_ from the list.
All the above methods has been tested in the [AppTest.java](challenges/codes/AppTest.java)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* big o for `append(int <value>)`, `insertBefore(int <value>, int <newValue>)`, `insertAfter(int<value>, int <newValue>)`, and `delete(int <value>)` are O(n)

## Solution
<!-- Embedded whiteboard image -->


# Challenge Summary
<!-- Short summary or background information -->
find the value at given index from the end

## Challenge Description
<!-- Description of the challenge -->
`length()` helper method has been written to get the length of the list (number of elemenst)
`search (int <index>)` helper method return the index from the end 
`kthFromEnd(int <index>)` method that loops over the list until meets the index and return the value at that index.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
O(n)

## Solution
<!-- Embedded whiteboard image -->

# Challenge Summary
<!-- Short summary or background information -->
zip two linked list 
list1: {1} -> {3} -> {2} -> NULL
list2: {5} -> {9} -> {4} -> NULL
after calling the function FullLinkedList.zip(list1, list2)
output: {1} -> {5} -> {3} -> {9} -> {2} -> {4} -> NULL

## Challenge Description
<!-- Description of the challenge -->
a static method called `zip(FullLinkedList list1, FullLinkedList list2)` created to zip two linked lists in one linked list

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
space complexity O(1)

## Solution
<!-- Embedded whiteboard image -->
