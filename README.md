# COMP257 Final Project
This is the repo for my final project. This project is trying to solve the longest increasing subsequence problem with three
different algorithms: [Brute Force](LongestIncreasingSubsequence/src/main/java/Model/BruteForceSolution.java), [Dynamic Programming](LongestIncreasingSubsequence/src/main/java/Model/DynamicProgrammingSolution.java), 
and [Greedy](LongestIncreasingSubsequence/src/main/java/Model/GreedyStrategySolution.java). The project will run different size of test cases on these algorithms and track their runtimes. This project will provide line chart 
to visualize the result as well. 

## Content
[Repo Instruction](#Repo-Instruction)

[Code Explanation](#Code-Explanation)

### Repo Instruction
The necessary documents, including [*final project report*](/Document/COMP257_Final_Project_Report.pdf), [*result screenshots*](/Document/TestResult1.png), and [*runtime plot*](/Document/RunTimePlot1.png), are located
in [Document](COMP257-Final-Project/Document) folder.

The source code is written in Java and the project is located in [LongestIncreasingSubsequence](COMP257-Final-Project/LongestIncreasingSubsequence) folder. In this folder, you can find all the source code under [src](COMP257-Final-Project/LongestIncreasingSubsequence/src) folder.
For more details of the source code, you can find in the [Code Explanation](#Code-Explanation) section. 
### Code Explanation
The code has four parts: [*Controller*](LongestIncreasingSubsequence/src/main/java/Controller), [*Model*](LongestIncreasingSubsequence/src/main/java/Model), [*Utility*](LongestIncreasingSubsequence/src/main/java/Util), and [*UnitTest*](LongestIncreasingSubsequence/src/test)

#### Controller
The controller is the main gate of the whole project. The controller contains all necessary functions to control the different algorithm. For example:
```
LongestIncreasingSubsequence.runBruteForceSolution(int[] input)
```
The user can easily use these methods to invoke these algorithms and the controller can make the project flexible. Currently, the controller provides methods for users to 
run the algorithm with different inputs, and calculate the runtime for different algorithms.

#### Model
The model is the part that contains different algorithms. The [*Solution*](LongestIncreasingSubsequence/src/main/java/Model/Solution.java) object is the base model object for all
others algorithms' objects. Each algorithm object contains the specific algorithm to solve this issue. 

#### Utility
The [*Util*](LongestIncreasingSubsequence/src/main/java/Util) part contains the necessary utilities for models or have other purposes. In this folder, the [*RuntimePlot*](LongestIncreasingSubsequence/src/main/java/Util/RuntimePlot.java)
object is used to generate the runtime plot with the help of JavaFX. The [*TestCases*](LongestIncreasingSubsequence/src/main/java/Util/TestCases.java) object contains all the test cases for the unit test. 

#### Test
The test of this object utilized the JUnit framework to do the test. The structure of the test is each test runs a test case for all the algorithms. All of these algorithms should have the same result. Each test will print 
the runtime for each algorithm as well. The user can find the result in console. 

---
For more information or if you have any questions, please contact me!
