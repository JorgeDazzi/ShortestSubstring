Shortest Substring
======

Finding the shortest substring that contains all of the characters within s


Solution described
------

### Constraints:
- 1 <= size of s <= 10ˆ5 = _function_ heapSizeValidation
- s[i] e ascii[a-z] (dec [97-122]) = _function_ asciiValidation

### Decisions
 - I've decided to use Set < Character >  because this SetList you can add item, however repeated item are ignored. Therefore, in the end whole process I will generate shortest substring containing all letters from "s"

### Function Core
```java
public int shortestSubstring(String a){
        char[] sentence = a.toCharArray();
        Set<Character> db = new HashSet<>();

        if(this.heapSizeValidation(sentence) && this.asciiValidation(sentence)){
            for (char c : sentence) {
                db.add(c);
            }
        }

        return db.size();
    }
 ```
1. Convert String "a" to char[] sentence, till here I have my letters in char array, in order to manager it as char or char decimal.
2. Initialize my Set List (explained in Decisions)
3. Heap Size Validation: Simple case test, in order to check if sentence size is between 1 and 10ˆ5 (1 <= size of s <= 10ˆ5)
```java
public Boolean heapSizeValidation(char[] sentence){
  return (sentence.length >= 1 && sentence.length <= Math.pow(10,5));
}
```
4. ASCII range validation: test every item on array in order to validate if every item is between 97 and 122 in ASCII Decimal range. (s[i] e ascii[a-z])
```java
public Boolean asciiValidation(char[] sentence){
  for (char letter : sentence) {
    if (!(letter >= 97 && letter <= 122)) return false;
  }
  return true;
}
```
5. test case, if heapSizeValidation is true and asciiValidation also is true, it means, we passed the contraints. if it failed, it will return value 0 (Output).
6. We passed the constraints rules. 
  * just add items to Set List, the Set List will handle the repeated items. (explained in decisions) 
  * sends Set List size to Output
