# Temperature Regulation in a Greenhouse

## Scenario

You're managing a large greenhouse that grows sensitive tropical plants. These plants thrive only when the temperature is kept within a very narrow range throughout the day. Due to the changing weather and sunlight, the temperature inside the greenhouse varies considerably.

To monitor and adjust the climate inside the greenhouse, you've set up a system that records the temperature at regular intervals throughout the day. However, with the sheer volume of data collected, it's become cumbersome to manually review and adjust the heating or cooling as needed.

## Objective

Your task is to develop an automated system that identifies the longest period during the day when the temperature inside the greenhouse remains within the optimal range for the plants. The optimal temperature range is between 18°C and 22°C, inclusive.

Given the temperature readings throughout the day at regular intervals, your system needs to find the longest continuous period where the temperatures stay within this optimal range. This will allow you to focus on adjusting the climate controls only during the periods outside this optimal window, saving energy and manpower.

## Input

- An array of integers representing the temperature readings throughout the day at regular intervals.

## Output

- The length of the longest continuous period (in terms of the number of readings) where the temperature remains within the optimal range (18°C to 22°C, inclusive).

## Sample Data

### Input 1
```java
int[] temperatures = {17, 19, 21, 23, 20, 19, 22, 21, 18, 17, 22, 20, 21};
```
### Output 1
6

### Input 2
```java
int[] temperatures = {16, 18, 20, 21, 21, 20, 19, 18, 23, 24, 22, 20, 19, 18, 17};
```
### Output 1
9

