## 1. Morphological Analysis
- **Focus:** Breaking down words into individual components (prefixes, roots, suffixes) where each component carries its own meaning.
- **Example:** "Uncooked" → "un" (not) + "cook" (to heat) + "ed" (past tense).
- **Limitation:** Computers may understand individual parts but miss the overall sentence meaning.

### Lexical Analysis
- **Focus:** Understanding word meanings in context and their relation to each other within a sentence.
- **Example:** "Address" can mean different things based on context ("I want to address the manager" vs. "I want the address of the manager").
  
### Working Together
- Both analyses are vital for computer comprehension of human language.
- Morphological analysis provides the basic elements, while lexical analysis assembles them into coherent meaning.



## 2. Syntactic Analysis in NLP

* **Goal:** Understand the structure and relationships between words in a sentence.
* **Method:** Parses the sentence by grouping words into phrases based on grammatical rules.
* **Disambiguation:** Utilizes programmed patterns to identify the most likely meaning based on common language structures.

Syntactic analysis moves beyond individual word meanings, considering context to understand how words relate to each other. For example:

* **Sentence:** "Carbon offsetting holidays. It's our greenest idea yet."
* Morphological and lexical analysis might struggle with "greenest idea."
* Syntactic analysis sees "carbon offsetting" modifies "holidays" and understands "greenest" refers to environmentally friendly practices related to those holidays.

In essence, syntactic analysis helps the computer transition from understanding individual words to comprehending the overall structure and meaning of a sentence.


## 3. Semantic Analysis in NLP

* **Focus:** Unveiling the intended meaning of a sentence, transcending its grammatical correctness.
* **Relationship with Syntax:** Builds upon syntactic analysis, which establishes the grammatical structure. Semantics uses this structure to interpret the meaning.
* **Limitations:** Focuses on the literal meaning, often referred to as the "dictionary definition." It might overlook figurative language, sarcasm, or implied meaning.

### Analogy
* **Imagine:** A sentence as a house.
  * **Syntactic Analysis:** Checks the blueprint (grammar) to ensure the walls are in the right place.
  * **Semantic Analysis:** Walks through the house (meaning) to understand how rooms are used and the purpose of the house.

Semantic analysis delves deeper than syntax, aiming to comprehend the true meaning and context of a sentence.


## 4. Discourse Integration in NLP

* **Focus:** Understanding the relationships and flow of meaning between sentences in a larger text.

### Key Technique: Anaphora Resolution
* **Definition:** Identifying the words that refer back to previously mentioned things (e.g., pronouns like "it," "one").

### Example
* **Sentences:** "I do not like this service provider. I am going to find another one."
* **Without Discourse Integration:** "Another one" wouldn't be well-understood.
* **With Discourse Integration:** Connects "another one" to the "service provider" mentioned earlier, making the meaning clear.

This level of analysis helps NLP understand the flow of conversation or text and how ideas relate across sentences, akin to following a conversation and making sense of how each part contributes to the bigger picture.


## 5. Pragmatic NLP
Pragmatic NLP, as seen in virtual assistants like Siri or Alexa, aims to understand the real-world meaning behind user input. It considers:

* **Context:** What's happening around the user that might influence their intended meaning?
* **Purpose:** Why is the user saying this? What do they hope to achieve with their input?
* **User History:** For assistants that have knowledge of the user's past interactions (like Alexa), they can leverage this information to better understand intent.

This aspect of NLP is particularly challenging because it requires computers to grasp real-world situations, a domain where they are still learning and evolving.
