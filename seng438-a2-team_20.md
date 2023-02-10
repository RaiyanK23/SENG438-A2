**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |     |
| -------------- | --- |
| Student Names: |     |
|                |     |
|                |     |
|                |     |

# 1 Introduction

In this lab we will be exploring junit testing using black-box testing techniques like Boundary Value Testing and Equivalence Class Testing. More specifically, we will be testing classes within the JFreeChart Libarary using Eclipse IDE to develop and run the test cases. In addition, we will also implement a mocking strategy to test some of the classes using the JMock library provided. By the end of this lab we should be familiar with designing, developing and executing tests in Java using eclipse.

# 2 Detailed description of unit test strategy

As mentioned in the introduction we will be implementing black-box testing techniques for test cases.  Black box testing is effective when testing applications that we have limited to no knowledge about its internal structures or code, which is the case in this lab. 

The first black box technique that will be used is **boundary value testing**. This technique was derived because a program's functionality often fails when it is provided with arguments that are close or at the boundaries of legal input and are only expected to crash when the arguments exceed the boundaries. A scenario to consider is having a function expect a value greater than 3 but less than 6. A value of 2 would pass a test even though it is less than 3. This happens because the 2 is considered less than 3. The only way to detect the fault would be providing an input value of 3. Boundary value testing accounts for both inputs that are in the defined boundary and the inputs that are not. 

The second black box technique that will be used is **equivalence class testing**. This technique was designed to test method inputs that exhibit similar behavior to ensure the program is tested for different combination of inputs. We will divide input into partitions that would be considered similar. Furthermore, we will establish a unique equivalence class that groups together similar inputs for each test case. 

We will be using the above strategies for the following methods in the Range class:

| **Method** | **Implementation** |
| -------------- | --- |
| getLowerBound() | For a getter, we look at the boundary values of its respective member variable in the Range class. Using the equivalence class technique, we divide the inputs into different range objects: positive lower bounds, negative lower bounds, and special values for lower rounds (i.e positive infinity, negative infinity, and NaN). With respect to the boundary value technique, the boundary values for the positive and negative lower bound equivalence values would be the maximum and minimum allowed value for a double. This is not applicable to the special values equivalence class.|
| getUpperBound() | We follow a similar strategy to getLowerBound() but with respect to the upper bound member variable. |
| getLength() | For this method we used the equivalence class technique. First we divided the inputs into different range objects. Included in these range objects were positive ranges, negative ranges, ranges with equal lower and upper bounds, ranges with larger negative lower bounds and large upper bounds and lastly ranges with a small difference between lower and upper bounds. We then used assertEquals to determine whether the expected length matched the actual length returned by the getLength() method, which would be show whether the test passed or failed. |
| getCentralValue() | Equivalence testing will be used to for this method. The inputs were divided into different range objects. The objects will be tested with different lower and upper bounds, including postive and negative ranges, ranges with equal upper and lower bounds and ranges with large or small differences between the upper and lower bounds. After that we will use assertEquals to conclude if the test passed/failed based on whether the expected value matched the actual central values |
| contains() | We will use both boundary value testing and equivalence class testing for this method. First we will divide the inputs into equivalence classes into a class that represents the value within range, another class that represents values below the lower rangeboundary and a last class that represents the values above the upper range boundary. Then we will test the inputs equal to the lower bound of the range, inputs close to the lower bound, inputs equal to the upper bound of the range and inputs close to the upper bound. Using the assertEquals method to will help determine if the test passed or failed based on whether the input value was within the specified range object or not. |

We will also be using our listed black box techniques for the following methods in the DataUtilities class:

| **Method** | **Implementation** |
| -------------- | --- |
| calculateColumnTotal() 
| For this method, we check some cases where the inputs are valid and invalid. For example, one test case is where we pass
an invalid object value and check for an illegal argument exception, we consider this a boundary condition as it is not as
likely to happen. On the other hand, we have tests for an input of one and an input of multiple values. Each of these test methods only have one assert for better focus and clarity. Furthermore, we use mocks to create a mock for the Values2D class
such that we can fix the return values to be what we want them to be.|

| calculateRowTotal() | 

| createNumberArray() |  
|For this method, we are similarly following the formula in our test plan to have some inputs of equivalence classes as well as
boundary conditions. The createNumberArray() method does not necessarily require mocking as we are not passing an object of a 
class for the input. As such, we do a simple check for an invalid input (null or missing data) and check that it throws the exception that we expect it to as a boundary condition. Then we create some equivalence classes and make various sized arrays
and test that the Number array created is essentially the double array that we passed into it by using asserEquals().|


| createNumberArray2D() | 
|For this method, we are similarly following the formula in our test plan to have some inputs of equivalence classes as well as
boundary conditions. The createNumberArray() method does not necessarily require mocking as we are not passing an object of a 
class for the input. As such, we do a simple check for an invalid input (null or missing data) and check that it throws the exception that we expect it to as a boundary condition. Then we create some equivalence classes and make various sized arrays
and test that the Number array created is essentially the double array that we passed into it by using asserEquals().| |

| getCumulativePercentages() | TBD |

// including the input partitions you have designed

# 3 Test cases developed

Text…

// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

# 4 How the team work/effort was divided and managed

Text…

# 5 Difficulties encountered, challenges overcome, and lessons learned

Text…

# 6 Comments/feedback on the lab itself

Text…
