# Scala CodingBat
Solutions to CodingBat problems in Scala

## Index

1. [Warmup-I](https://github.com/codingkapoor/scala-coding-bat#warmup-i)
2. [Warmup-II](https://github.com/codingkapoor/scala-coding-bat#warmup-ii)
3. [String-I](https://github.com/codingkapoor/scala-coding-bat/blob/master/README.md#string-i)
4. [Array-I]()

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
