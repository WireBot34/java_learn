### Algorithm

1. **Start**
2. **Define** a class `LinearSearch` with the following methods:
   - `int[] getArray()`: Method to read an array of integers from the user.
   - `int getTarget()`: Method to read the target integer from the user.
   - `int search(int[] array, int target)`: Method to perform linear search in the array for the target element.
3. **Method** `getArray()`
   1. **Create** a `Scanner` object for input.
   2. **Prompt** the user to enter the number of elements in the array.
   3. **Read** the integer `n` which is the number of elements.
   4. **Create** an integer array of size `n`.
   5. **Prompt** the user to enter the elements of the array.
   6. **Read** each element and store it in the array.
   7. **Return** the array.
4. **Method** `getTarget()`
   1. **Create** a `Scanner` object for input.
   2. **Prompt** the user to enter the target element.
   3. **Read** the target element and store it in an integer variable `target`.
   4. **Return** the target element.
5. **Method** `search(int[] array, int target)`
   1. **Loop** through each element of the array using a variable `i`:
      1. **Check** if the current element `array[i]` is equal to the target element.
      2. **If** equal, **return** the index `i`.
   2. **If** the loop completes without finding the target, **return** -1.
6. **Main Method**
   1. **Create** an object `ls` of the `LinearSearch` class.
   2. **Call** the `getArray()` method using `ls` to read and return the array.
   3. **Call** the `getTarget()` method using `ls` to read and return the target element.
   4. **Call** the `search()` method using `ls` to perform the linear search and store the result.
   5. **If** the result is not -1, **print** the target element and its index.
   6. **Else**, **print** that the target element is not found.
7. **End**

### Detailed Step-by-Step Algorithm

1. **Start**
2. **Define Class LinearSearch**
   - Methods:
     - `int[] getArray()`: Reads an array from the user and returns it.
     - `int getTarget()`: Reads the target element from the user and returns it.
     - `int search(int[] array, int target)`: Performs a linear search and returns the index or -1.
3. **Method getArray()**
   1. **Create** a `Scanner` object for input.
   2. **Print** "Enter the number of elements in the array: ".
   3. **Read** the number of elements `n`.
   4. **Create** an array of integers `array` of size `n`.
   5. **Print** "Enter the elements of the array: ".
   6. **Loop** from `i = 0` to `i < n`:
      - **Read** each element and store it in `array[i]`.
   7. **Return** the array.
4. **Method getTarget()**
   1. **Create** a `Scanner` object for input.
   2. **Print** "Enter the target element to search for: ".
   3. **Read** the target element `target`.
   4. **Return** the target element.
5. **Method search(int[] array, int target)**
   1. **Loop** from `i = 0` to `i < array.length`:
      - **If** `array[i] == target`, **return** `i`.
   2. **Return** -1 if the target element is not found.
6. **Main Method**
   1. **Create** an object `ls` of class `LinearSearch`.
   2. **Call** `ls.getArray()` to get the array.
   3. **Call** `ls.getTarget()` to get the target element.
   4. **Call** `ls.search(array, target)` to perform the search and store the result in `result`.
   5. **If** `result != -1`, **print** "Element `target` found at index `result`".
   6. **Else**, **print** "Element `target` not found in the array".
7. **End**