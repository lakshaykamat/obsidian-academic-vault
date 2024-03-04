# Heuristic
A **heuristic** is a technique used to solve problems and make decisions **quickly and efficiently** even though an "ideal" or fully accurate solution might not be found. They act as **rules of thumb or shortcuts** based on experience or knowledge that guide the AI towards a **good enough solution** within a reasonable timeframe.

Here's a breakdown of key points about heuristics in AI:

## Why use heuristics?
- **Speed:** Unlike algorithms that explore every possibility (which can be slow and impractical), heuristics prioritize promising paths, leading to faster solutions.
- **Complexity:** Many real-world problems are too complex for fully accurate solutions. Heuristics offer a good balance between accuracy and efficiency.
- **Adaptability:** Different heuristics can be applied depending on the problem, making AI systems more versatile.

## How do they work?

- **Heuristic Function:** This function estimates the "goodness" of a state, guiding the AI towards states closer to the desired goal. It's like judging the remaining distance in a maze based on landmarks, not actually measuring every path.
- **Examples:**
    
    - **Manhattan distance:** Estimates the distance between two points on a grid (like a city map).
    - **Misplaced tiles:** Counts the number of tiles out of place in a puzzle, aiming for the correct arrangement.
    

## Benefits and limitations:
- **Pros:** Faster, often good enough solutions, adaptable.
- **Cons:** Not guaranteed to be optimal, accuracy depends on the heuristic chosen, requires careful design.

## Applications :
- **Game playing:** Choosing the best move in chess, navigating obstacles in Pac-Man.
- **Route planning:** Finding efficient routes for delivery services.
- **Machine learning:** Guiding learning algorithms towards promising data points.
- **Robotics:** Controlling robot movement in complex environments.

**Heuristics are crucial for building practical and efficient AI systems.** They enable AI to handle real-world problems in a timely manner, even when complete accuracy is not feasible.