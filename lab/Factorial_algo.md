### Algorithm

1. **Start**
2. **Define** a class `Factorial` with the following:
   - **Variables**: `int n`, `int i`, `int f = 1`
   - **Methods**: `input()`, `fact()`
3. **Method** `input()`
   1. **Create** a `Scanner` object `sc` to read input from the user.
   2. **Print** "Enter a number: ".
   3. **Read** the integer input from the user and store it in variable `n`.
   4. **Close** the `Scanner` object `sc`.
4. **Method** `fact()`
   1. **Initialize** a loop variable `i` to 1.
   2. **Repeat** the following steps until `i` is less than or equal to `n`:
      1. **Multiply** `f` by `i` and store the result in `f`.
      2. **Increment** `i` by 1.
   3. **Print** "Factorial Of The Number Is: " followed by the value of `f`.
5. **Main Method**
   1. **Create** an object `factcal` of class `Factorial`.
   2. **Call** the method `input()` using `factcal` to read user input.
   3. **Call** the method `fact()` using `factcal` to calculate and print the factorial.
6. **End**

### Detailed Step-by-Step Algorithm

1. **Start**
2. **Define Class Factorial**
   - Variables:
     - `int n`: to store the number input by the user.
     - `int i`: loop variable.
     - `int f = 1`: to store the factorial result.
   - Methods:
     - `void input()`: method to read user input.
     - `void fact()`: method to calculate the factorial.

3. **Method input()**
   1. **Create** a `Scanner` object `sc` to read input from the user.
   2. **Print** "Enter a number: ".
   3. **Read** the integer input from the user and store it in variable `n`.
   4. **Close** the `Scanner` object `sc`.

4. **Method fact()**
   1. **Initialize** `i` to 1.
   2. **Loop** while `i` is less than or equal to `n`:
      - **Multiply** `f` by `i` and store the result in `f`.
      - **Increment** `i` by 1.
   3. **Print** "Factorial Of The Number Is: " followed by the value of `f`.

5. **Main Method**
   1. **Create** an object `factcal` of class `Factorial`.
   2. **Call** the method `input()` using the `factcal` object to read user input.
   3. **Call** the method `fact()` using the `factcal` object to calculate and print the factorial.

6. **End**