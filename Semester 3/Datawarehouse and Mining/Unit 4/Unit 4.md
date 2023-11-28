# Unit 4
1. [[Mining Complex Data Objects]]

![[Data warehouse and mining#UNIT-IV]]
## Multimedia Database:
**Definition:** Multimedia mining involves the analysis of a vast amount of multimedia information to extract patterns based on statistical relationships. It is categorized into two main types: static media, encompassing text and images, and dynamic media, comprising audio and video. The mining process involves extracting meaningful patterns from these diverse forms of multimedia data.

1. **Text Mining:**
    
    - **Definition:** Text mining, also known as text data mining, analyzes large volumes of natural language text to discover patterns and extract valuable information. It is crucial for extracting meaningful insights from unstructured text sources.
2. **Image Mining:**
    
    - **Definition:** Image mining systems explore vast collections of images to discover meaningful information or patterns. This involves transforming low-level pixel representations into high-level spatial objects and relationships, incorporating digital image processing, image understanding, and AI.
3. **Video Mining:**
    
    - **Definition:** Video mining involves uncovering interesting patterns within video data, considering various multimedia elements like text, images, metadata, visuals, and audio. Commonly used in security, surveillance, entertainment, medicine, sports, and education, it includes processes like indexing, automatic segmentation, content-based retrieval, classification, and trigger detection.
4. **Audio Mining:**
    
    - **Definition:** Audio mining is a significant aspect of multimedia applications, enabling automatic search, analysis, and segmentation of audio content. Widely employed in automatic speech recognition, it utilizes techniques like wavelet transformation and features such as band energy, frequency centroid, zero-crossing rate, pitch period, and bandwidth.
![](https://static.javatpoint.com/tutorial/data-mining/images/what-is-multimedia-data-mining2.png)
### **Applications of Multimedia Mining:**

1. **Digital Library:**
    
    - **Description:** Multimedia data mining is essential for converting diverse digital data formats (text, images, video, audio) into organized collections within digital libraries.
2. **Traffic Video Sequences:**
    
    - **Description:** Analyzing traffic video sequences to extract valuable insights, including vehicle identification, traffic flow patterns, and temporal relations at intersections, enhancing regular traffic monitoring processes.
3. **Medical Analysis:**
    
    - **Description:** Applied in the medical field for analyzing medical images. Techniques include automatic 3D delineation of aggressive brain tumors, localization of vertebrae in 3D CT scans, and analysis of MRI scans, ECG, and X-rays.
4. **Customer Perception:**
    
    - **Description:** Utilized to gather and analyze customer opinions, complaints, preferences, and satisfaction levels. Audio data aids in topic detection, resource assignment, and service quality evaluation, commonly employed in call centers.
5. **Media Making and Broadcasting:**
    
    - **Description:** Multimedia mining enhances the monitoring of content in radio stations and TV channels, optimizing approaches and improving content quality.
6. **Surveillance System:**
    
    - **Description:** Involves collecting, analyzing, and summarizing audio, video, or audiovisual information for specific areas, serving security purposes for government organizations, multinational companies, shopping malls, banks, and more.

![](https://static.javatpoint.com/tutorial/data-mining/images/what-is-multimedia-data-mining3.png)

### Process of Multimedia Data Mining
 
The multimedia mining process begins with Data Collection, followed by Pre-processing to extract key features through activities like cleaning, transformation, and normalization. Learning involves selecting a model based on the training set created during pre-processing, enhancing the multimedia model for increased consistency.
![](https://static.javatpoint.com/tutorial/data-mining/images/what-is-multimedia-data-mining4.png)
### Converting Un-structured data to structured data
Converting unstructured data to structured involves transforming bitstream data like pixel representations in images or character representations in text into organized, sequential formats. Structured data, with fixed fields, enables easy entry, storage, querying, and analysis, unlike the less organized nature of unstructured data.
![](https://static.javatpoint.com/tutorial/data-mining/images/what-is-multimedia-data-mining5.png)
### Architecture for Multimedia Data Mining
The architecture has several components. Important components are Input, Multimedia Content, Spatiotemporal Segmentation, Feature Extraction, Finding similar Patterns, and Evaluation of Results.
![](https://static.javatpoint.com/tutorial/data-mining/images/what-is-multimedia-data-mining6.png)
1. **Input:**
     - Multimedia database serves as the input for data mining to discover patterns.
2. **Multimedia Content:**
      - User selects databases, fields, or data subset for data mining.
3. **Spatiotemporal Segmentation:**
      - Deals with moving objects in image sequences in videos, aiding object segmentation.
4. **Feature Extraction:**
      - Preprocessing step that integrates data from various sources, making choices on characterizing or coding data fields.
    - Essential due to the unstructured nature of multimedia records.
5. **Finding Similar Patterns:**
      - Core of the data mining process, where hidden patterns and trends are uncovered.
    - Approaches include association, classification, clustering, regression, time-series analysis, and visualization.
6. **Evaluation of Results:**
      - Crucial data mining process to assess results and determine if the previous stages need revisiting.
    - Involves reporting and utilizing extracted knowledge for new actions, products, services, or marketing strategies.
### Models for Multimedia Mining
The models which are used to perform multimedia data are very important in mining. commonly four different multimedia mining models have been used. These are classification, association rule, clustering and statistical modelling.

1. **Classification:** Categorizes multimedia data by learning from properties and assigning predefined class labels. Decision tree and Hidden Markov Model are common techniques for image and video classification.
    
2. **Association Rule:** Uncovers relations between data items in large databases, distinguishing between image and non-image content features. Used for finding frequent patterns in transactions and multiple-level association rule techniques in image classification.
    
3. **Clustering:** Divides data objects into groups or clusters based on similarity, applicable to multimedia elements like images, objects, sounds, videos, and texts. Various methods include hierarchical, density-based, grid-based, model-based, k-means, and graph-based clustering.
    
4. **Statistical Modeling:** Utilizes statistical validity to test parameters, perform correlation studies, and transform data for further analysis. Establishes links between words and image regions, forming simple co-occurrence models in multimedia mining.
![](https://static.javatpoint.com/tutorial/data-mining/images/what-is-multimedia-data-mining7.png)

### Issues in Multimedia Mining
Major Issues in multimedia data mining contains content-based retrieval, similarity search, dimensional analysis, classification, prediction analysis and mining associations in multimedia data.

1. **Content-Based Retrieval and Similarity Search:**
    
    - Content-based retrieval involves detailed analysis of multimedia data from pixel values.
    - Two main retrieval systems: description-based (using keywords, captions) and content-based (using visual features like color histogram, texture, shape).
    - Applications include diagnosis, weather prediction, TV production, and internet search engines.
2. **Multidimensional Analysis:**
    
    - Multimedia data cubes designed for multidimensional analysis.
    - Dimensions include size, width, height, date, format type, duration, Internet domain, and keywords.
    - Prototype system, MultiMediaMiner, extends DBMiner for handling multimedia data.
3. **Classification and Prediction Analysis:**
    
    - Used in scientific fields like astronomy, seismology, and geoscientific analysis.
    - Decision tree classification important for image data mining, e.g., classifying sky images based on properties like magnitudes, areas, and intensity.
    - Image data mining involves large volumes and requires substantial processing power.
4. **Mining Associations in Multimedia:**
    
    - Association rules mined in image and video databases.
    - Three categories: associations between content and non-content features, among unrelated content, and related to spatial relationships.
    - Important considerations include multiple object features, repeated objects, and associations based on spatial relationships.