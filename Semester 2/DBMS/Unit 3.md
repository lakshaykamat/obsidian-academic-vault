# Unit 3

# Entity Type

An entity type represents a category or a class of objects in the real world that we want to model and store data about. It defines the common characteristics and properties shared by all the objects of that category. For example, in a university database, "Student" and "Course" could be entity types.

# Entity Set

An entity set is a collection of all the instances or objects of a particular entity type. It represents the set of all entities belonging to that entity type. For instance, the "Student" entity set would contain all the individual student records in a university database.

# Attributes

Attributes are properties or characteristics that describe an entity or an object. They define the specific data that can be associated with each instance of an entity type. For example, a "Student" entity may have attributes such as "Student ID," "First Name," "Last Name," and "Date of Birth." Each attribute has a data type associated with it, such as integer, string, date, etc.

# Relationship Type

A relationship type represents an association or connection between two or more entity types. It defines how instances of entity types are related to each other. Relationship types capture the meaningful associations between entities. For example, in a university database, a "Course" entity type can have a relationship type called "Enrollment" with the "Student" entity type to represent the enrollment of students in courses.

## Attributes of Relationship Types

Just like entity types, relationship types can also have attributes. These attributes describe additional properties or characteristics of the relationship itself. For instance, an "Enrollment" relationship type may have an attribute called "Grade" to store the grade received by a student in a particular course.

Entity types, entity sets, attributes, and relationship types form the foundation of the entity-relationship (ER) model, which is widely used for conceptual data modeling in DBMS. They help define the structure, properties, and associations between different entities in a database, enabling the representation and organization of real-world data.

# Relationship Instances

In a database management system (DBMS), relationship instances represent the specific occurrences or instances of relationships between entities. They capture the actual associations between individual entities in the database. Relationship instances are created when entities are related to each other through a specific relationship type.

For example, consider a relationship type "Enrollment" between entity types "Student" and "Course." Each enrollment of a student in a course represents a relationship instance. So, if a student named John enrolls in a course named "Database Management," the specific enrollment instance would represent the relationship between John and the course.

# Abstraction and Integration

Abstraction is a concept that allows complex systems to be represented in a simplified manner. In the context of databases, abstraction involves representing real-world entities, their properties, and relationships using high-level models that capture the essential aspects while hiding unnecessary details. The ER model is an example of such abstraction, where entities, relationships, and attributes are represented in a simplified and conceptual way.

Integration, on the other hand, refers to the process of combining multiple sources of data or information into a unified view. In the context of databases, integration involves bringing together data from various sources and representing them in a cohesive and consistent manner. The ER model provides a way to integrate different entities and their relationships into a unified database schema.

Abstraction and integration are important in database design as they enable the conceptualization and organization of complex data systems. By abstracting real-world entities and relationships, and integrating data from multiple sources, databases can provide a structured and unified representation of information that supports efficient storage, retrieval, and manipulation of data.

# ER Model

ER-model (Entity-Relationship model) is a popular conceptual data model used in database management systems (DBMS) to represent the relationships between entities in a database. It is based on the notion of real-world entities and the relationships among them.

The ER-model represents data in terms of entities, attributes, and relationships. An entity represents a real-world object, such as a person, place, or thing. Each entity has one or more attributes that describe its properties or characteristics. For example, a person entity might have attributes such as name, address, and age.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled.png)

# Types of Attribute

1. **Simple Attribute:** A simple attribute is an attribute that cannot be divided into smaller components. For example, the "name" attribute of a "customer" entity is a simple attribute.
2. **Composite Attribute:** A composite attribute is an attribute that can be divided into smaller components or sub-attributes. For example, the "address" attribute of a "customer" entity can be divided into sub-attributes such as "street," "city," and "zip code."
3. **Derived Attribute:** A derived attribute is an attribute that can be calculated from other attributes in the entity. For example, the "age" attribute of a "person" entity can be derived from the "date of birth" attribute.
4. **Multivalued Attribute:** A multivalued attribute is an attribute that can have multiple values for a single entity instance. For example, the "hobby" attribute of a "person" entity can have multiple values such as "reading," "swimming," and "cooking."
5. **Key Attribute:** A key attribute is an attribute that uniquely identifies each entity instance. In the ER model, a key attribute is usually designated as the primary key.
6. **Foreign Key Attribute:** A foreign key attribute is an attribute that refers to the primary key of another entity. It is used to establish relationships between entities in the ER model.

# Components of ER Model

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%201.png)

## Entity

An entity may be any object, class, person or place. In the ER diagram, an entity can be represented as rectangles.

Consider an organization as an example- manager, product, employee, department etc. can be taken as an entity.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%202.png)

### **Weak Entity**

An entity that depends on another entity called a weak entity. The weak entity doesn't contain any key attribute of its own. The weak entity is represented by a double rectangle.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%203.png)

### Strong Entity

A Strong Entity is a type of entity that has a key Attribute. Strong Entity does not depend on other Entity in the Schema. It has a primary key, that helps in identifying it uniquely, and it is represented by a rectangle. These are called Strong Entity Types.

## Attribute

An entity represents a real-world object or concept, such as a person, place, or thing. Attributes describe the properties or characteristics of an entity, such as its name, age, or address. Each attribute has a specific data type, such as integer, string, or date. The attributes of an entity are used to define its structure and properties in a database. Understanding the attributes of entities is important in designing a database schema using the ER model, as it helps to ensure that the entities are properly defined and organized in a way that accurately reflects the real-world entities and their relationships.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%204.png)

### Key Attribute

The key attribute is used to represent the main characteristics of an entity. It represents a primary key. The key attribute is represented by an ellipse with the text underlined.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%205.png)

### Composite Attribute

An attribute that composed of many other attributes is known as a composite attribute. The composite attribute is represented by an ellipse, and those ellipses are connected with an ellipse.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%206.png)

### Multivalued Attribute

An attribute can have more than one value. These attributes are known as a multivalued attribute. The double oval is used to represent multivalued attribute.

ex- a student can have more than one phone number

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%207.png)

### Derived Attribute

An attribute that can be derived from other attribute is known as a derived attribute. It can be represented by a dashed ellipse.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%208.png)

## Symbols Used in ER Model

ER Model is used to model the logical view of the system from a data perspective which consists of these symbols:

- **Rectangles:** Rectangles represent Entities in ER Model.
- **Ellipses:** Ellipses represent Attributes in ER Model.
- **Diamond:** Diamonds represent Relationships among Entities.
- **Lines:** Lines represent attributes to entities and entity sets with other relationship types.
- **Double Ellipse:** Double Ellipses represent Multi-Valued Attributes.
- **Double Rectangle:** Double Rectangle represents a Weak Entity.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%209.png)

## Relationship

A relationship is when two or more things are connected to each other. Relationships help us understand how different things are connected to each other. For instance, a customer may place multiple orders, so there is a relationship between the customer and the order. Relationships can be one-to-one, one-to-many, or many-to-many, depending on how the things are connected. We can represent the relationships between things using symbols and notation in an ER diagram. It is important to understand the relationships between things when designing a database schema using the ER model. This way, we can make sure that the database accurately represents how things are connected in the real world.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%2010.png)

### One to One

a one-to-one relationship is a type of relationship between two entities where each instance of one entity is related to only one instance of the other entity, and vice versa. This means that for every record in the first entity, there is only one corresponding record in the second entity, and vice versa. For example, a person entity may have a one-to-one relationship with a passport entity, where each person can have only one passport, and each passport belongs to only one person. One-to-one relationships are relatively rare in real-world scenarios, but they can be useful in some cases where data needs to be separated into different entities for organizational or performance reasons.

Each person can be associated with only one marriage, and each marriage is associated with only one person. This is because in most cultures, marriage is considered a union between two people, and each person is expected to have only one spouse at a time.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%2011.png)

### One to Many

A one-to-many relationship is a type of relationship between two entities where each instance of one entity is related to one or more instances of the other entity, but each instance of the other entity is related to only one instance of the first entity.

ex- Scientist can invent many inventions, but the invention is done by the only specific scientist.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%2012.png)

### Many to One

a many-to-one relationship is a type of relationship between two entities where many instances of one entity are related to a single instance of the other entity. This is the opposite of a one-to-many relationship.

For Example - Student enrolls for only one course, but a course can have many students.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%2013.png)

### Many to Many

A many-to-many relationship is a type of relationship between two entities where many instances of one entity are related to many instances of the other entity. This type of relationship is the most complex and requires the use of a third entity, called a junction or linking entity, to connect the two entities.

![Untitled](Unit%203%203a5c8561df234dcbbb4ed3112282a8b2/Untitled%2014.png)

## Difference Between Strong Entity and Weak Entity

| Strong Entity | Weak Entity |
| --- | --- |
| Strong entity always has a primary key. | While a weak entity has a partial discriminator key. |
| Strong entity is not dependent on any other entity. | Weak entity depends on strong entity. |
| Strong entity is represented by a single rectangle. | Weak entity is represented by a double rectangle. |
| Two strong entity’s relationship is represented by a single diamond. | While the relation between one strong and one weak entity is represented by a double diamond. |
| Strong entities have either total participation or not. | While weak entity always has total participation. |

# Integrity constraints Keys

- Keys play an important role in relation database.
- It is used to uniquely identify any record or row of the data from the table. It is also used to establish and identify relationships between tables.
1. **Primary Key:** A primary key is a unique identifier for each row (or tuple) in a table (or relation) and is used to enforce the integrity and consistency of the data. It cannot contain null values.
2. **Candidate Key:** A candidate key is an attribute or a combination of attributes that can be used as a primary key, but it is not currently designated as such.
3. **Foreign Key:** A foreign key is an attribute in one relation that refers to the primary key of another relation. It establishes a relationship between the two relations and helps to enforce referential integrity.
4. **Super Key:** A super key is a set of one or more attributes that uniquely identifies each row in a table. A primary key is a type of super key, but not all super keys are primary keys.
5. **Alternate Key:** An alternate key is a candidate key that is not selected as the primary key.
6. **Composite Key:** A composite key is a key that consists of two or more attributes that, taken together, uniquely identify each row in a table.