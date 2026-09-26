# Accenture Java DSA Cheat Sheet — Arrays & ArrayList

Assuming you mean **Java**, since you are preparing DSA in Java.  
Here is the **Accenture-focused Array/ArrayList built-in cheat sheet**.

---

## 🔥 Java Arrays — Must Know

| Method / Function            | Use                               | Syntax                           |
| ---------------------------- | --------------------------------- | -------------------------------- |
| `Arrays.sort()`              | Sort array ascending              | `Arrays.sort(arr);`              |
| `Arrays.sort(arr, from, to)` | Sort a range                      | `Arrays.sort(arr, 0, 5);`        |
| `Arrays.toString()`          | Convert array to printable string | `Arrays.toString(arr);`          |
| `Arrays.equals()`            | Compare two arrays                | `Arrays.equals(a, b);`           |
| `Arrays.fill()`              | Fill entire array with a value    | `Arrays.fill(arr, 0);`           |
| `Arrays.fill(range)`         | Fill part of array                | `Arrays.fill(arr, 1, 4, 0);`     |
| `Arrays.copyOf()`            | Copy/resize array                 | `Arrays.copyOf(arr, 10);`        |
| `Arrays.copyOfRange()`       | Copy a specific range             | `Arrays.copyOfRange(arr, 1, 5);` |
| `Arrays.binarySearch()`      | Binary search in **sorted** array | `Arrays.binarySearch(arr, key);` |
| `Arrays.compare()`           | Lexicographically compare arrays  | `Arrays.compare(a, b);`          |
| `Arrays.mismatch()`          | Find first differing index        | `Arrays.mismatch(a, b);`         |
| `Math.max()`                 | Maximum of two values             | `Math.max(a, b);`                |
| `Math.min()`                 | Minimum of two values             | `Math.min(a, b);`                |
| `Math.abs()`                 | Absolute value                    | `Math.abs(x);`                   |
| `Math.pow()`                 | Power                             | `Math.pow(a, b);`                |
| `Math.sqrt()`                | Square root                       | `Math.sqrt(x);`                  |

### ⭐ Extremely Important

```java
Arrays.sort(arr);
Arrays.toString(arr);
Arrays.equals(a, b);
Arrays.fill(arr, 0);
Arrays.copyOf(arr, n);
Arrays.binarySearch(arr, key);

# 🔥 ArrayList — Also Important

| Method                    | Use                  | Syntax                            |
| ------------------------- | -------------------- | --------------------------------- |
| `add()`                   | Add element          | `list.add(x);`                    |
| `add(index, x)`           | Add at position      | `list.add(2, x);`                 |
| `get()`                   | Get element          | `list.get(i);`                    |
| `set()`                   | Replace element      | `list.set(i, x);`                 |
| `remove()`                | Remove element/index | `list.remove(i);`                 |
| `contains()`              | Check existence      | `list.contains(x);`               |
| `size()`                  | Number of elements   | `list.size();`                    |
| `isEmpty()`               | Check empty          | `list.isEmpty();`                 |
| `indexOf()`               | First occurrence     | `list.indexOf(x);`                |
| `lastIndexOf()`           | Last occurrence      | `list.lastIndexOf(x);`            |
| `clear()`                 | Remove everything    | `list.clear();`                   |
| `toArray()`               | Convert to array     | `list.toArray();`                 |
| `Collections.sort()`      | Sort ArrayList       | `Collections.sort(list);`         |
| `Collections.reverse()`   | Reverse list         | `Collections.reverse(list);`      |
| `Collections.max()`       | Maximum element      | `Collections.max(list);`          |
| `Collections.min()`       | Minimum element      | `Collections.min(list);`          |
| `Collections.frequency()` | Count occurrences    | `Collections.frequency(list, x);` |

---

# 🔥 Common Array Logic You MUST Know

These are **not built-in methods**, but are more important for coding questions:

```java
// Length
arr.length;

// Traverse
for (int i = 0; i < arr.length; i++)

// Enhanced loop
for (int x : arr)

// Reverse traversal
for (int i = arr.length - 1; i >= 0; i--)

// Sum
sum += arr[i];

// Maximum
max = Math.max(max, arr[i]);

// Minimum
min = Math.min(min, arr[i]);

// Swap
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;



## 🎯 Accenture Priority

**Master first:**

1. `Arrays.sort()`
2. `Arrays.toString()`
3. `Arrays.equals()`
4. `Arrays.binarySearch()`
5. `Arrays.fill()`
6. `Arrays.copyOf()`
7. `ArrayList.add()`
8. `get()`
9. `set()`
10. `remove()`
11. `contains()`
12. `size()`
13. `Collections.sort()`
14. `Collections.reverse()`
15. **Traversal + max/min/sum/reverse/swap logic**













# Accenture Java DSA Cheat Sheet — Strings

Assuming **Java**, here is the **Accenture-focused String methods/built-ins cheat sheet**.

---

## 🔥 Java String — Must Know

| Method               | Use                            | Syntax                         |
| -------------------- | ------------------------------ | ------------------------------ |
| `length()`           | Get string length              | `str.length();`                |
| `charAt()`           | Get character at index         | `str.charAt(i);`               |
| `substring()`        | Extract part of string         | `str.substring(2, 5);`         |
| `substring(start)`   | Extract from index             | `str.substring(2);`            |
| `equals()`           | Compare strings                | `str1.equals(str2);`           |
| `equalsIgnoreCase()` | Compare ignoring case          | `str1.equalsIgnoreCase(str2);` |
| `compareTo()`        | Lexicographically compare      | `str1.compareTo(str2);`        |
| `toLowerCase()`      | Convert to lowercase           | `str.toLowerCase();`           |
| `toUpperCase()`      | Convert to uppercase           | `str.toUpperCase();`           |
| `trim()`             | Remove leading/trailing spaces | `str.trim();`                  |
| `strip()`            | Remove whitespace              | `str.strip();`                 |
| `contains()`         | Check substring                | `str.contains("abc");`         |
| `startsWith()`       | Check starting text            | `str.startsWith("A");`         |
| `endsWith()`         | Check ending text              | `str.endsWith("ing");`         |
| `indexOf()`          | First occurrence index         | `str.indexOf('a');`            |
| `lastIndexOf()`      | Last occurrence index          | `str.lastIndexOf('a');`        |
| `replace()`          | Replace characters/text        | `str.replace('a','b');`        |
| `replaceAll()`       | Replace using regex            | `str.replaceAll("a","b");`     |
| `replaceFirst()`     | Replace first match            | `str.replaceFirst("a","b");`   |
| `concat()`           | Join strings                   | `str.concat("Hello");`         |
| `split()`            | Split into array               | `str.split(" ");`              |
| `isEmpty()`          | Check empty string             | `str.isEmpty();`               |
| `isBlank()`          | Check empty/whitespace         | `str.isBlank();`               |
| `toCharArray()`      | Convert to char array          | `str.toCharArray();`           |
| `String.valueOf()`   | Convert value to String        | `String.valueOf(x);`           |

---

## 🔥 StringBuilder — VERY Important

For problems involving **repeated string modification**, know:

| Method           | Use               | Syntax                  |
| ---------------- | ----------------- | ----------------------- |
| `append()`       | Add text          | `sb.append("abc");`     |
| `insert()`       | Insert text       | `sb.insert(2, "x");`    |
| `delete()`       | Delete range      | `sb.delete(1, 3);`      |
| `deleteCharAt()` | Delete character  | `sb.deleteCharAt(2);`   |
| `reverse()`      | Reverse string    | `sb.reverse();`         |
| `charAt()`       | Access character  | `sb.charAt(i);`         |
| `setCharAt()`    | Change character  | `sb.setCharAt(i, 'x');` |
| `length()`       | Get length        | `sb.length();`          |
| `toString()`     | Convert to String | `sb.toString();`        |

---

## 🔥 Character Methods — Important

Use `Character` class frequently:

| Method              | Use                  | Syntax                          |
| ------------------- | -------------------- | ------------------------------- |
| `isLetter()`        | Check letter         | `Character.isLetter(c);`        |
| `isDigit()`         | Check digit          | `Character.isDigit(c);`         |
| `isLetterOrDigit()` | Check alphanumeric   | `Character.isLetterOrDigit(c);` |
| `isWhitespace()`    | Check whitespace     | `Character.isWhitespace(c);`    |
| `isUpperCase()`     | Check uppercase      | `Character.isUpperCase(c);`     |
| `isLowerCase()`     | Check lowercase      | `Character.isLowerCase(c);`     |
| `toUpperCase()`     | Convert to uppercase | `Character.toUpperCase(c);`     |
| `toLowerCase()`     | Convert to lowercase | `Character.toLowerCase(c);`     |

---

## ⭐ String Logic You MUST Practice

```java
// Traverse
for (int i = 0; i < str.length(); i++)

// Character
char c = str.charAt(i);

// Reverse
for (int i = str.length() - 1; i >= 0; i--)

// Convert to char array
char[] arr = str.toCharArray();

// Remove spaces
str.replace(" ", "");

// Split words
String[] words = str.split(" ");

// Count character
count[c]++;

// Check palindrome
str.equals(new StringBuilder(str).reverse().toString());


## 🎯 Accenture Priority

**Master these first:**

1. `length()`
2. `charAt()`
3. `substring()`
4. `equals()`
5. `toLowerCase()` / `toUpperCase()`
6. `contains()`
7. `indexOf()` / `lastIndexOf()`
8. `replace()`
9. `split()`
10. `toCharArray()`
11. `Character.isLetter()` / `isDigit()`
12. **StringBuilder `reverse()` / `append()`**
13. **Character frequency counting**
14. **Palindrome**
15. **Anagram**
16. **String reversal**
17. **Duplicate character detection**
18. **Word/character frequency**
19. **Vowel/consonant counting**
20. **Substring searching**

