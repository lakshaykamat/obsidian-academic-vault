
|Aspect|Functional Requirements|Non-Functional Requirements|
|---|---|---|
|**Focus**|Specify what the system should do|Describe how the system should perform or behave|
|**Nature**|Specific, tangible functionalities|Abstract, defining system attributes|
|**What they define**|Explicit system behaviors and capabilities|System qualities and operational characteristics|
|**Testability**|Testable through scenarios and use cases|May be harder to test directly, evaluated through metrics or qualitative assessments|
|**Examples**|User authentication, data validation, report generation|Response time, reliability, security measures, user interface design|

## Discuss The Management spectrum in detail
Each 'P' represents a critical aspect in managing software development projects, focusing on different dimensions necessary for successful project completion and delivery of high-quality software products.

### 1. People
   People are a fundamental aspect of software development. This 'P' emphasizes the significance of **human resources** involved in the project, including developers, designers, testers, project managers, stakeholders, and end-users. Managing people involves:

   - **Team Collaboration:** Ensuring effective communication and collaboration among team members to work cohesively towards project goals.
   - **Skills and Expertise:** Identifying and leveraging the skills and expertise of team members for optimal project performance.
   - **Team Motivation and Well-being:** Focusing on team motivation, satisfaction, and well-being to enhance productivity and creativity.

### 2. Product
   The 'Product' dimension centers around the software being developed. 
   
   It includes **defining, designing, implementing, testing, and delivering the software product.** Key considerations involve:

   - **Requirements Elicitation:** Gathering and understanding user needs and translating them into functional specifications.
   - **Design and Development:** Creating the software architecture, coding, and iterative development to meet the specified requirements.
   - **Quality Assurance and Testing:** Ensuring the software meets quality standards through rigorous testing and validation procedures.

### 3. Process
   Process refers to the methodologies, frameworks, and procedures employed in software development. 
   
   It focuses on the **systematic and organized approach** to managing the project. Key elements include:

   - **Methodologies (Agile, Waterfall, etc.):** Selecting and implementing appropriate methodologies based on project requirements.
   - **Workflow and Lifecycle:** Defining the workflow, stages, and phases of software development, including planning, execution, monitoring, and closure.
   - **Continuous Improvement:** Emphasizing process improvement through feedback, retrospectives, and adopting best practices.

### 4. Project
   The 'Project' dimension concentrates on the management of resources, **time, and scope to deliver** the software within predefined constraints. This involves:

   - **Resource Allocation:** Managing resources effectively, including budget, time, manpower, and infrastructure.
   - **Risk Management:** Identifying, assessing, and mitigating risks that might impact project success.
   - **Scope and Time Management:** Defining project scope and timelines, setting realistic goals, and managing project schedules.

![](https://media.geeksforgeeks.org/wp-content/uploads/20210406130648/spp.PNG)

## What are various types of coupling and cohesion discuss in detail

### Coupling
Coupling refers to the degree of interdependence between software modules. It measures how much one module relies on another.

![](https://media.geeksforgeeks.org/wp-content/uploads/cohesion.png)
#### Types of Coupling:

1. **Data Coupling:** Modules communicate by passing data through parameters or arguments. It's the least coupled form and desirable for better design.
   
2. **Stamp Coupling (Data-structured Coupling):** Modules share complex data structures, and only a part of that structure is used by another module.

3. **Control Coupling:** One module controls the behavior of another by passing control information like flags or parameters.

4. **External Coupling:** Modules depend on an external interface, and changes in this interface may affect other modules.

5. **Common Coupling:** Modules share global data, like global variables, which multiple modules access and modify.

6. **Content Coupling:** This occurs when one module directly accesses or modifies the contents (variables, data structures) of another module.

7. **Temporal Coupling:** Modules are temporally related, executed at the same time or during a specific period.

8. **Sequential Coupling:** Output of one part is the input of another part. Modules are linked in sequence.

9. **Communication Coupling:** Modules communicate through shared messages or a common medium.

10. **Functional Coupling:** Modules are coupled because they perform a single function together.

11. **Data-structured Coupling:** Modules share a complex data structure, and changes in that structure can affect other modules.

12. **Interaction Coupling:** Modules are coupled due to interactions like callback functions or event handling.

13. **Component Coupling:** Relates to dependencies between software components or libraries.

#### Advantages of Low Coupling:
- **Improved Maintainability:** Changes in one module have minimal impact on others, making it easier to maintain and update.
- **Enhanced Modularity:** Modules can be developed, tested, and modified independently, improving reusability.
- **Better Scalability:** Easier addition or removal of modules without disrupting the entire system.

#### Disadvantages of High Coupling:
- **Increased Complexity:** Higher interdependence makes the system more intricate and harder to understand.
- **Reduced Flexibility:** Modifications or replacements of individual components become difficult without affecting other parts.
- **Decreased Modularity:** Difficulties arise in isolating and managing individual modules, reducing reusability.

### Cohesion

Cohesion refers to how closely related and focused the elements within a module are. It measures how well the elements in a module work together.

![](https://media.geeksforgeeks.org/wp-content/uploads/cohesion.png)
#### Types of Cohesion:

1. **Functional Cohesion:** Elements within a module perform tasks that are closely related in functionality.

2. **Sequential Cohesion:** Elements are related because the output of one part is the input of another, forming a sequence.

3. **Communicational Cohesion:** Elements operate on the same input data or share intermediate data.

4. **Procedural Cohesion:** Elements perform a specific task or procedure together.

5. **Temporal Cohesion:** Elements are executed at the same time or during a specific period.

6. **Logical Cohesion:** Elements are grouped together based on logical categorization.

7. **Coincidental Cohesion:** Elements are grouped arbitrarily with no logical relationship.

8. **Informational Cohesion:** Elements operate on the same input data but aren't closely related in functionality.

9. **Layer Cohesion:** Elements are organized in a hierarchical or layered structure.

#### Advantages of High Cohesion:
- **Improved Readability and Understandability:** Clear and focused modules are easier for developers to comprehend and maintain.
- **Better Error Isolation:** Modules are less likely to affect each other, making it easier to isolate and fix errors.
- **Improved Reliability:** Modules function consistently, leading to more reliable system performance.

#### Disadvantages of Low Cohesion:
- **Increased Code Duplication:** Disjointed elements might result in duplicated code.
- **Reduced Functionality:** Elements might not align well or belong together, reducing the module's efficiency.
- **Difficulty in Understanding the Module:** Disorganized elements make it harder for developers to understand the module's purpose and behavior.

Understanding these aspects is crucial in designing software systems that are easy to maintain, scalable, and robust. Achieving a balance between low coupling and high cohesion is a key goal in software design and architecture.