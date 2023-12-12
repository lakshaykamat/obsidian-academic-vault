# Short answer question
## Differentiate between functional and non-functional requirements
|Aspect|Functional Requirements|Non-Functional Requirements|
|---|---|---|
|**Focus**|Specify what the system should do|Describe how the system should perform or behave|
|**Nature**|Specific, tangible functionalities|Abstract, defining system attributes|
|**What they define**|Explicit system behaviors and capabilities|System qualities and operational characteristics|
|**Testability**|Testable through scenarios and use cases|May be harder to test directly, evaluated through metrics or qualitative assessments|
|**Examples**|User authentication, data validation, report generation|Response time, reliability, security measures, user interface design|

## What is software crisis
The software crisis refers to **challenges in software development** including cost overruns, delays, and inadequate quality. 

It arises *due to complexities in meeting user requirements, managing resources, and ensuring reliability. *

The increasing demand for sophisticated software exacerbates this crisis, posing persistent challenges in the industry.
![](https://media.geeksforgeeks.org/wp-content/uploads/20230719174156/Software-crisis-660.png)

## Is the waterfall model suitable for safety critical projects justify your answer
The waterfall model, which follows a step-by-step process without much room for going back, *might not be* the best choice for projects where safety is crucial. 

Safety-critical projects need frequent checks and adjustments, which are better handled by methods allowing for ongoing testing and quick responses, like the V-model or Agile approach.
![](https://www.tutorialspoint.com/sdlc/images/sdlc_waterfall_model.jpg)

## Differentiate between data modelling and functional modelling
| **Data Modeling**                | **Functional Modeling**                                 |
|---------------------------------|---------------------------------------------------------|
| Deals with organizing data, like defining tables, relationships, and attributes in a database. | Focuses on how a system works, showing tasks, processes, or actions without diving into data specifics. |
| Defines how data is stored, accessed, and managed. | Illustrates system functions, interactions, and workflows. |
| Examples: Entity-Relationship Diagrams (ERD), database schemas. | Examples: Use case diagrams, flowcharts, activity diagrams. |
| Helps in designing databases for effective data handling. | Assists in understanding how a system operates and interacts. |
| Emphasizes data structure, relationships, and constraints. | Highlights system tasks, processes, and interactions. |

## What is Traceability matrix?
A traceability matrix is like a *map showing connections between requirements and other project elements.* 

It links needs to design, tests, and other project components, ensuring everything aligns. 

It helps track if each requirement is met, making sure nothing gets missed throughout the project development.

## Difference between Error, Fault and Failure
| **Error**      | **Fault**     | **Failure**   |
|----------------|---------------|---------------|
| An unintended deviation or mistake in a program that may lead to incorrect results. | A flaw in software design or code causing an error to occur. | The inability of a system or software to perform its required functions. |
| Example: Typo in a line of code causing a calculation error. | Example: Improper coding causing the program to crash. | Example: Software crashing while performing a specific function. |
| Errors are the initial incorrect behaviors or discrepancies. | Faults are the actual defects or issues within the software. | Failure is the observable consequence of a fault manifesting during system use. |
| Detected during testing or debugging phases. | Identified through testing or when the fault causes an error. | Observed during system operation or execution. |

## Difference between Load testing and Stress testing
| **Load Testing**                            | **Stress Testing**                                    |
|---------------------------------------------|--------------------------------------------------------|
| Evaluates system performance under expected and peak loads. | Pushes the system beyond normal capacity to assess its breaking point. |
| Aims to ensure the system handles anticipated loads effectively. | Tests system resilience and behavior under extreme conditions. |
| Validates the system's response time, resource utilization, and throughput under expected loads. | Checks system stability, monitors failures, and observes recovery after exceeding limits. |
| Conducted to assess the system's scalability and reliability under normal and peak conditions. | Performed to identify the system's failure points or weaknesses under excessive stress. |
| Example: Simulating expected user traffic on a website to ensure smooth operations. | Example: Applying loads well beyond the system's capacity to observe its behavior at breaking points. |
| Helps in optimizing and fine-tuning the system to meet expected usage demands. | Reveals weaknesses or vulnerabilities that could cause system failures under extreme loads. |

## Explain the need for software measurement and developing software metrics
Software measurement and metrics are crucial for evaluating quality, performance, resource allocation, risk management, and decision-making in software development. Developing metrics involves defining quantifiable characteristics that help objectively assess and improve different aspects of the development process, ensuring efficient and high-quality software delivery.

Software measurement helps track and understand how good or efficient a piece of software is. Developing software metrics means creating tools to measure things like how fast the software works, how many mistakes it has, or how well it meets users' needs. This helps teams make better software and fix problems faster.

## What are the software characteristics
1. **Functionality:** What the software can do.
2. **Reliability:** Consistent performance without failures.
3. **Usability:** User-friendliness and ease of use.
4. **Efficiency:** Optimal resource utilization.
5. **Maintainability:** Ease of maintenance and updates.
6. **Portability:** Adaptability across different platforms or environments.

## Difference between Verification and Validation

> **Verification:** Are we building the product right?
> **Validation:** Are we building the right product?

|Verification|Validation|
|---|---|
|It includes checking documents, design, codes and programs.|It includes testing and validating the actual product.|
|Verification is the static testing.|Validation is the dynamic testing.|
|It does not include the execution of the code.|It includes the execution of the code.|
|Methods used in verification are reviews, walkthroughs, inspections and desk-checking.|Methods used in validation are Black Box Testing, White Box Testing and non-functional testing.|
|It checks whether the software conforms to specifications or not.|It checks whether the software meets the requirements and expectations of a customer or not.|
|It can find the bugs in the early stage of the development.|It can only find the bugs that could not be found by the verification process.|
|The goal of verification is application and software architecture and specification.|The goal of validation is an actual product.|
|Quality assurance team does verification.|Validation is executed on software code with the help of testing team.|
|It comes before validation.|It comes after verification.|
|It consists of checking of documents/files and is performed by human.|It consists of execution of program and is performed by computer.|
|Verification refers to the set of activities that ensure software correctly implements the specific function.|Validation refers to the set of activities that ensure that the software that has been built is traceable to customer requirements.|
|After a valid and complete specification the verification starts.|Validation begins as soon as project starts.|
|Verification is for prevention of errors.|Validation is for detection of errors.|
|Verification is also termed as white box testing or static testing as work product goes through reviews.|Validation can be termed as black box testing or dynamic testing as work product is executed.|
|Verification finds about 50 to 60% of the defects.|Validation finds about 20 to 30% of the defects.|
|Verification is based on the opinion of reviewer and may change from person to person.|Validation is based on the fact and is often stable.|
|Verification is about process, standard and guideline.|Validation is about the product.|

## Define Spiral model of software development process in detail
The Spiral Model is a flexible and iterative software development methodology that *combines elements of both waterfall and iterative development models.*

Proposed by Barry Boehm in 1986, it aims to emphasize risk analysis, frequent prototyping, and continuous refinement throughout the software development life cycle (SDLC).

### Phases in the Spiral Model
1. **Planning:** Identifying objectives, constraints, and alternative solutions. Establishing feasibility and setting project goals.

2. **Risk Analysis:** Assessing and analyzing potential risks, including technical, schedule, and cost risks. Developing strategies to mitigate these risks.

3. **Engineering:** Developing the software, conducting extensive testing, prototyping, and refining as necessary. This phase includes iterations of design, coding, testing, and review.

4. **Evaluation:** Reviewing the current iteration with the stakeholders. Determining if the developed software meets their needs and requirements. Deciding whether to proceed with the next iteration or move to the next phase.

### Key Characteristics of the Spiral Model

1. **Risk Management:** Its iterative nature allows early identification and mitigation of risks throughout the development process.

2. **Flexibility:** Adaptable to changes and enhancements, allowing for iterations and refinements based on feedback.

3. **Progressive Development:** Continuously evolves through iterative cycles, each cycle producing a more refined version of the software.

4. **Prototyping:** Involves the creation of prototypes at various stages to validate and refine requirements and design.

### Advantages
- Incorporates flexibility and accommodates changes during the development process.
- Allows for early identification and mitigation of risks.
- Encourages customer involvement and feedback through iterations, leading to greater customer satisfaction.

### Disadvantages
- Complex and time-consuming due to its iterative nature.
- Can be challenging to predict the time and cost required for each iteration.
- Requires significant expertise in risk analysis to effectively implement.

![](https://www.bdtask.com/blog/assets/plugins/ckfinder/core/connector/php/uploads/images/what%20is%20spiral%20model%20for%20software%20development.jpg)

## Define Software engineering. Discuss various Software myths
Software engineering refers to the systematic application of engineering principles, methods, and tools to develop high-quality software products efficiently. It involves the entire software development process, encompassing design, development, testing, deployment, maintenance, and management of software systems.

### Software Engineering Myths

1. **Myth: Writing Code is the Main Task:** Reality: While coding is crucial, software engineering involves various activities like requirements analysis, design, testing, and maintenance, equally important for a successful product.

2. **Myth: More Programmers = Faster Development:** Reality: Adding more programmers to a late project can make it even later due to increased communication overhead and coordination challenges.

3. **Myth: Testing Can Ensure Bug-Free Software:** Reality: Testing can reduce bugs but cannot guarantee a bug-free product. Complete absence of bugs is practically unachievable.

4. **Myth: Documentation is Excessive and Unnecessary:** Reality: Documentation is vital for understanding the system, aiding maintenance, and facilitating knowledge transfer among team members.

5. **Myth: Once Developed, Software Doesn't Change:** Reality: Software evolves continuously due to changing user needs, technology advancements, and bug fixes, requiring regular updates and maintenance.

6. **Myth: Software Engineers Work Alone:** Reality: Software engineering involves teamwork, collaboration, and effective communication among various stakeholders.

7. **Myth: Software Engineering is Only About Writing Code:** Reality: It encompasses problem-solving, analysis, design, communication, project management, and quality assurance, not solely coding.

8. **Myth: Software Can Be Developed Quickly and Inexpensively:** Reality: Developing quality software takes time and resources. Rushing or cutting corners can lead to poor quality and higher costs in the long run.

9. **Myth: The Latest Tools Guarantee Success:** Reality: Tools are aids, but success relies on skilled professionals using these tools effectively and efficiently.

10. **Myth: Agile Solves All Software Problems:** Reality: Agile methodologies offer flexibility, but they might not suit every project or organization. It's essential to choose methodologies based on project requirements.
## What do you understand by requirements elicitation discuss any two techniques of requirement elicitation in detail

Requirements elicitation refers to the process of gathering, identifying, and defining the needs and expectations of stakeholders for a particular system or project. It involves techniques and methods to extract, understand, and document these requirements accurately.

### Features of Requirements Elicitation

1. **Gathering Information:** Requirements elicitation involves collecting information from stakeholders to understand their needs, expectations, and desires regarding a project or system.

2. **Techniques and Methods:** It employs various techniques like interviews, surveys, observations, brainstorming sessions, prototyping, and more to extract and define requirements.

3. **Communication:** It emphasizes effective communication between project teams and stakeholders to ensure clarity and accuracy in capturing requirements.

### Advantages of Requirements Elicitation

1. **Accurate Understanding:** It helps in obtaining a comprehensive and clear understanding of what stakeholders expect from the system or project.

2. **Reduced Risks:** Proper elicitation minimizes misunderstandings, reduces risks of building the wrong solution, and avoids costly changes later in the project lifecycle.

3. **Improved Quality:** Clear requirements lead to a higher-quality end product that meets stakeholders' needs and expectations.

4. **Stakeholder Engagement:** Involving stakeholders in the elicitation process creates a sense of ownership and increases their commitment to the project's success.

### Disadvantages of Requirements Elicitation

1. **Incomplete Information:** Sometimes, due to various reasons such as unclear communication or missing stakeholders, not all requirements are captured, leading to incomplete information.

2. **Changing Requirements:** Stakeholder needs might evolve over time, resulting in changing or evolving requirements, which can be challenging to manage.

3. **Subjectivity and Bias:** The elicitation process can be influenced by personal opinions or biases, which might affect the accuracy and completeness of requirements.

4. **Time and Cost:** It can be time-consuming and costly, especially if there are multiple stakeholders or if requirements change frequently.

### Methods

1. **Interviews:** Involves one-on-one or group discussions with stakeholders to gather information by asking specific questions about their needs, expectations, and preferences for the project or system.

2. **Brainstorming Sessions:** In a collaborative setting, diverse stakeholders come together to generate ideas, solutions, and requirements. It encourages creativity and free flow of thoughts to capture a wide range of perspectives.

3. **Facilitated Application Specification Technique (FAST):** A structured workshop where participants use modeling techniques, diagrams, and scenarios to define requirements collaboratively. It helps in visualizing and understanding the system's functionalities.

4. **Quality Function Deployment (QFD):** A method that translates customer requirements into technical specifications. It focuses on customer needs and helps in prioritizing features based on their importance.

5. **Use Case Approach:** Involves identifying and defining various scenarios or situations in which the system will be used. It helps in understanding user interactions with the system and defining system functionalities from the user's perspective.

Each method has its strengths and can be used alone or in combination, depending on the project's nature, stakeholders involved, and the depth of requirements needed. Choosing the right elicitation method or a combination of methods is crucial to effectively gather accurate and comprehensive requirements for a successful project or system development.