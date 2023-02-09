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

As mentioned in the introduction we will be implementing black-box testing techniques for out test cases.  Black box testing is effective when testing applications that we have limited to no knowledge about it's internal structures or code, which is the case in this lab. 
The first black box technique that will be used is boundary value testing. This technique was derived because a programs fucntionality often fails when it is provided with arguments that are close or at the boundaries of legal input and are only expexted to crash when the arguments exceed the boundaries. A scenario to consider is having a fucntion expect a value greater than 3 but less than 6. A value of 2 would pass a test even though it is less than 3. This happens beacuse the 2 is considered less than 3. The only way to detect the fault would be provind an input value of 3. Boundary value testing accounts for both inputs that are in the defined boundary and the inputs that are not. 
The second black box techique that will be used is equivalence class testing. This technique was designed to test method inputs that exhibit similar behavior to ensure the program is tested for different combination of inputs. We will divide input into partitions that would be considered similar. Furthermore, we will establish a unique equivalence class that groups together similar inputs for each test case. 

For the Range and DataUtilities class we will be using both Boundary Value Testing and Equivalence Class Testing to test the following methods:
getLowerBound()
getUpperBound()
getLength()
getCentralValue()
contains()
----
----
----
----
----



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
