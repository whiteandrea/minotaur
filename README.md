## COP 4520 Assignment 2

## How to run 
Cd into minotaurprob1 to run the second problem with the command java part1
Cd into minotaurprob2 to run the second problem with the command java vase

## Problem 1 Strategy and Runtimes
For the labyrinth problem the strategy I implemented was to keep an array and a count of how many threads had entered the Labyrinth and mark each thread as visited. The threads were chosen at random to enter the labyrinth. The runtime of this implementation varies due to the random choosing of threads, and multiple threads could be chosen to enter multiple times. In my tests with 100 guests the runtime was around .6 to .8 seconds. 


## Problem 2 Strategy and Runtimes
For the crystal vase problem my strategy I went with was number 3, having the line of guests to enter the room. In my implementation I had the guests all try to enter one at a time, and whether or not they were able to depended on a flag that was changed whenever the previous guest left the showroom. 
This strategy seemed better to me because with the other two, it is possible that guests would be trying the room in an unorganized fashion, and the same guest might try multiple times just to go in once. The runtimes I was getting for this problem were similar to problem one and were more like .6 to .9 seconds. 


