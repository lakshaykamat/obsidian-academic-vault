## Saving and loading R data
You can save and load data using various functions. The most common ways to save and load data are using `save()` and `load()` functions for saving and loading workspace objects respectively. Here's a basic overview:

### Saving Data:
1. **Using `save()` Function:**
   ```R
   # Save individual objects
   save(object1, object2, file = "data.Rdata")

   # Save all objects in the workspace
   save.image(file = "data.Rdata")
   ```

2. **Using `saveRDS()` Function (for single objects):**
   ```R
   # Save a single object
   saveRDS(object, file = "data.rds")
   ```

### Loading Data:
1. **Using `load()` Function:**
   ```R
   # Load all objects from the saved file
   load("data.Rdata")
   ```

2. **Using `readRDS()` Function (for single objects):**
   ```R
   # Load a single object
   loaded_object <- readRDS("data.rds")
   ```

These methods are suitable for saving and loading R objects, including data frames, lists, vectors, etc. Depending on your needs, you might choose one method over the other. For instance, `save()` and `load()` are suitable for saving and loading multiple objects at once, while `saveRDS()` and `readRDS()` are ideal for saving and loading single objects.

Remember to provide the correct file paths when using these functions, ensuring that you save and load data from the desired locations.