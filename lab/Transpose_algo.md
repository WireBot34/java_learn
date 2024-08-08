### Algorithm

1. **Start**
2. **Define** a class `MatrixTranspose` with the following methods:
   - `int[][] getMatrix()`: Method to read a matrix from the user.
   - `int[][] transposeMatrix(int[][] matrix)`: Method to find the transpose of the given matrix.
   - `void displayMatrix(int[][] matrix)`: Method to display a matrix.
3. **Method getMatrix()**
   1. **Create** a `Scanner` object for input.
   2. **Prompt** the user to enter the number of rows.
   3. **Read** the number of rows `rows`.
   4. **Prompt** the user to enter the number of columns.
   5. **Read** the number of columns `cols`.
   6. **Create** a 2D array `matrix` of size `rows x cols`.
   7. **Prompt** the user to enter the elements of the matrix.
   8. **Loop** through each element and store it in the matrix.
   9. **Return** the matrix.
4. **Method transposeMatrix(int[][] matrix)**
   1. **Calculate** the number of rows `rows` and columns `cols` of the matrix.
   2. **Create** a 2D array `transpose` of size `cols x rows`.
   3. **Loop** through each element of the original matrix:
      - **Assign** the element at position `[i][j]` in the original matrix to position `[j][i]` in the transposed matrix.
   4. **Return** the transposed matrix.
5. **Method displayMatrix(int[][] matrix)**
   1. **Loop** through each row of the matrix:
      - **Print** each element in the row.
6. **Main Method**
   1. **Create** an object `mt` of the `MatrixTranspose` class.
   2. **Call** the `getMatrix()` method using `mt` to read and return the matrix.
   3. **Call** the `transposeMatrix(int[][] matrix)` method using `mt` to find and return the transposed matrix.
   4. **Call** the `displayMatrix(int[][] matrix)` method using `mt` to display the original matrix.
   5. **Call** the `displayMatrix(int[][] matrix)` method using `mt` to display the transposed matrix.
7. **End**

### Detailed Step-by-Step Algorithm

1. **Start**
2. **Define Class MatrixTranspose**
   - Methods:
     - `int[][] getMatrix()`: Reads a matrix from the user and returns it.
     - `int[][] transposeMatrix(int[][] matrix)`: Finds the transpose of the given matrix and returns it.
     - `void displayMatrix(int[][] matrix)`: Displays the given matrix.
3. **Method getMatrix()**
   1. **Create** a `Scanner` object for input.
   2. **Print** "Enter the number of rows: ".
   3. **Read** the number of rows `rows` using `scanner.nextInt()`.
   4. **Print** "Enter the number of columns: ".
   5. **Read** the number of columns `cols` using `scanner.nextInt()`.
   6. **Create** a 2D array `matrix` of size `rows x cols`.
   7. **Print** "Enter the elements of the matrix: ".
   8. **Loop** through each element using nested loops:
      - For each element, **read** it using `scanner.nextInt()` and store it in `matrix[i][j]`.
   9. **Return** the matrix `matrix`.
4. **Method transposeMatrix(int[][] matrix)**
   1. **Calculate** the number of rows `rows` as `matrix.length`.
   2. **Calculate** the number of columns `cols` as `matrix[0].length`.
   3. **Create** a 2D array `transpose` of size `cols x rows`.
   4. **Loop** through each element using nested loops:
      - For each element at position `[i][j]` in `matrix`, **assign** it to position `[j][i]` in `transpose`.
   5. **Return** the transposed matrix `transpose`.
5. **Method displayMatrix(int[][] matrix)**
   1. **Loop** through each row of the matrix using a for-each loop:
      - For each row, **print** each element followed by a space.
      - **Print** a newline character after each row.
6. **Main Method**
   1. **Create** an object `mt` of the `MatrixTranspose` class.
   2. **Call** `mt.getMatrix()` to get the original matrix and store it in `matrix`.
   3. **Call** `mt.transposeMatrix(matrix)` to get the transposed matrix and store it in `transpose`.
   4. **Print** "Original Matrix:".
   5. **Call** `mt.displayMatrix(matrix)` to display the original matrix.
   6. **Print** "Transpose of the Matrix:".
   7. **Call** `mt.displayMatrix(transpose)` to display the transposed matrix.
7. **End**