# 🧩 Coding Exercise — String Normalizer Utility

### 🎯 Objective
Implement a small Java utility method that cleans and normalizes user input from a list of strings.

This exercise tests:
- Java fundamentals (collections, null handling, string manipulation)
- Understanding of JUnit tests
- Problem-solving and code clarity

Estimated time: **20–25 minutes**

---

### 📜 Task Description
Implement the method below in [`StringUtil.java`](src/main/java/com/example/task/StringUtil.java):

```java
public static List<String> normalizeStrings(List<String> input)
```

Make all tests in `StringUtilTest.java` pass.

#### ✅ Requirements
1. Ignore null or blank values.
2. Trim spaces.
3. Convert to lowercase.
4. Remove duplicates but keep first occurrence order.
5. Return an empty list (not null) for null or empty input.

Example:

Input:
```java
[" Apple ", "banana", "BANANA", "apple", null, " "]
```
Output:
```java
["apple", "banana"]
```

---

### 🧪 Run Tests
Ensure Java 17+ and Maven are installed.

```bash
mvn test
```

---

### 📦 Structure
```
string-normalizer-template/
 ├── pom.xml
 └── src
     ├── main/java/com/example/task/StringUtil.java
     └── test/java/com/example/task/StringUtilTest.java
```

---


