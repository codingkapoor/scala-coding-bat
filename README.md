# Scala CodingBat
Solutions to CodingBat problems in Scala

## Index

1. [Warmup-I](https://github.com/codingkapoor/scala-coding-bat#warmup-i)
2. [Warmup-II](https://github.com/codingkapoor/scala-coding-bat#warmup-ii)
3. [String-I](https://github.com/codingkapoor/scala-coding-bat/blob/master/README.md#string-i)
4. [String-II](https://github.com/codingkapoor/scala-coding-bat/blob/master/README.md#string-ii)
5. [Array-I](https://github.com/codingkapoor/scala-coding-bat/blob/master/README.md#array-i)
6. [Logic-I](https://github.com/codingkapoor/scala-coding-bat/blob/master/README.md#logic-i)

## Warmup-I
### [sleepIn](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

```
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
```

### [monkeyTrouble](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

```
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
```

### [sumDouble](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

```
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
```

### [diff21](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

```
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
```

### [parrotTrouble](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

```
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
```

### [makes10](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

```
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
```

### [nearHundred](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

```
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
```

### [posNeg](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

```
posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
```

### [notString](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

```
notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
```

### [missingChar](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

```
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
```

### [frontBack](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, return a new string where the first and last chars have been exchanged.

```
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
```

### [front3](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

```
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
```

### [backAround](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

```
backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
```

### [or35](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator.

```
or35(3) → true
or35(10) → true
or35(8) → false
```

### [front22](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

```
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
```

### [startHi](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, return true if the string starts with "hi" and false otherwise.

```
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
```

### [icyHot](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given two temperatures, return true if one is less than 0 and the other is greater than 100.

```
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
```

### [in1020](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 int values, return true if either of them is in the range 10..20 inclusive.

```
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
```

### [hasTeen](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

```
hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
```

### [loneTeen](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

```
loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
```

### [delDel](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

```
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
```

### [mixStart](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

```
mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
```

### [startOz](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

```
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
```

### [intMax](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given three int values, a b c, return the largest.

```
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
```

### [close10](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

```
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
```

### [in3050](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

```
in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
```

### [max1020](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

```
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
```

### [stringE](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Return true if the given string contains between 1 and 3 'e' chars.

```
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
```

### [lastDigit](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

```
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
```

### [endUp](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

```
endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
```

### [everyNth](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

```
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
```
## Warmup-II
### [stringTimes](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

```
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
```

### [frontTimes](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

```
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
```

### [countXX](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

```
countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
```

### [doubleX](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

```
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
```

### [stringBits](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

```
stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
```

### [stringSplosion](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a non-empty string like "Code" return a string like "CCoCodCode".

```
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
```

### [last2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

```
last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
```

### [arrayCount9](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, return the number of 9's in the array.

```
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
```

### [arrayFront9](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

```
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
```

### [array123](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

```
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
```

### [stringMatch](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

```
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
```

### [stringX](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

```
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
```

### [altPairs](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

```
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
```

### [stringYak](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

```
stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
```

### [array667](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

```
array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
```

### [noTriples](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

```
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
```

### [has271](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

```
has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
```

## String-I
### [helloName](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

```
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
```

### [makeAbba](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

```
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
```

### [makeTags](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

```
makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
```

### [makeOutWord](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given an "out" string length 4, such as "(())", and a word, return a new string where the word is in the middle of the out string, e.g. "((word))". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

```
makeOutWord("(())", "Yay") → "((Yay))"
makeOutWord("(())", "WooHoo") → "((WooHoo))"
makeOutWord("[[]]", "word") → "[[word]]"
```

### [extraEnd](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

```
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
```

### [firstTwo](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

```
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
```

### [firstHalf](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

```
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
```

### [withoutEnd](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

```
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
```

### [comboString](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

```
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
```

### [nonStart](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

```
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
```

### [left2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

```
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
```

### [right2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

```
right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
```

### [theEnd](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

```
theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
```

### [withouEnd2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

```
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
```

### [middleTwo](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

```
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
```

### [endsLy](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return true if it ends in "ly".

```
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
```

### [nTwice](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

```
nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
```

### [twoChar](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

```
twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
```

### [middleThree](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

```
middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
```

### [hasBad](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

```
hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
```

### [atFirst](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

```
atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
```

### [lastChars](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

```
lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
```

### [conCat](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

```
conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
```

### [lastTwo](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

```
lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
```

### [seeColor](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

```
seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
```

### [frontAgain](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

```
frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
```

### [minCat](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

```
minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
```

### [extraFront](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.

```
extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
```

### [without2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

```
without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
```

### [deFront](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

```
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
```

### [startWord](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

```
startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
```

### [withoutX](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

```
withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
```

### [withoutX2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

```
withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
```

## String-II
### [doubleChar](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given a string, return a string where for every char in the original, there are two chars.

```
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
```

### [countHi](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Return the number of times that the string "hi" appears anywhere in the given string.

```
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
```

### [catDog](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Return true if the string "cat" and "dog" appear the same number of times in the given string.

```
catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
```

### [countCode](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

```
countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
```

### [endOther](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

```
endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
```

### [xyzThere](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

```
xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
```

### [bobThere](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

```
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
```

### [xyBalance](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

```
xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
```

### [mixString](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

```
mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
```

### [repeatEnd](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

```
repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
```

### [repeatFront](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

```
repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
```

### [repeatSeparator](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

```
repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
```

### [prefixAgain](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

```
prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
```

### [xyzMiddle](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

```
xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
```

### [getSandwich](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

```
getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
```

### [sameStarChar](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

```
sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
```

### [oneTwo](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

```
oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
```

### [zipZap](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

```
zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
```

### [starOut](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

```
starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
```

### [plusOut](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

```
plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
```

### [wordEnds](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringII.scala)
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

```
wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
```

## Array-I

### [firstLast6](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

```
firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
```

### [sameFirstLast](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

```
sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
```

### [makePi](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

```
makePi() → [3, 1, 4]
```

### [commonEnd](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

```
commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
```

### [sum3](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints length 3, return the sum of all the elements.

```
sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
```

### [rotateLeft3](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

```
rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
```

### [reverse3](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

```
reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
```

### [maxEnd3](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

```
maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
```

### [sum2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

```
sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
```

### [middleWay](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

```
middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
```

### [makeEnds](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

```
makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
```

### [has23](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an int array length 2, return true if it contains a 2 or a 3.

```
has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
```

### [no23](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an int array length 2, return true if it does not contain a 2 or 3.

```
no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
```

### [makeLast](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

```
makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
```

### [double23](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

```
double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
```

### [fix23](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

```
fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
```

### [start1](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

```
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
```

### [biggerTwo](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.

```
biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
```

### [makeMiddle](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.

```
makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
```

### [plusTwo](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

```
plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
```

### [swapEnds](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

```
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
```

### [midThree](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.

```
midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
```

### [maxTriple](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

```
maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
```

### [frontPiece](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

```
frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
```

### [unlucky1](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

```
unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
```

### [make2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

```
make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
```

### [front11](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/ArrayI.scala)
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

```
front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
```

## Logic-I
### [cigarParty](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.

```
cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
```

### [dateFashion](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).

```
dateFashion(5, 10) → 2
dateFashion(5, 2) → 0
dateFashion(5, 5) → 1
```

### [squirrelPlay](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

```
squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true
```

### [caughtSpeeding](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

```
caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0
```

### [sortaSum](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.

```
sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
```

### [alarmClock](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

```
alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"
```

### [love6](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6.

```
love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
```

### [in1To10](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

```
in1To10(5, false) → true
in1To10(11, false) → false
in1To10(11, true) → true
```

### [specialEleven](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special.

```
specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
```

### [more20](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

```
more20(20) → false
more20(21) → true
more20(22) → true
```

### [old35](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Return true if the given non-negative number is a multiple of 3 or 5, but not both. 

```
old35(3) → true
old35(10) → true
old35(15) → false
```

### [less20](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.

```
less20(18) → true
less20(19) → true
less20(20) → false
```

### [nearTen](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

```
nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
```

### [teenSum](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.

```
teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
```

### [answerCell](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.

```
answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
```

### [teaParty](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

```
teaParty(6, 8) → 1
teaParty(3, 8) → 0
teaParty(20, 6) → 2
```

### [fizzString](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.

```
fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
```

### [fizzString2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?

```
fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"
```

### [twoAsOne](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

```
twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
```

### [inOrder](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.

```
inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true
```

### [inOrderEqual](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.

```
inOrderEqual(2, 5, 11, false) → true
inOrderEqual(5, 7, 6, false) → false
inOrderEqual(5, 5, 7, true) → true
```

### [lastDigit](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.

```
lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
```

### [lessBy10](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

```
lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
```

### [withoutDoubles](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.

```
withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6
```

### [maxMod5](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0.

```
maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3
```

### [redTicket](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.

```
redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5
```

### [greenTicket](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.

```
greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
```

### [blueTicket](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.

```
blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10
```

### [shareDigit](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. 

```
shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
```

### [sumLimit](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/LogicI.scala)
Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)

```
sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
```
