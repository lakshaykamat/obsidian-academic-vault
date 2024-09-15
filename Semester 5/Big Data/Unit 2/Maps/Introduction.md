### What is Maps
A **map** (also known as a dictionary or associative array) is a data structure that maps keys to values, allowing for efficient retrieval, insertion, and deletion based on keys. Unlike collections such as lists or sets, maps store key-value pairs where each key is unique.

### Key Characteristics of a Map:

1. **Key-Value Pairs**: Each entry in the map consists of a key and its associated value. Keys are unique, but values can be duplicated.
2. **Unordered**: In most implementations, maps do not maintain any order of the key-value pairs. However, some implementations maintain insertion or sorted order.
3. **Efficient Operations**: Maps are designed to provide efficient methods for:
   - **Insertion**: Adding a new key-value pair.
   - **Deletion**: Removing a key-value pair based on the key.
   - **Lookup**: Retrieving the value associated with a key.

### Common Map Operations:

1. **Put**: Inserts or updates the value associated with a key.
   - Example: `map.put(key, value)`

2. **Get**: Retrieves the value associated with a key.
   - Example: `map.get(key)`

3. **Remove**: Deletes the key-value pair associated with a key.
   - Example: `map.remove(key)`

4. **Contains Key**: Checks if a key exists in the map.
   - Example: `map.containsKey(key)`

5. **Contains Value**: Checks if a value exists in the map.
   - Example: `map.containsValue(value)`

6. **Size**: Returns the number of key-value pairs in the map.
   - Example: `map.size()`

7. **Clear**: Removes all key-value pairs from the map.
   - Example: `map.clear()`

### Types of Maps:

1. **HashMap**:
   - **Characteristics**: Implements the `Map` interface using a hash table. Provides constant-time performance for basic operations (get, put, remove) on average.
   - **Order**: Does not maintain any order of key-value pairs.
   - **Use Case**: When fast access and manipulation of key-value pairs is required, and order is not important.

2. **LinkedHashMap**:
   - **Characteristics**: Extends `HashMap` and maintains a linked list of the entries. Preserves the insertion order of key-value pairs.
   - **Order**: Maintains the order in which entries were added.
   - **Use Case**: When insertion order needs to be preserved.

3. **TreeMap**:
   - **Characteristics**: Implements the `NavigableMap` interface using a Red-Black tree. Stores key-value pairs in a sorted order based on the keys.
   - **Order**: Maintains keys in their natural order or by a comparator provided at map creation.
   - **Use Case**: When sorted order of keys is required.

### Summary:

- **Maps** are used to associate keys with values and support efficient retrieval, insertion, and deletion.
- **`HashMap`**: Offers fast access with no order guarantee.
- **`LinkedHashMap`**: Maintains insertion order with slightly more overhead.
- **`TreeMap`**: Maintains sorted order based on keys, useful for range queries and ordered traversals.