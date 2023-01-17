# Java Interview Prep

---

## 1.In terms of inheritance, what is the effect of keeping a constructor private?

- prevent instantiation outside of the object
- prevent subclassing. If you make a private constructor, no class can extend your class because it cannot call the `super()` constructor
- only the inner class can access the private consturcotr and method

## 2. In java, does the finally block get executed if we insert a return statement inside the try block of a try-catch-finally?

- Yes, it will get executed. The finally block gets executed when the try block exits.

## 3. Difference between final, finally, and finalize?

- final is used to control if a variable, method, or class is changeable
- finally is used in a try-catch-finally block
- finalize() method is called by the garbage collector once it determines that no more references exist.

## 4. Generics in Java vs Templates in C++

## 5. TreeMap vs HashMap vs LinkedHashMap

- TreeMap takes O(log n) look up and insert. Keys are ordered. It is implemented by Red Black Tree
- HashMap takes O(1) look up and insertion. Random order. It is implemented by Array of linked listss
- LinkedHashMap takes O(log n) look up and insert. Keys are ordered by insertion order. It is implemented by double linked list

## 6. What is Object Reflection

## 7. There is a class Country that has methods getContinent() and getPopulation(). Write a function int getPopulation(List<Country> countries, String continent) that computes the total population of a given continent, given a list of all countries and the name of a continent.

## 8. Using Lambda expressions, write a function List<Integer> getRandomSubset ( List< Integer> list) that returns a random subset of arbitrary size. All subsets (including the empty set) should be equally likely to be chosen.