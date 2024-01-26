---
tags:
  - "#maths"
  - "#college"
---
Table of Content
[[Academics/Semester 3/Probablity and Stats/Theory/Untitled#Random Variable|Random Variable]]
[[Academics/Semester 3/Probablity and Stats/Theory/Untitled#PMF and PDF|PMF and PDF]]
[[Academics/Semester 3/Probablity and Stats/Theory/Untitled#Mean|Mean]]
## Random Variable
A random variable, denoted as X, represents uncertain outcomes in statistics: discrete or continuous, showcasing possible values from random experiments with associated probabilities.

- **Discrete random variables** can take on a countable number of distinct values. For example, the outcome of rolling a six-sided die is a discrete random variable as it can only result in values from 1 to 6.

- **Continuous random variables** can take on any value within a certain range. For instance, the height of a person, time taken to complete a task, or temperature measurements are continuous random variables as they can take on any value within a range.

## PMF and PDF
The Probability Mass Function (PMF) applies to _discrete random variables,_ indicating the probability distribution of each specific value the variable can take. It assigns probabilities to individual outcomes.

The Probability Density Function (PDF) pertains to _continuous random variables, describing the likelihood of the variable falling within a specific range of values. It represents probabilities as a function over a continuous range.

## Mean
Also known as the average, it is the sum of all values in a dataset divided by the number of data points. The mean is sensitive to outliers as it considers all values equally.

## Median
The middle value in a dataset when it's arranged in ascending or descending order. If there's an even number of values, the median is the average of the two middle values. The median is less affected by extreme values and is a measure of central tendency.

## Mode
The mode represents the value that occurs most frequently in a dataset. A dataset can have one mode (unimodal), multiple modes (multimodal), or no mode if all values appear with equal frequency. Modes are useful in categorical or discrete datasets.
## Difference between uniform and exponential distribution
### 1. Uniform Probability Distribution
   - **Shape**: Uniform distribution is characterized by a constant probability for all values within a specified range. It forms a rectangular shape when graphed, with all outcomes having equal probability.
   - **Probability**: Every value within the range has an equal chance of occurring. For example, rolling a fair six-sided die has a uniform distribution because each number (1 through 6) has an equal probability of 1/6.
   - **Probability Density Function (PDF)**: The probability density function for a continuous uniform distribution is flat within the range and zero elsewhere.
   - **Applications**: Used in situations where all outcomes are equally likely, such as random number generation, certain types of simulations, and modeling scenarios where each outcome is equally probable.
![](https://media.geeksforgeeks.org/wp-content/uploads/20220420172352/UDG.png)

### 2. Exponential Distribution
   - **Shape**:  The probability distribution of the time between events in a Poisson point process, i.e., a process in which events occur continuously and independently at a constant average rate.
   - **Probability**: It is used to model the time until the next event occurs. It has a higher probability of shorter durations between events and a lower probability of longer durations, forming a skewed, right-tailed shape.
   - **Probability Density Function (PDF)**: The probability density function for the exponential distribution has a decaying exponential shape.
   - **Applications**: Widely applied in various fields to model waiting times, such as in queuing theory, reliability analysis, survival analysis, and telecommunications.
![](https://www.itl.nist.gov/div898/handbook/eda/section3/gif/exppdf.gif)
## Differentiate between Mesokurtic, Platykurtic and Leptokurtic in table

| Characteristic       | Mesokurtic                           | Platykurtic                            | Leptokurtic                            |
|----------------------|--------------------------------------|----------------------------------------|----------------------------------------|
| Kurtosis             | Similar to normal distribution.       | Kurtosis < 3 (lighter tails).          | Kurtosis > 3 (heavier tails).          |
| Tails                | Neither too peaked nor too flat.      | Flatter tails compared to normal.      | Tails are heavier or more peaked.      |
| Outliers             | Moderate number of outliers.          | Fewer extreme values/outliers.         | More extreme values/outliers.          |
| Probability Density  | Concentrated around the mean.         | Spread-out distribution.               | Concentration in tails; less in mean. |
| Histogram Shape      | Moderate peak in the histogram.       | Flatter histogram peak.                | Higher and sharper histogram peak.     |
| Examples             | Normal distributions.                 | Uniform or light-tailed distributions.| Distributions with heavy tails.        |

## Positive Correlation, linear Correlation and multiple Correlation
### 1. Positive Correlation
   - **Definition**: A positive correlation exists between two variables when they tend to move or change in the same direction. When one variable increases, the other variable also tends to increase, and when one decreases, the other tends to decrease.
   - **Representation**: It is often visualized as a pattern on a scatter plot where points roughly form an upward trend from left to right.
   - **Example**: An example of positive correlation is the relationship between the amount of study time and exam scores - generally, as study time increases, exam scores also tend to increase.

### 2. Linear Correlation
   - **Definition**: Linear correlation refers to the strength and direction of the relationship between two quantitative variables. It specifically describes the degree to which the relationship between two variables can be approximated by a straight line.
   - **Representation**: Visualized through a scatter plot, a linear correlation implies that the data points tend to fall closer to a straight line. The correlation coefficient (such as Pearson's correlation coefficient) measures the strength and direction of this linear relationship.
   - **Example**: If you observe a set of data where changes in one variable result in proportional changes in another, and the data points align closely in a straight line, it suggests a strong linear correlation between those variables.

### 3. Multiple Correlation
   - **Definition**: Multiple correlation refers to the relationship between one variable and two or more other variables. It explores how a single variable (the dependent variable) is related to multiple independent variables.
   - **Representation**: This can be represented through multiple regression analysis, which examines how multiple independent variables collectively predict or influence a single dependent variable.
   - **Example**: In economics, multiple correlation might involve predicting a person's income (dependent variable) using variables such as education level, years of experience, and geographical location (independent variables) to understand how these factors jointly affect income.

![](https://www.investopedia.com/thmb/2b8kkUpoknl2tKdZfbsCzI-2X54=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/TC_3126228-how-to-calculate-the-correlation-coefficient-5aabeb313de423003610ee40.png)


### 1. Classification of Data
   - **Definition**: Classification of data refers to the process of organizing or categorizing data into groups, classes, or categories based on certain characteristics or attributes shared by the data.
   - **Types of Data Classification**:
      - **Nominal**: Data grouped into categories without any inherent order or ranking (e.g., colors, gender).
      - **Ordinal**: Data classified into categories with a specific order or ranking (e.g., ratings, education levels).
      - **Interval**: Data with ordered categories and equal intervals between consecutive values but without a true zero point (e.g., temperature in Celsius or Fahrenheit).
      - **Ratio**: Similar to interval data but with a true zero point (e.g., height, weight, time).

### 2. Representation of Data
   - **Definition**: Representation of data involves visually or symbolically presenting data to aid understanding, analysis, and communication of information.
   - **Types of Data Representation**:
      - **Graphs and Charts**: Such as bar graphs, pie charts, line graphs, histograms, etc., used to visually represent data for easier interpretation.
      - **Tables**: Organized presentation of data in rows and columns, allowing for precise documentation and comparison.
      - **Diagrams and Maps**: Representing data through flowcharts, Venn diagrams, geographical maps, etc., to illustrate relationships or geographical distributions.
      - **Statistical Measures**: Using summary statistics like mean, median, mode, variance, standard deviation, etc., to numerically represent characteristics of the data.

### 3. Central Tendency
   - **Definition**: Central tendency refers to a single value or measure that represents the center or typical value of a dataset.
   - **Measures of Central Tendency**:
      - **Mean**: The average calculated by summing all values and dividing by the number of data points.
      - **Median**: The middle value in a dataset when arranged in ascending or descending order; less affected by extreme values.
      - **Mode**: The value that occurs most frequently in a dataset; useful for categorical or discrete data.
   - **Use and Interpretation**: Central tendency measures provide insights into the typical value or center of a dataset, aiding in summarizing data for analysis and comparison.
## Skewness
Skewness is a statistical measure that describes the asymmetry of the probability distribution of a random variable. It measures the degree and direction of asymmetry in the distribution.
- **Positive skewness**: The right tail of the distribution is longer or extends further than the left tail. The majority of the values are concentrated on the left side, while the right side has a few unusually large values.
    
- **Negative skewness**: The left tail of the distribution is longer or extends further than the right tail. Most of the values are concentrated on the right side, with a few exceptionally small values on the left side.
![](https://miro.medium.com/v2/resize:fit:761/0*LjCzeU5RRRAEkMfc.png)
## Kurtosis
Kurtosis is a statistical measure that describes the shape of the probability distribution of a random variable, specifically focusing on the "tailedness" or the degree of outliers present in the distribution.

- **Leptokurtic**: High kurtosis indicates a distribution with heavy tails and a high peak, implying a greater number of data points in the tails compared to a normal distribution. This often indicates more outliers or extreme values.
  
- **Mesokurtic**: A kurtosis value similar to that of a normal distribution. The distribution's tails and peak resemble that of a normal distribution.

- **Platykurtic**: Low kurtosis suggests a distribution with lighter tails and a flatter peak compared to a normal distribution. It means fewer extreme values or outliers than a normal distribution.

![](https://editor.analyticsvidhya.com/uploads/83490Kurtosis_layout1.png)
