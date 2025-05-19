# Calculator Exercise

This exercise will help you practice Git workflow including branching, merging, and handling conflicts.

## Prerequisites
- Git installed on your computer
- Java Development Kit (JDK) installed
- JUnit for running tests

## Steps

### 1. Initial Setup
```bash
# Clone the repository
git clone <repository-url>
cd <repository-name>

# Create and switch to a new branch
# Replace 'studentgitid' with your actual GitHub ID
git checkout -b feature/studentgitid
```

### 2. Implement Power Function
1. Open `src/calculator/Calculator.java`
2. Find the commented power function:
```java
/**
 * Raises a number to a power.
 *
 * @param base     the base number
 * @param exponent the exponent
 * @return the result of base raised to the power of exponent
 */
/* 
public double power(double base, double exponent) {
  return Math.pow(base, exponent);
} */
```
3. Uncomment the function by removing the `/*` and `*/`

### 3. Run Tests
```bash
# Compile the code
javac src/calculator/*.java test/calculator/*.java

# Run the tests
java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore calculator.CalculatorTest
```

### 4. Commit Your Changes
```bash
# Add your changes
git add src/calculator/Calculator.java

# Commit with a descriptive message
git commit -m "Implement power function"
```

### 5. Handle Updates from Main
```bash
# Switch to main branch
git checkout main

# Pull latest changes
git pull origin main

# Switch back to your feature branch
git checkout feature/studentgitid

# Merge main into your branch
git merge main

# If there are conflicts, resolve them and then:
git add .
git commit -m "Merge main into feature branch"
```

### 6. Push Your Branch
```bash
# Push your branch to the remote repository
git push origin feature/studentgitid
```

## Troubleshooting

### If you get compilation errors:
- Make sure you have the correct package declarations
- Check that all imports are resolved
- Verify that JUnit is in your classpath

### If you get merge conflicts:
1. Open the conflicting files
2. Look for conflict markers (`<<<<<<<`, `=======`, `>>>>>>>`)
3. Choose which changes to keep
4. Save the files
5. Add and commit the resolved files

### If tests fail:
- Check the error messages
- Verify that the power function is properly uncommented
- Make sure you're using the correct method signature

## Final Steps
1. Verify all tests pass
2. Make sure your code is properly formatted
3. Push your branch to the repository
4. Create a pull request (if required by your instructor)

Remember to replace 'studentgitid' with your actual GitHub ID in all commands! 