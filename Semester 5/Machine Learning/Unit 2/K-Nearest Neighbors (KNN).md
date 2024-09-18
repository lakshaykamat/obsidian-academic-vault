# KNN
**K-Nearest Neighbors (KNN)** is a simple, instance-based, non-parametric supervised learning algorithm used for both classification and regression tasks. It operates on the principle that similar instances are near each other in the feature space.

### How KNN Works:
1. **Training Phase**: There is no explicit training in KNN. The training dataset is stored, and when a prediction is required, the algorithm looks at the dataset to make decisions.
   
2. **Prediction Phase**:
   - **Classification**: When classifying a new data point, the algorithm looks at the **k** nearest neighbors (where **k** is a user-defined integer). It then assigns the most common class (majority vote) among those neighbors to the new data point.
   - **Regression**: In regression, the algorithm calculates the average (or weighted average) of the values of the nearest neighbors to predict a continuous output.
![](https://d2jdgazzki9vjm.cloudfront.net/tutorial/machine-learning/images/k-nearest-neighbor-algorithm-for-machine-learning2.png)
### Steps Involved:
1. **Choose the number of neighbors** (k).
2. **Calculate the distance** between the new data point and all training data points. Common distance metrics include:
   - **Euclidean distance** (most common for continuous data): 
     $D (p, q) = \sqrt{\sum_{i=1}^{n} (p_i - q_i)^2}$
   - **Manhattan distance** (sum of absolute differences, used for high-dimensional data).
   - **Minkowski distance** (a generalization of both Euclidean and Manhattan distances).
   - **Hamming distance** (for categorical data).
   
3. **Identify the k-nearest neighbors**: Sort the distances and select the k closest data points.
4. **Make a prediction**:
   - **For classification**: Take the majority vote of the k neighbors.
   - **For regression**: Calculate the mean or weighted mean of the values of the k neighbors.

### Key Parameters:
- **k (Number of neighbors)**: The most important hyperparameter. A smaller value of k makes the model sensitive to noise, while a larger value makes it more generalized but may overlook local patterns.
  
- **Distance metric**: The choice of distance metric affects the algorithm’s performance. For instance, Euclidean distance works well when the features are continuous, while Hamming distance is better suited for categorical features.

### Advantages:
- **Simple and intuitive**: Easy to understand and implement with minimal hyperparameters.
- **No training phase**: Since KNN is a lazy learner, it simply stores the data and doesn’t require a complex training process.
- **Works well with small datasets**: When the dataset is small and low-dimensional, KNN can perform quite well.
- **Flexible for classification and regression**: It works for both types of tasks.

### Disadvantages:
- **Computationally expensive**: As it needs to calculate the distance to all other data points for each query, KNN can become slow for large datasets, both in terms of memory and time.
  
- **Sensitive to irrelevant features**: If irrelevant features are included in the dataset, they can distort the distance calculations. This can be mitigated by feature scaling and dimensionality reduction techniques like PCA.

- **Curse of dimensionality**: In high-dimensional spaces, the distance between data points becomes less meaningful, and the algorithm’s performance may degrade. Dimensionality reduction methods can help in such cases.

- **Imbalanced data**: KNN can be biased towards the majority class if the data is imbalanced, as it relies on majority voting.

### Optimizations for KNN:
- **Feature scaling**: Since distance metrics like Euclidean distance are sensitive to feature magnitude, it’s important to normalize or standardize the data before applying KNN.
  
- **Weighted KNN**: Assigns weights to neighbors based on their distance (closer neighbors have more influence). For example, using inverse distance weighting.
  
- **Dimensionality reduction**: Techniques like Principal Component Analysis (PCA) or t-SNE can reduce the dimensionality of data, improving KNN's performance and efficiency.

### Choosing k:
- A low value of k (e.g., k=1) can lead to overfitting and make the model sensitive to noise.
- A high value of k can smooth out predictions but may miss finer details in the data (underfitting).
- Cross-validation can be used to choose the optimal k for the specific dataset.

### Use Cases:
- **Image recognition**: In some cases, KNN is used for identifying objects in images by comparing pixel values.
- **Recommendation systems**: By comparing user preferences or behavior with others, KNN can make personalized recommendations.
- **Pattern recognition**: Used in tasks like handwriting recognition or fingerprint identification.
- **Anomaly detection**: It can identify outliers based on distances from typical points.

### Example:
If you have a dataset of customer behavior, and you want to classify a new customer as a high spender or low spender, KNN will look at the **k** most similar existing customers based on features (e.g., purchase history, income, etc.) and assign the new customer to the majority class (either high spender or low spender).

In conclusion, KNN is a powerful yet simple algorithm that works well for small to medium-sized datasets but can struggle with efficiency and performance in high-dimensional or large datasets.